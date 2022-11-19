#Author: your.email@your.domain.com
Feature: Mobile
 Background:
 		Given user login to flipkart
  Scenario: Mobile
    When user search mobile
    And user choose the mobile
    And user doing payment by using UPI
    Then user receiving confirmation message
    
    
    
  Scenario: Mobile by one dim
    
    When user search mobile using oneD list
    			|realme|Samsung|
    And user choose the mobile
    And user doing payment by using UPI
    Then user receiving confirmation message
    
      
  Scenario: Mobile by one dim
    
    When user search mobile using oneD map
    |phone1|realme|
    |phone2|Samsung|
    And user choose the mobile
    And user doing payment by using UPI
    Then user receiving confirmation message
    
   @tv 
   Scenario Outline: Mobilemap
    When user search mobile "<phone>"
    And user choose the mobile
    And user doing payment by using UPI
    Then user receiving confirmation message
    
    Examples:
    |phone|
    |realme|
    |Samsung|
    
    
    
    
    
    

