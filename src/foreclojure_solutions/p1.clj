(ns foreclojure-solutions.p1
  (:use midje.sweet))

(def __ true)

(fact "Nothing but the Truth"
  __ => true)
