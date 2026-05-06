Feature: Login Feature

  @ValidCredentials
  Scenario: Login with invalid credentials
    Given User is on Loginpage
    When user enter valid credentials
      | Admin | admin123 |
      | Admin | ad       |
    And User click  Login Button
    Then user should be able to login successfullyy and dashbard page open
