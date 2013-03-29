(ns foreclojure-solutions.p10
  (:use midje.sweet))

(def __ 20)

(fact "Intro to Maps"
  __ => ((hash-map :a 10, :b 20, :c 30) :b)
  __ => (:b {:a 10, :b 20, :c 30}))
