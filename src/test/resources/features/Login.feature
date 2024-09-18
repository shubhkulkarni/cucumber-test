Feature: login to open cart app

  Background: I am on open cart webapp homepage

  Scenario Outline: I am able to login on open cart app
    Given I am on open cart webapp homepage
    When I click on My account section
    And then click on Login
    Then Login screen is opened
    When I fill the details like "<email>" "<password>"
    And click on login button
    Then My orders page should be displayed

    Examples: 
      | email                   | password       |
     	| sskambajogai1@gmail.com | Ssk@opencart24 |
