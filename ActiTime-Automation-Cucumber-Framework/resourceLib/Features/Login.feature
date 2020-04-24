@FunctionalTest
Feature: Login to ActiTime Application and Validate Enter Time-Track heading should be available

	

  @SmokeTest @RegrassionTest
  Scenario: Login to ActiTime Application
    Given I want Login to the application
    And I Provide valid userName and passWord
      | Admin | manager |
    Then I want to click on "Login" button
    And I validate "Enter Time-Track" Text
    And I validate "Create New Tasks" Textfield
    And I logout the application