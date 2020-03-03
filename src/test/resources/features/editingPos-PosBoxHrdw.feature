Feature: Checking that user is able to change settings in PosBox/Hardware Proxy section on POS Details page
Background:User logined as a manager and User on the POS detail page in Editing mode
Given i logged as a Manager and click to Pos
And change view and choose first point of sale go to edit mode
  @Smoke
Scenario: Checking  Order printer checkbox if it selected
When User should be select Is a Bar Restaurant checkbox is selected
Then Order Printers is Displayed
And  Printers Dropped down is displayed
Then click the save button

Scenario: Checking  barcode scanner checkbox if it selected
When User should see Barcode Nomenclature dropped down is displayed
Then user able to click the save button
