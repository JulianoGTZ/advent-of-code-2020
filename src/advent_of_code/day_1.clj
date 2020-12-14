(ns advent-of-code.day-1
  (:require [advent-of-code.data-reader :as data-reader]))

(defn find-the-two-entries-that-sums-2020
  [filename]
  (let [file-content (seq (map #(Integer/parseInt %) (data-reader/read-input-file! filename)))]
    (loop [elements  file-content
           tentative (first elements)]
      (let [second-portion    (first (filter #(= (+ tentative %) 2020) elements))
            filtered-elements (remove #{tentative} elements)
            match-condition?  (boolean second-portion)]
        (if match-condition?
          (* tentative second-portion)
          (recur filtered-elements (first filtered-elements)))))))

(find-the-two-entries-that-sums-2020 "resources/day_1.input")