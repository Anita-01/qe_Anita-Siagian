Feature: Login
  As a user
  I want to see my home page

  Scenario: As user i have be able to success login
    Given I am on login page
    When I enter my username and password correctly
    And I click login button
    Then I am on the dashboard page