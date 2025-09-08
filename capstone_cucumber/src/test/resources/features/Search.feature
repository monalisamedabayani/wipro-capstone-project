Feature: Search Product
  Scenario: User searches for a product
    Given user is on the home page
    When user searches for a product
    Then search results should be displayed