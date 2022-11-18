#Author: your.email@your.domain.com

Feature: Facebook signup
 Background:
		Given open page
		
  Scenario: facebook
    
    And enter signup page
    When user input name 
    And user input email and password
    And user input date of birth and gender
    Then complete sigup 
    
    Scenario: facebook
    
    And enter signup page
    When user input name  using oneD list
    |Rajesh|kumar|
    And user input email and password using oneD list
    |Rajeshkumar123@gmail.com|Rajeshkumar123@gmail.com|rajesh|
    And user input date of birth and gender
    Then complete sigup 
    
    