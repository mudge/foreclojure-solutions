(ns foreclojure-solutions.p48
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to some"
  __ => (some #{2 7 6} [5 6 7 8])
  __ => (some #(when (even? %) %) [5 6 7 8]))
