(defn matchingStrings
  [strings queries]
  (map 
    (fn 
      [q] 
      (count (filter #(= q %) strings))) 
    queries))

(def strings-count (Integer/parseInt (clojure.string/trim (read-line))))

(def strings [])

(doseq [_ (range strings-count)]
  (def strings (conj strings (read-line))))

(def queries-count (Integer/parseInt (clojure.string/trim (read-line))))

(def queries [])

(doseq [_ (range queries-count)]
  (def queries (conj queries (read-line))))

(def res (matchingStrings strings queries))

(println res)
