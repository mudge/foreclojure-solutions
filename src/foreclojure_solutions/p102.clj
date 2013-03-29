(ns foreclojure-solutions.p102
  (:use midje.sweet))

(defn __ [s]
  (reduce #(if (seq %)
               (str % (clojure.string/capitalize %2))
               %2)
          (clojure.string/split s #"-")))

(fact "intoCamelCase"
  (__ "something") => "something"
  (__ "multi-word-key") => "multiWordKey"
  (__ "leaveMeAlone") => "leaveMeAlone")
