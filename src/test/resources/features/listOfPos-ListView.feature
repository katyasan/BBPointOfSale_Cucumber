
Feature: Verifying user is able to scroll to the next page if not all the products are displayed on the List of Products  page. User login as a manager.

Background: User is already on Point of Sale module
  Given User is logged into Brite EPR as a sales manager and on POS page
  And manager clicks on Products link from left menu

@smoke
  Scenario: Verifying List of Products is displayed on the page
    When List view button is displayed on the page
    Then manager clicks on the List view button

@smoke
  Scenario: Verify Back and Forward buttons are displayed on the page
    When manager is on List of Products page
    Then Back and Forward buttons are displayed on the page


  Scenario: Verifying manager is able to click to the next page if not all products are displayed on the current page
    When page limit is more than page value
    And manager clicks on forward button
    Then  Products list should appear and page value starts from 81