(ns foreclojure-solutions.p50
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Split by Type"
  (set (__ [1 :a 2 :b 3 :c])) => #{[1 2 3] [:a :b :c]}
  (set (__ [:a "foo"  "bar" :b])) => #{[:a :b] ["foo" "bar"]}
  (set (__ [[1 2] :a [3 4] 5 6 :b])) => #{[[1 2] [3 4]] [:a :b] [5 6]})
