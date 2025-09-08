Feature: Add product to cart
 Scenario: User adds an item to the cart successfully
    Given user is on the home page
    When user adds a product to the cart
    Then product should be visible in the cart