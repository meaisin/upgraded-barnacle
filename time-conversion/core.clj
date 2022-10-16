(defn timeConversion
  [s]
  (let
    [prefix (subs s 0 2)
     suffix (subs s 8)
     constant (subs s 2 8)]
    (cond
      (and 
        (= suffix "PM") 
        (not= prefix "12")) 
      (str (+ (Integer/parseInt prefix) 12) constant)
      (and 
        (= suffix "AM") 
        (= prefix "12")) 
      (str "00" constant)
      :else 
      (str prefix constant)
      )
    )
  )

(def s (read-line))

(def result (timeConversion s))

(println result)
