(defn plusMinus
  "arr: a collection of numbers."
  [arr]
  (let [{p :p
         n :n
         z :z} ((fn [arr] (reduce #(update %1 (cond (> %2 0) :p (< %2 0) :n (= %2 0) :z) inc) {:p 0 :n 0 :z 0} arr)) arr)] 
    (println (format "%.6f" (float (/ p (+ p n z)))))
    (println (format "%.6f" (float (/ n (+ p n z)))))
    (println (format "%.6f" (float (/ z (+ p n z))))))
  )

(def n (Integer/parseInt (clojure.string/trim (read-line))))
(def arr (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trim (read-line)) #" "))))

(plusMinus arr)
