(ns advent-of-code.core-test
  (:require [clojure.test :refer :all]
            [advent-of-code.day-1 :as day-1]))

(deftest find-the-two-entries-that-sums-2020
  (testing "Should return "
    (is (= day-1/find-the-two-entries-that-results-in-2020 514579))))
