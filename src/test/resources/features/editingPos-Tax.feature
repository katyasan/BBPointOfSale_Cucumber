
Feature: Checking that user is able to change settings in TAX section on POS Details page

  Background: User already on Point of Sale
Given User is logged into Brite  ERP  as a manager and on POS page
And User will click  POS header
And User will click POS from Configuration
Then User click first check box from  POS name
Then User will click Edit button

    @Smoke
Scenario:1 User logined as a manager and User on the POS detail page in Editing mode
Given Verify Taxes title on POS Editing page
When Fiscal Position per Order  checkbox is  selected
And Dropdown under Fiscal position is displayed
Then click Save button


Scenario: 2 checking Fiscal Position per Order checkbox if it is selected
Given Fiscal Position per Order  checkbox is not selected
When dropdown for Fiscal per Order positions is not  displayed
Then User clicks on Save button

Scenario: 3 checking Fiscal Position  checkbox
Given Fiscal Position  checkbox is selected
When Dropdown under fiscal position is displayed
Then click save button

Scenario: checking Fiscal Position  checkbox if it is not selected selected
Given Fiscal Position  checkbox is not selected
When dropdown for under Fiscal Position is not displayed
Then click save button