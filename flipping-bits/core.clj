(defn flippingBits
  [n]
  (bit-xor
    n
    0xFFFFFFFF))

(def q (Integer/parseInt (clojure.string/trim (read-line))))

(doseq [q-itr (range q)]
  (def n (Long/parseLong (clojure.string/trim (read-line))))
  (def result (flippingBits n))
  (println result))
