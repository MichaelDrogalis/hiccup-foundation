(ns hiccup.foundation.page
  (:require [hiccup.page :refer :all]))

(defn include-foundation
  "Add Foundation CSS and JS resources to the page."
  []
  (list
   (include-css "/foundation/css/app.css")
   (include-css "/foundation/css/foundation.css")
   (include-js "/foundation/js/foundation.min.js")
   (include-js "/foundation/js/app.js")
   (include-js "/foundation/js/jquery.foundation.accordion.js")
   (include-js "/foundation/js/jquery.foundation.alerts.js")
   (include-js "/foundation/js/jquery.foundation.buttons.js")
   (include-js "/foundation/js/jquery.foundation.forms.js")
   (include-js "/foundation/js/jquery.foundation.mediaQueryToggle.js")
   (include-js "/foundation/js/jquery.foundation.navigation.js")
   (include-js "/foundation/js/jquery.foundation.orbit.js")
   (include-js "/foundation/js/jquery.foundation.reveal.js")
   (include-js "/foundation/js/jquery.foundation.tabs.js")
   (include-js "/foundation/js/jquery.foundation.tooltips.js")
   (include-js "/foundation/js/jquery.foundation.topbar.js")
   (include-js "/foundation/js/jquery.js")
   (include-js "/foundation/js/jquery.placeholder.js")
   (include-js "/foundation/js/modernizr.foundation.js")))

(defn fixed-layout
  "Encase its contents in a layout container."
  [& content]
  [:div.container content])