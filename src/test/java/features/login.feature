Feature: Application Login

  Background:
    Given user is on landing page

  Scenario: Home page default login
    When user login into application with "jin" and "1234"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    When user login into application with "john" and "4321"
    Then Home page is populated
    And Cards displayed are "false"

  Scenario: Home page default login
    When User sign up with following details
    |Jenny|abcd|j@abcd.com|Australia|3242353|
    Then Home page is populated
    And Cards displayed are "false"

  Scenario Outline: Home page default login
    When User sign up with following details
      |Jenny|abcd|j@abcd.com|Australia|3242353|
    Then Home page is populated
    And Cards displayed are "false"
    Examples:
      |  |