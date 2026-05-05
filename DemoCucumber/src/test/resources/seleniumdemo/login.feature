Feature: Log in to DemoBlaze
description: user in logging with username and password

  Background:
    Given User in the home page click the login link button

  @ValidCredentials
  Scenario: Login with valid credentials
    When The user enters the username as "TamilKumar"
    And enter the password as "Kiot1234"
    And click the login Button
    Then user should be able to login successfully with usename

  @InValidCredentials
  Scenario: Login with in valid credentials
    When The user enters the valid username as "TamilKumar"
    And enter the invalid password as "Kiot14"
    And click the login Button
    Then it shows an alert message

 
