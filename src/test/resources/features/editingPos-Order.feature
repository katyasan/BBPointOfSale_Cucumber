Feature: Checking that user is able to change settings in Order Interface section on POS Details page
  Background: logined as a manager and User on the POS detail page in Editing mode
    Given User logined as a manager and User is navigate to POS module
    And User navigates to Editing mode

    # Table management 1
  @scen1
  Scenario: checking Table Management functionality when it is unselected
    Given Is a Bar Restaurant checkbox in selected and Table Management checkbox is unselected
    When User selects Table Management checkbox
    And user clicks on Save button
    Then Floors dropdown should be displayed
    And the link Floors should be displayed
    And close the browser

   # Table management 2
  Scenario: checking Table Management functionality when it is selected
    Given Is a Bar Restaurant checkbox in selected and Table Management checkbox is selected
    When User unselects Table Management checkbox
    And user clicks on Save button
    Then Table Management checkbox should not be selected
    And Floors dropdown should be not displayed
    And the link Floors should be not displayed
    And close the browser

  # Orderline Notes 1
  Scenario: checking Orderline Notes functionality when it is unselected
    Given Is a Bar Restaurant checkbox in selected and Orderline Notes checkbox is unselected
    When User selects Orderline Notes checkbox
    And user clicks on Save button
    Then Orderline Notes checkbox should be selected
    And close the browser

  # Orderline Notes 2
  Scenario: checking Orderline Notes functionality when it is selected
    Given Is a Bar Restaurant checkbox in selected and Orderline Notes checkbox is selected
    When User unselects Orderline Notes checkbox
    And user clicks on Save button
    Then Orderline Notes checkbox should not be selected
    And close the browser

    # Category Pictures 1
  Scenario: checking Category Pictures functionality when it is not selected
    Given Category Pictures checkbox is not selected
    When User selects Category Pictures checkbox
    And user clicks on Save button
    Then Category Pictures checkbox should be selected
    And close the browser

    # Category Pictures 2
  Scenario: checking Category Pictures functionality when it is selected
    Given Category Pictures checkbox is  selected
    When User unselects Category Pictures checkbox
    And user clicks on Save button
    Then Category Pictures checkbox should not be selected
    And close the browser

    # Virtual keyboard 1
  Scenario: checking Virtual KeyBoard functionality when it is not selected
    Given Virtual KeyBoard checkbox is not selected
    When User selects Virtual KeyBoard checkbox
    And user clicks on Save button
    Then Virtual KeyBoard checkbox should be selected
    And close the browser

    # Virtual keyboard 2
  Scenario: checking Category Pictures functionality when it is selected
    Given Virtual KeyBoard checkbox is  selected
    When User unselects Category Pictures checkbox
    And user clicks on Save button
    Then Virtual KeyBoard checkbox should not be selected
    And close the browser


    # Large Scrollbars 1
  Scenario: checking Large Scrollbars functionality when it is not selected
    Given Large Scrollbars checkbox is not selected
    When User selects Large Scrollbars checkbox
    And user clicks on Save button
    Then Large Scrollbars checkbox should be selected
    And close the browser

    # Large Scrollbars 2
  Scenario: checking Large Scrollbars functionality when it is selected
    Given Large Scrollbars checkbox is  selected
    When User unselects Large Scrollbars checkbox
    And user clicks on Save button
    Then Large Scrollbars checkbox should not be selected
    And close the browser


     # Set Start Category 1
  Scenario: checking Set Start Category functionality when it is not selected
    Given Set Start Category checkbox is not selected
    When User selects Set Start Category checkbox
    And user clicks on Save button
    Then Set Start Category checkbox should not be selected
    And Set Start Category dropdown should be displayed
    And close the browser

    # Set Start Category 2
  Scenario: checking Set Start Category functionality when it is selected
    Given Set Start Category checkbox is  selected
    When User unselects Set Start Category checkbox
    And user clicks on Save button
    Then Set Start Category checkbox should not be displayed
    And close the browser
