(ns foreclojure-solutions.p79
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Triangle Minimal Path"
  7 => (__ '([1]
            [2 4]
           [5 1 4]
          [2 3 4 5]))
  20 => (__ '([3]
             [2 4]
            [1 9 3]
           [9 9 2 4]
          [4 6 6 7 8]
         [5 7 3 5 1 4])))
