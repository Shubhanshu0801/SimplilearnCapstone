Feature: Carts page feature

  Background:
    Given user has already logged in
      |username|password|
      |shubhanshudubey91@gmail.com|Anshu@1004|
    And user is on accounts page
    And user enters "sports shoes" into the search box
    And user clicks on search button
    And user gets the list of search products


  Scenario: carts page test
    Given user adds the product into the cart
    Then user gets the title of the page
    And page title should be "PUMA Online Shop - Cart"
