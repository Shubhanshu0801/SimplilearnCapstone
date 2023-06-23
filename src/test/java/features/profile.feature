Feature: Profile page feature

  Background:
    Given user has already logged in
      |username|password|
      |shubhanshudubey91@gmail.com|Anshu@1004|
    Given user is on accounts page

  Scenario: profile page test
    When user clicks on edit profile link
    And  user is on profile page
    Then page title should be "PUMA Online Shop - Edit Profile"
    When user edits first name "Tim" last name "David"
    And user clicks on back save button
    Then user gets back on accounts page and can see the changes