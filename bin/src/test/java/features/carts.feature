Feature: Carts page feature

  Background:
    Given user has already logged in
      |username|password|
      |shubhanshudubey91@gmail.com|Anshu@1004|
    Given user is on accounts page


  Scenario: carts page test
    When user clicks on carts link
    And user gets the title of the carts page
    Then page title should be ""