(ns pages.index
  (:require
   [components.header :refer [header]]
   [components.summary :refer [summary]]
   [components.experience :refer [experience]]))

(def links-map
  [{:img "resources/public/linkedin.png"
    :text "linkedin"
    :url "https://www.linkedin.com/in/vitor-marques-73b8991a9/"}
   {:img "resources/public/github.png"
     :text "github"
     :url "https://github.com/VMarkz"}])

(def summary-list
  [{:item "Completing 1 year of development with Clojure(Script)."}
   {:item "Comfortable with REPL Driven Development."}
   {:item "Development of Rest APIs with (Clojure/Java(Spring Boot))"}
   {:item "Use of Datomic, Postgresql, SqlServer."}
   {:item "Internerization with Docker and Kubernets."}
   {:item "CI and CD with GitHub Actions."}
   {:item "Learning to implement web interfaces with Clojure Scrpit."}
   {:item "Use of React, Reagent."}])

(def experiences-map
  [{:start-date "Sep. 2020"
    :end-date "Present"
    :role "BackEnd Developer"
    :company "PayGo Pagamentos, São Paulo."
    :experiences [{:experience "Backend development with Clojure and ClojureScript."}
                  {:experience "CI/CD with GitHub Actions"}]}])

(defn index []
  [:div [:div.container
         [header links-map]
         [:div
          [summary summary-list]
          [experience experiences-map]]]])
