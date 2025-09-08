Feature: Login
 Scenario: User logs in with valid credentials
    Given user is on the  login page 
    When user logs in with username "demouser" and password "testingisfun99"
    Then user should be logged in successfully