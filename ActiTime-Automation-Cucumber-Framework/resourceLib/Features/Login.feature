Feature: Login to ActiTime Application and Validate Enter Time-Track heading should be available

  @SmokeTest @RegrassionTest
  Scenario: Login to ActiTime Application
    Given I want Login to the application
    And I Provide valid userName and passWord
      | Admin | manager |
    Then I want to click on "Login" button
    And I validate "Enter Time-Track" Text
    And validate "Create New Tasks" Textfield
    Then Click on close task
    And Logout from ActiTime application

  @FunctionalTest @SmokeTest
  Scenario Outline: Select four Customer and  four Project to Add Tasks for
    Given I want Login to the application
    And I Provide valid userName and passWord
      | Admin | manager |
    Then I want to click on "Login" button
    And I validate "Enter Time-Track" Text
    And validate "Create New Tasks" Textfield
    Then Validate "Select Customer and Project to Add Tasks for" Text
    And Create <Customer> , <CustomerName> , <ProjectName>, <TaskName1> and <TaskName2>
		
    Examples: 
      |Customer  			 |CustomerName     |ProjectName        |TaskName1  |TaskName2  		 |
      |- New Customer -|MLBProject56 		 |Foundation  			 |SmokeTest  |RegressionTest |
      |- New Customer -|Q&EProject78     |OA2Project         |SanityTest |FunctionalTest |
      
