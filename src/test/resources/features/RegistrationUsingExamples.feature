Feature: Registration using examples

  Scenario Outline: Invalid registration using examples
    Given I navigate to the giftrete website
    When I click on register link
    And I enter firstname "<firstname>"
    And I enter lastname "<lastname>"
    And I enter email "<email>"
    And I enter password "<password>"
    And I enter confirm password "<confirmpassword>"
    And I click on signup
    Then I should be registered
    And I close the browser

    Examples:
    |firstname|lastname|email|password|confirmpassword|
    |Azeez    |oganla  |a.oganla@yahoo.com|password1|password123|
    |fola    |nla  |f.nla@yahoo.com|password1|password12345|
    |Bola   |adepitan  |b.pitan@yahoo.com|password1|password345|