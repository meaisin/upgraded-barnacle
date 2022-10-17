(defn lonelyinteger
  [a]
  (loop
    [[head & rest] a]
    (if 
      (= (count (filter #(= % head) rest)) 0)
      head
      (recur (filter #(not= % head) rest)))))

(def n (Integer/parseInt (clojure.string/trim (read-line))))

(def a (vec (map #(Integer/parseInt %) (clojure.string/split (clojure.string/trimr (read-line)) #" "))))

(def result (lonelyinteger a))

(println result)
