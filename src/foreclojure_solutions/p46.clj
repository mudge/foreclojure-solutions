(ns foreclojure-solutions.p46
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Flipping out"
  3 => ((__ nth) 2 [1 2 3 4 5])
  true => ((__ >) 7 8)
  4 => ((__ quot) 2 8)
  [1 2 3] ((__ take) [1 2 3 4 5] => 3))
