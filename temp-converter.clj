(defn multi [a b] (* a b))
(defn sum [a b] (+ a b))
(defn subt [a b] (- a b))

(defn f-to-c [temp] (sum 32 (multi temp 1.8)))
(defn c-to-f [temp] (multi 5/9 (subt temp 32)))
