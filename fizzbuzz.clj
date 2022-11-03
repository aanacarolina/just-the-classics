;Write a short program that prints each number from 1 to 100 on a new line. 

;For each multiple of 3, print "Fizz" instead of the number. 

;For each multiple of 5, print "Buzz" instead of the number. 

;For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.


(defn fizz?
  [n]
  (= 0 (mod n 3)))

(defn buzz?
  [n]
  (= 0 (mod n 5)))

(defn fizzbuzz-decider
  [num]
  (cond
    (and (fizz? num) (buzz? num)) "FizzBuzz"
    (fizz? num) "Fizz"
    (buzz? num) "Buzz"
    :else num))

(defn fizzbuzz
  [num]
  (doseq [x (map fizzbuzz-decider (range 1 (+ num 1)))] (println x)))
