(ns advent-of-code.day_1_test
  (:require [clojure.test :refer :all]
            [advent-of-code.day-1 :as day-1]))

(deftest find-the-two-entries-that-sums-2020
  (testing "Should return "
    (is (= (day-1/find-the-two-entries-that-results-in-2020 "test/fixtures/day_1_test.input") 514579))))
