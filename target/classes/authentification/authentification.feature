@authentification
Feature: Authentification - OrangeHRM
  ETQ utilisateur je souhaite m_authentifier

  @authentification
  Scenario: Authentification - OrangeHRM
    Given I open OrangeHRM application
    When I set username
    And I set password
    And I click on login button
    Then I check the admin account is displayed
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |