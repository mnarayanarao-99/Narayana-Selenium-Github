Feature: FB login test

  Scenario: Facebook login testing with invalid test data
    Given Open FB URL on any browser
    When User type invalid UN and PSWD
    And Click on Login button
    Then Check error message has displayed or not
