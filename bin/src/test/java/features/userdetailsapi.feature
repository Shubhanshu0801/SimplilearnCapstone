Feature: Api Testing

  Background:
    Given user has already logged in
      |username|password|
      |shubhanshudubey91@gmail.com|Anshu@1004|
    Given user is on accounts page

  Scenario: Getting the user details
    When user gets the list of user details
    Then user first name should be "Shubhanshu"
    And user last name should be "Dubey"
