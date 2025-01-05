Feature: New Customer


  Scenario: Add new customer
  Given setUp
    Given User enters credentials
   When User enters email and Password
    Then User clicks on Login
    
    And Close browser
   	
