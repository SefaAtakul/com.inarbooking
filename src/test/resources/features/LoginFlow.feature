Feature: Target Market Login Process


  @example
  Scenario: Login with valid credentials
    Given the user on the Target Market Login Page
    When the user logs in with username and password
    Then the welcome message is displayed