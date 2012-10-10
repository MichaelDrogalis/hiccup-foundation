(ns hiccup.foundation.middleware
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defn wrap-foundation-resources
  "Add Foundation resources to the handler."
  [handler]
  (routes
   (route/resources "/foundation" {:root "foundation/public"})
   handler))

