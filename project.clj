(defproject matthiasn/systems-toolbox-metrics "0.5.3"
  :description "Basic JVM stats for systems-toolbox apps"
  :url "https://github.com/matthiasn/systems-toolbox"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :source-paths ["src/clj" "src/cljs" "src/cljc"]

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.reader "1.0.0-beta1"]
                 [org.clojure/clojurescript "1.8.40"]
                 [org.ow2.asm/asm-all "5.1"]
                 [org.clojure/core.async "0.2.374" :exclusions [org.clojure/tools.reader]]
                 [matthiasn/systems-toolbox-ui "0.5.7"]
                 [org.clojure/tools.logging "0.3.1"]
                 [io.aviso/pretty "0.1.25"]
                 [com.lucasbradstreet/cljs-uuid-utils "1.0.2"]]

  :plugins [[lein-codox "0.9.4" :exclusions [org.clojure/clojure]]
            [lein-cljsbuild "1.1.3"]])
