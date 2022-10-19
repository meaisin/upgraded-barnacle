(defn diagonalDifference
  [arr]
  (loop [
         i 1
         j (count arr)
         diff 0]
    (if
      (= j 0)
      (abs diff)
      (recur
        (+ i 1)
        (- j 1)
        (let 
          [i' (- i 1)
           j' (- j 1)] 
          (+ (- (get-in arr [i' i']) (get-in arr [i' j'])) diff))))))

(def n (Integer/parseInt (clojure.string/trim (read-line))))

(def arr [])

(doseq [_ (range n)]
    (def arr (conj arr (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #" "))))))

(def result (diagonalDifference arr))

(println result)
