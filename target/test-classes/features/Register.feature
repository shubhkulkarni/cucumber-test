Feature: Register to open cart application

  Background: I am on open cart webapp homepage

  Scenario Outline: I am able to register on open cart app
    Given I am on open cart webapp homepage
    When I click on My account section
    And then click on Register
    Then Register account screen is opened
    When I fill the details like "<firstName>" "<lastName>" "<email>" "<telephone>" "<password>"
    And click on privacy checkbox and continue button

    Examples: 
      | firstName | lastName | email                   | telephone  | password       |
      | Shubham   | Kulkarni | sskambajogai1@gmail.com | 9876543210 | Ssk@opencart24 |
