Feature: User
  As an admin
  I want to see list of name
  So that i can create new name

  Scenario: GET - As admin I have be able to get detail name
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail name