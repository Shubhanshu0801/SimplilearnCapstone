Feature: Account page feature

  Background:
    Given user has already logged in
    |username|password|
    |shubhanshudubey91@gmail.com|Anshu@1004|

  Scenario: Accounts page search
    Given user is on accounts page
    When user gets the title of the page
    Then page title should be "PUMA Online Shop - Account Login"
    When user enters "sports shoes" into the search box
    And user clicks on search button