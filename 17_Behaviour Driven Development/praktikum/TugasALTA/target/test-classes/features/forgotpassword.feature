Feature: ForgotPassword
  As a user
  I want to reset my password
  So that I can login

  Scenario: As user i have be able to success reset password
    Given I am on forgot password page
    When I enter my email or numberhandphone is correct
    And I click login button
    Then I am on the home page