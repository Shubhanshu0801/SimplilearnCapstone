Feature: Api Testing

  Background:
    Given user has already logged in
      |username|password|
      |shubhanshudubey91@gmail.com|Anshu@1004|
    Given user is on accounts page
    When user enters "sports shoes" into the search box
    And user clicks on search button

  Scenario: Getting the list of products
    Given user enters required headers and payloads
    Then user gets valid http response code 200
    When user gets list of products

