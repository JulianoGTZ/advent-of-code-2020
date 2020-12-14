(ns advent-of-code.day-1
  (:require [advent-of-code.data-reader :as data-reader]))

(defn find-the-two-entries-that-results-in-2020
  [filename]
  (let [file-content (map #(Integer/parseInt %) (data-reader/read-input-file! filename))]
    (loop [elements  file-content
           tentative (first elements)]
      (let [second-portion    (first (filter #(= (+ tentative %) 2020) elements))
            match-condition?  (boolean second-portion)]
        (if match-condition?
          (* tentative second-portion)
          (do (let [filtered-elements (remove #{tentative} elements)
                    next-tentative (first filtered-elements)]
               (recur filtered-elements next-tentative))))))))

(time (find-the-two-entries-that-results-in-2020 "resources/day_1.input"))
