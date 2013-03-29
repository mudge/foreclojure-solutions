(ns foreclojure-solutions.p45
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Iterate"
  __ => (take 5 (iterate #(+ 3 %) 1)))
