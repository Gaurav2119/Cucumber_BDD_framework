@SearchTest
Feature: Amazon Product Search

Background:
	Given User is on the homepage

Scenario Outline: Search for a product on Amazon
  When User searches for "<product>"
  Then Search results for "<product>" are displayed

Examples:
  | product   |
  | iPhone 13 |
  | MacBook Pro |
  
 
 Scenario: User is on homepage when not enters a product and clicks search
  When User clicks on the Search button without entering a product
  Then User remains on the Amazon homepage