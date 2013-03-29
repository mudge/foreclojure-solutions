(ns foreclojure-solutions.p60
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Sequence Reductions"
  (take 5 (__ + (range))) => [0 1 3 6 10]
  (__ conj [1] [2 3 4]) => [[1] [1 2] [1 2 3] [1 2 3 4]]
  (= (last (__ * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120) => true)
