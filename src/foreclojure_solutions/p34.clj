(ns foreclojure-solutions.p34
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Implement range"
  (__ 1 4) => '(1 2 3)
  (__ -2 2) => '(-2 -1 0 1)
  (__ 5 8) => '(5 6 7))
