(ns app.macros
  (:require [cljs.core]))

#_(defmacro reverse [str]
  (list reverse ~'str))

(defmacro reverse [arg]
  `(cljs.core/reverse ~arg))
