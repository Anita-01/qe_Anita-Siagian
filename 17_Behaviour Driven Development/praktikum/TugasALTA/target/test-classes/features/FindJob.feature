Feature: FindJob
  As a user
  I want to see the job in linkedin
  So that I can find job

  Scenario: As user i have to find job in linkedin
    Given I am on homepage page
    And I am click button homepage
    Then I am find job page
    And I am click Free Job Posting
    Then I am write a form job posting
    And I click button submit
