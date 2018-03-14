(ns app.core
  (:require [camel-snake-kebab.core :as camel-kebab]
            [clojure.string :as string]
            ["left-pad" :as leftpad])
  (:require-macros [app.macros :as macros]))

(defn start []
  (prn (-> "dlroWolleh"
                      macros/reverse
                      string/join
                      camel-kebab/->kebab-case
                      (leftpad 17 0) )))

(defn stop []
  (js/console.log "stop"))

(defn ^:export init []
  (js/console.log "init")
  (start))
