Feature: Login page feature

  Scenario: Login page test
    Given user is on login page
    Then page title should be "PUMA Online Shop - Account Login"
    When user enters username "shubhanshudubey91@gmail.com"
    And user enters password "Anshu@1004"
    And user clicks on login button