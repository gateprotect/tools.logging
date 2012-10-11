(defproject com.gateprotect/tools.logging "1.0.0"
  :description "AOT repackaged tools.logging library"
  :url "https://github.com/gateprotect/tools.logging"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :aot [#"^clojure.tools.logging.*"]
  :source-paths ["src/main/clojure"]
;;  :jar-exclusions [#"^clojure.core.*"]
)
