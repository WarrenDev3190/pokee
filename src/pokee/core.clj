(ns pokee.core
  (:use [clojure.tools.cli :only (cli)])
  (:require [clojure.java.io :as io])
  (:gen-class :main true))

(defn splitter
  "Takes a string:sentence and splits on whitespace ignoring special characters."
  [string]
  (clojure.string/split string #"\s|\W"))

(defn count-it-up
  "Takes a vector of keywords and returns maps our word counts"
  [string-vec]
  (reduce (fn [counts word]
          (assoc counts word (inc (counts word 0)))) {} string-vec))

(defn word-count
  "Takes a given string:sentence and returns map of word and given word count"
  [string]
  (->> string
       splitter
       (map keyword)
       count-it-up))

(defn -main
  "This is the application's main function."
  [& args]
  (let [[opts _ banner]
        (cli args
             ["-s" "--string" "REQUIRED: String needed for parsing"])]
    (if (:string opts)
      (println (word-count (:string opts)))
      (do
        (println banner)
        (System/exit 0)))))
