Feature: Registration

  This is a test for registration page

  Scenario: Valid Registration
    Given I navigate to the giftrete website
    When I click on register link
    And I enter firstname "Azeez"
    And I enter lastname "Oganla"
    And I enter email "a.oganla@yahoo.com"
    And I enter password "password1"
    And I enter confirm password "password1"
    And I click on signup
    Then I should be registered
    And I close the browser
