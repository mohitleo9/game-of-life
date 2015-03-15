(ns game-of-life.core)

(defn create-matrix
  "given dimensions m and n, this function creates m x n matrix with all nils"
  [m n]
  (vec (repeat m (vec (repeat n nil)))))

(defn init-matrix
  "given an empty matrix (all nils) and a set of cell inices this returns a matrix with those inices set to :on"
  [matrix cells]
  (reduce (fn [new-matrix cell]
            (assoc-in new-matrix cell :on)) matrix cells))

;; (defn neighbors
;;   "given a matrix and a cell indexes, this function returns the neighbors this cell has.")

(defn test-main
  "used only for debugging purposes."
  []
  (let [m (create-matrix 4 4)]
    (init-matrix m [[0 0] [1 1]])))

(test-main)
