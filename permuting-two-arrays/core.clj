(defn twoArrays
  [k A B]
  (loop
    [[a & rest-a] (sort A)
     [b & rest-b] ((comp reverse sort) B)]
    (cond
      (nil? a) "YES"
      (>= (+ a b) k) (recur rest-a rest-b)
      :else "NO")))
