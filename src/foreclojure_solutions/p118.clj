(ns foreclojure-solutions.p118
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Re-implement Map"
  [3 4 5 6 7] => (__ inc [2 3 4 5 6])
  (repeat 10 nil)
     (__ (fn [_] nil) => (range 10))
  [1000000 1000001] => (->> (__ inc (range))
          (drop (dec 1000000))
          (take 2)))
