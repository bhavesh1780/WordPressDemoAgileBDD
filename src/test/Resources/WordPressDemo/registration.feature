Feature: As a user i want to login so i can use all functionality

  @register
  Scenario Outline: Verify that user can login successfully with valid credentials

    Given User is on home page wordpress
    When User click on Signin
    And User types in valid "<Email>" and "<Password>"
    And Click on login
    Then User should able to login successfully and use all functionality
    Examples:
      |Email|Password|
      | lotus7143@gmail.com | Test1234 |

