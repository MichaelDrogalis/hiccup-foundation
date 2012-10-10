# hiccup-foundation

[Zurb Foundation](http://foundation.zurb.com/) in [Hiccup](https://github.com/weavejester/hiccup). This is basically a replica of [hiccup-bootstrap](https://github.com/weavejester/hiccup-bootstrap), except with my favorite CSS framework. Credit to [weavejester](https://github.com/weavejester).

## Installation

    [hiccup-foundation "0.1.0"]

## Usage

Add the `wrap-foundation-resources` middleware to your handler to
automatically add routes for the various Foundation CSS, image and JS
files:

```clojure
(:require [hiccup-foundation.middlware :refer :all])

(def app
  (wrap-foundation-resources handler))
```

Then in your Hiccup template, add in `include-bootstrap` in the page
header:

```clojure
(:require [hiccup.core :refer :all]
          [hiccup.page :refer :all]
          [hiccup-foundation.page :refer all])
     
(defn page []
  (html5
    [:head
      [:title "Foundation Example"]
      (include-foundation)]
    [:body
      [:h1 "Foundation Example"]]))
```

## License

Copyright © 2012 Michael Drogalis

Distributed under the Eclipse Public License, the same as Clojure.
