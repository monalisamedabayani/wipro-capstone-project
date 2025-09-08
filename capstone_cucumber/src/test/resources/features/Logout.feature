Feature: Logout
  Scenario: User logs out successfully
    Given user is logged in
    When user clicks on logout
    Then user should be logged out successfully