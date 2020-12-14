(ns advent-of-code.day-1
  (:require [advent-of-code.data-reader :as data-reader]))

(defn find-the-two-entries-that-results-in-2020
  [filename]
  (let [file-content (map #(Integer/parseInt %) (data-reader/read-input-file! filename))]
    (loop [elements    file-content
           first-entry (first elements)]
      (let [second-entry      (first (filter #(= (+ first-entry %) 2020) elements))
            has-second-entry? (boolean second-entry)]
        (if has-second-entry?
          (* first-entry second-entry)
          (do (let [filtered-elements (remove #{first-entry} elements)
                    next-tentative    (first filtered-elements)]
                (recur filtered-elements next-tentative))))))))

(time (find-the-two-entries-that-results-in-2020 "resources/day_1.input"))
