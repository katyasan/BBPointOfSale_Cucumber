Feature: Validating Bill&Receipts section on PosDetail page

  User story: As a manager I should be able to configure Bill&Receipts section on the Point of Sale Detail page

  Background: I logged in as a master and went to Point of sale page, and went to edit mod of PoS.
    Given I logged as a manager and click to PoS
    And Change view and choose first point of sale and went to edit mode


    @Test
  Scenario: Checkbox bar is not specified, select all checkboxes Bill&Receipts section
    Given Checkbox is Bar is not specified
    When I scroll down to Bill&Receipts section
    And I select checkbox Header & Footer
    And I select checkbox Automatic Receipt Printing
    And I select checkbox Invoicing
    And I click to Save button
    Then I verify what selected checkboxes is saved and selected , checkbox is bar is not specified

      @Test2
  Scenario: Checkbox bar is not specified, Unselect all checkboxes Bill&Receipts section
    Given Checkbox is Bar is not specified
    When I scroll down to Bill&Receipts section
    And I unselect checkbox Header & Footer
    And I unselect checkbox Automatic Receipt Printing
    And I unselect checkbox Invoicing
    And I click to Save button
    Then I verify what unselected checkboxes is saved and unselected , checkbox is bar is not specified

      @Test3
  Scenario: Checkbox bar is specified, Select all checkboxes Bill&Receipts section
    Given Checkbox is Bar is specified
    When I scroll down to Bill&Receipts section
    And I select checkbox Header & Footer
    And I select checkbox Automatic Receipt Printing
    And I select checkbox Invoicing
    And I select checkbox Bill Printing
    And I select checkbox Bill Splitting
    And I select checkbox Tips
    And I click to Save button
    Then I verify what selected checkboxes is saved and selected, checkbox is bar is specified

        @Test4
  Scenario: Checkbox bar is not specified, write text to Header & Footer and verify after save
    Given Checkbox is Bar is not specified
    When I scroll down to Bill&Receipts section
    And I select checkbox Header & Footer
    And I write text to header
    And I write text to footer
    And I click to Save button
    Then I verify what text and text is saved

