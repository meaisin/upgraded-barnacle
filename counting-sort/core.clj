(defn countingSort
  [arr]
  (let
    [max-in-arr (apply max arr)
     counts (vec (repeat (inc max-in-arr) 0))]
    (reduce
      (fn
        [cs el]
        (update cs el inc))
      counts
      arr)))
