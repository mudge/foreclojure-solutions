(ns foreclojure-solutions.p173
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Intro to Destructuring 2"
  (= 3
    (let [[__] [+ (range 3)]] (apply __))
    (let [[[__] b] [[+ 1] 2]] (__ b))
    (let [[__] [inc 2]] (__))) => true)
