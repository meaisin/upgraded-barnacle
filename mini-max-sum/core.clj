(defn miniMaxSum
  "arr: a collection of exactly 5 integers."
  [arr]
  (let 
    [total (reduce + arr)
     min-el (apply min arr)
     max-el (apply max arr)]
    (print (str (- total max-el) " "))
    (println (- total min-el))))

(def arr
  (vec 
    (map 
      #(Integer/parseInt %) 
      (clojure.string/split 
        (clojure.string/trimr (read-line)) 
        #" "))))

(miniMaxSum arr)
(miniMaxSum2 arr)
