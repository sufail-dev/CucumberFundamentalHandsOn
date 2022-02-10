@featuretag 
Feature: Add to Cart

	@scenario1
  Scenario Outline: Scenario One
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
	@qa
    Examples: 
      | product_name |
      | Blue Shoes   |
      
      Scenario Outline: Scenario two
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
	@prod
    Examples: 
      | product_name |
      | Blue Shoes   |
      
      Scenario Outline: Scenari three
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
	
    Examples: 
      | product_name |
      | Red Shoes   |
      
      #@prod
    #Examples: 
      #| product_name |
      #| Red Shoes   |
