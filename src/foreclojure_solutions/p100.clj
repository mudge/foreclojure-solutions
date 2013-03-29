(ns foreclojure-solutions.p100
  (:use midje.sweet))

(def __
  (letfn [(gcd [a b] (if (zero? b) a (recur b (mod a b))))
          (lcm [a b] (/ (* a b) (gcd a b)))]
    #(reduce lcm %&)))

(fact "Least Common Multiple"
  (__ 2 3) => 6
  (__ 5 3 7) => 105
  (__ 1/3 2/5) => 2
  (__ 3/4 1/6) => 3/2
  (__ 7 5/7 2 3/5) => 210)
