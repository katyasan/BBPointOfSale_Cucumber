@bar
Feature: Checking that user is able to change settings in Is a Bar/Restaurant section on POS Details page
  Background: User logined as a manager and User on the POS detail page in Editing mode
    Given User opens url ang go to POS

  Scenario: checking  Is a Bar/Restaurant functionality  when it is not selected
    Given Is a Bar Restaurant functionality checkbox is not selected
    Then Table Management checkbox should not be displayed
    And Orderline Notes checkbox should not be displayed
    And Order Printers checkbox should not be displayed
    And Bill Printing checkbox should not be displayed
    And Tips checkbox should not be displayed
    And Bill Splitting checkbox should not be displayed

  Scenario: checking  Is a Bar/Restaurant functionality  when it is selected
    Given Is a Bar Restaurant functionality checkbox is selected
    Then Table Management checkbox is displayed
    And Orderline Notes checkbox is displayed
    And Order Printers checkbox is displayed
    And Bill Printing checkbox is displayed
    And Tips checkbox is  displayed
    And Bill Splitting checkbox is displayed
  Scenario: changing  Is a Bar/Restaurant functionality  when it is selected
    Given Is a Bar Restaurant functionality checkbox is selected
    When User unselects Is a Bar Restaurant functionality checkbox and clicks on Save button
    Then Table Management checkbox should not be displayed
    And Orderline Notes checkbox should not be displayed
    And Order Printers checkbox should not be displayed
    And Bill Printing checkbox should not be displayed
    And Tips checkbox should not be displayed
    And Bill Splitting checkbox should not be displayed
  Scenario: changing  Is a Bar/Restaurant functionality  when it is not selected
    Given If a Bar Restaurant functionality checkbox is not selected
    When User selects Is a Bar Restaurant functionality checkbox and clicks on Save button
    Then Table Management checkbox is displayed
    And Orderline Notes checkbox is displayed
    And Order Printers checkbox is displayed
    And Bill Printing checkbox is displayed
    And Tips checkbox is  displayed
    And Bill Splitting checkbox is displayed



