(ns timer.core
  (:gen-class))

(defn run-timer
  "Runs the timer"
  [seconds]
  (println seconds)
  (when (> seconds 0)
    (do
      (Thread/sleep 1000)
      (run-timer (- seconds 1)))))

(defn get-user-input
  "Gets number of seconds for the timer"
  []
  (println "Enter the time in seconds:")
  (Integer/parseInt (clojure.string/trim (read-line))))

(defn start-timer
  "Stars a new timer"
  []
  (let [input (get-user-input)]
    (println "Go for a run now!!")
    (run-timer input)
    (println "Timer complete")))

(defn -main
  [& args]
  (start-timer))
