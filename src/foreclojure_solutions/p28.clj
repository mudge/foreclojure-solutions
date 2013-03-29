(ns foreclojure-solutions.p28
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Flatten a Sequence"
  (__ '((1 2) 3 [4 [5 6]])) => '(1 2 3 4 5 6)
  (__ ["a" ["b"] "c"]) => '("a" "b" "c")
  (__ '((((:a))))) => '(:a))
