(ns advent-of-code.data-reader)

(defn read-input-file!
  [filename]
  (with-open [reader (clojure.java.io/reader filename)]
    (let [content (reduce conj [] (line-seq reader))]
      content)))
