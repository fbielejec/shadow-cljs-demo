(defproject shadow-cljs-demo "1.0.0-SNAPSHOT"
  :description "demo app"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[camel-snake-kebab "0.4.0"]
                 [org.clojure/clojurescript "1.10.145"]]
  :exclusions [[org.clojure/clojurescript]
               [org.clojure/clojure]]
  :source-paths ["src" "test"]
  :clean-targets ^{:protect false} ["target"]
  :profiles {:dev {:source-paths ["dev"]
                   :dependencies [[thheller/shadow-cljs "2.2.8"]
                                  [org.clojure/clojure "1.9.0"]]
                   :plugins [[cider/cider-nrepl "0.16.0"]]
                   :repl-options {:init-ns ^:skip-aot user
                                  :nrepl-middleware [shadow.cljs.devtools.server.nrepl/cljs-load-file
                                                     shadow.cljs.devtools.server.nrepl/cljs-eval
                                                     shadow.cljs.devtools.server.nrepl/cljs-select]}}})
