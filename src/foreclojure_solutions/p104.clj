(ns foreclojure-solutions.p104
  (:use midje.sweet))

(def __
  (let [conversions [[1000 "M"] [900 "CM"] [500 "D"] [400 "CD"] [100 "C"]
                     [90 "XC"] [50 "L"] [40 "XL"] [10 "X"] [9 "IX"] [5 "V"]
                     [4 "IV"] [1 "I"]]]
    (fn roman [a]
      (if (zero? a)
          ""
          (let [[a', r] (first (filter (fn [[a'' _]] (<= a'' a)) conversions))]
            (str r (roman (- a a'))))))))

(fact "Write Roman Numerals"
  "I" => (__ 1)
  "XXX" => (__ 30)
  "IV" => (__ 4)
  "CXL" => (__ 140)
  "DCCCXXVII" => (__ 827)
  "MMMCMXCIX" => (__ 3999)
  "XLVIII" => (__ 48))
