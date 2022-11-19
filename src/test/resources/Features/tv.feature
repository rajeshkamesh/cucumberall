#Author: your.email@your.domain.com


Feature: Tv
Background:
 		Given user login to flipkart
 		
 	 Scenario: Tv
    When user search tv
    And user choose the tv
    And user doing payment by using UPI
    Then user receiving confirmation message
    
    
    Scenario: Tv by one dim
    When user search tv using oneD list
    			|Philips|Samsung|
    And user choose the tv
    And user doing payment by using UPI
    Then user receiving confirmation message
    
    
     Scenario Outline: Mobilemap
    When user search tv "<tv>"
    And user choose the tv
    And user doing payment by using UPI
    Then user receiving confirmation message
    
    Examples:
    |tv|
    |Philips tv|
    |Samsung tv|
    
    
    
    
    