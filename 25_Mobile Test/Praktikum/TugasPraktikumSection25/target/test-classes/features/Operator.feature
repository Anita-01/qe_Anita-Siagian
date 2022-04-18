Feature: Calculator

  @add
  Scenario: As a User, I have be able to add whole numbers
    Given user on calculator page
    When user click the first number
    And user click the add operation
    And user click the second number
    And user click equal to operation
    Then user get the result

  @minus
  Scenario: As a User, I have be able to minus whole numbers
    Given user on calculator page for minus
    When user click the first number for minus
    And user click the minus operation
    And user click the second number for minus
    And user click equal to operation for minus
    Then user get the result for minus

  @divide
  Scenario: As a User, I have be able to divide whole numbers
    Given user on calculator page for divide
    When user click the first number for divide
    And user click the divide operation
    And user click the second number for divide
    And user click equal to operation for divide
    Then user get the result for divide

  @multiplication
  Scenario: As a User, I have be able to multiplication whole numbers
    Given user on calculator page for multiplication
    When user click the first number for multiplication
    And user click the multiplication operator
    And user click the second number for multiplication
    Then user click equal to operation for multiplication