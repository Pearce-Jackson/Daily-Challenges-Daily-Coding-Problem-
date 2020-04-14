(ns pair-exists.core
  (:gen-class))


(defn find-the-pair
  [k numbers]
  (loop [remaining-numbers numbers]
    (if (empty? remaining-numbers)
      false
      (let [[number & remaining-numbers] remaining-numbers]
        (if (some #(= (- k number) %) remaining-numbers)
          true
          (recur remaining-numbers))))))

(defn -main
  "I find if a magic pair exists."
  [& args
    (print (find-the-pair 10 [-4 5 2 7 9 1]))])
    
  
  





