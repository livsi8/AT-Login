Feature: login
    @C1
  Scenario: login
    Given I go to server http://dev-trading.umarkets.com
    And I put elinac@123software.ru as login
    And I put password123 as password
    And I press LoginPage button
    And I wait 15000 ms and chack LOGO
