(defn pangrams
  [s]
  ((comp
     #(if (= % 26) "pangram" "not-pangram")
     count
     set
     #(clojure.string/replace % #"[^a-z]" "")
     clojure.string/lower-case) s))
