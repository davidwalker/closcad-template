(ns part
  (:require
   [clojure.core.matrix :as m]
   [closcad.core :as scad]
   [closcad.utils :as u]))

(def globals
  {:$fa 5
   :$fs 0.7})

(do
  (defn my-part []
    [:cube 20])

  (def everything [globals [my-part]])

  (u/write "output/part.scad" everything)

  #_(u/to-stl "output/part.stl" everything))
