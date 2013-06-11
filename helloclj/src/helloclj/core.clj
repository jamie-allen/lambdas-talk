(ns helloclj.core
    (:gen-class))
(defn -main[] 
	(println "Start")
	(map #(/ % 0) [1, 2, 3])
	(println "DONE"))
