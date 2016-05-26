(ns pokee.core-test
  (:require [clojure.test :refer :all]
            [pokee.core :refer :all]))
(deftest splitter-test
  (testing "String Splitting"
    (is (= (splitter "Hello World") ["Hello" "World"])))

  (testing "String splitting, ignores special characters"
    (is (= (splitter "Hello World!") ["Hello" "World"]))))

(deftest count-it-up-test
  (testing "Returns vector of words as keywords associated with counts"
    (is (= (count-it-up [:Hello :Hello :World]) {:Hello 2 :World 1}))))

(deftest word-count-test
  (testing "Returns appropriate word count"
    (is (= (word-count "Hello Hello World!") {:Hello 2 :World 1}))))

