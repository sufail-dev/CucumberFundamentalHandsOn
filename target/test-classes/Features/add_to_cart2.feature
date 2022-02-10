@featuretag 
Feature: Add to Cart

	
  Scenario Outline: Scenario One
    Given I am on the store page
    When I add a "<product_name>" to the cart
    Then I see 1 "<product_name>" in the cart
	
    Examples: 
      | product_name |
      | Blue Shoes   |
      

      #@prod
    #Examples: 
      #| product_name |
      #| Red Shoes   |
