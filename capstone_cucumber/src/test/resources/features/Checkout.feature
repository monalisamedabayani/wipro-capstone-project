Feature: Checkout Page
  Scenario: User completes checkout
    Given user is on the home page
    When user proceeds to checkout
    Then the checkout should be completed successfully