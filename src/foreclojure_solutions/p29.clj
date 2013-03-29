(ns foreclojure-solutions.p29
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Get the Caps"
  (__ "HeLlO, WoRlD!") => "HLOWRD"
  (empty? (__ "nothing")) => true
  (__ "$#A(*&987Zf") => "AZ")
