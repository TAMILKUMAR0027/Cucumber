Feature: Login Feature

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    Given User is on HomePage
    When User enters username as "<username>" and password as "<password>"
    And User click the Login Button
    Then User should be able to see "<errorMessage>"

    Examples:
      | username | password | errorMessage        |
      | Admin    | admin1   | Invalid credentials |
      |          | admin123 | username required   |
      | Admin    |          | Required            |
