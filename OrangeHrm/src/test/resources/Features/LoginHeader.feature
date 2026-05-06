Feature: Login Feature

  @Multiple_Inputs
  Scenario: Login with invalid credentials
    Given User is HRMLogin page
    Then User enters invalid credentials and login unsuccessfull
      | Username | Password | ErrorMessage        |
      | Admin1   | admin123 | Invalid credentials |
      | Adm      | admin123 | Invalid credentials |
