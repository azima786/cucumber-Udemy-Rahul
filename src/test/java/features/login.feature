Feature: Application Login

  Background:
    Given validate the browser
    When Browser is triggered
    Then check if the browser is started
    And user is on landing page

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
    When user login in to application with <Username> and <password>
    Then Home page is populated
    And Cards displayed are "false"
    Examples:
      | Username | password|
      |  user1   |  pass1  |
      |  user2   |  pass2  |
      |  user3   |  pass3  |
      |  user4   |  pass4  |