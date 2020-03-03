
Feature: Create new POS.
  Agile story: When manager on POS list view,  he should be able to create new POS.


  Background: User already on Point of Sale module
    Given User is logged into Brite ERP as a sales manager and on POS page
    And User click on list view icon

  @Smoke @Regression
  Scenario: Verification of save and discard buttons
    When User click on create button
    Then title should change to "New - Odoo"
    And save and discard button should display

  @Smoke @Regression
  Scenario: Save POS without entering a name
    When User click on save button without entering name of POS
    Then error notification should appear

  @Regression
  Scenario: Validation of "discard" button.
    When User enter any name of POS into input box
    And click on discard button
    Then warning message should appear
    When user accept this message
    Then It should navigate to previous page and title should change to "Point of Sale - Odoo"

  @Regression
  Scenario: Create new POS validation
    When User click on create button
    And Enter a name of new POS and select company type
    And click on save button
    Then title should contains " (not used) - Odoo"
    And Edit button should appear

  @Regression
  Scenario: Verification of new POS
    When user type name of recently created POS into search box and click enter
    Then it should display particular POS


