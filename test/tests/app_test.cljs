(ns tests.app-test
  (:require [cljs.test :as cljs-test :refer [deftest testing is]]))

(deftest first-test
  (testing "hello world test"
    (is (= 1 1))))
