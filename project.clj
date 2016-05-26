(defproject pokee "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-kafka "0.3.4"]
                 [org.clojure/tools.cli "0.2.1"]]
  :main pokee.core
  :aot [pokee.core])
