Feature: Login

  I want to Login to the giftrete site

  Scenario:Valid Login
    Given I navigate to the giftrete website
    When  I click the login link
    And I enter my email
    And I enter my password
    Then I click signup
    And I should be logged in



    Scenario: Invalid Login
      Given I navigate to the giftrete website
      When I click the login link
      And I enter my email
      And I enter invalid password
      And I click signup
      Then I should not be able to log in
      And I close the browser