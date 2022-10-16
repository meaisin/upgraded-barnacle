(defn plusMinus
  "arr: a collection of numbers."
  [arr]
  (let [{p :p
         n :n
         z :z} ((fn [arr] (reduce #(update %1 (cond (> %2 0) :p (< %2 0) :n (= %2 0) :z) inc) {:p 0 :n 0 :z 0} arr)) arr)
        total (+ p n z)] 
    (println (format "%.6f" (float (/ p total))))
    (println (format "%.6f" (float (/ n total))))
    (println (format "%.6f" (float (/ z total)))))
  )

(def n (Integer/parseInt (clojure.string/trim (read-line))))
(def arr (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trim (read-line)) #" "))))

(plusMinus arr)
