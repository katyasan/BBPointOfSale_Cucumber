@BB-374 @cucumber
Feature: 


		#@BB-384
		Background: logined as a manager and User on the POS detail page in Editing mode
		    Given User logined as a manager and User is navigate to POS module
		    And User navigates to Editing mode
		

	
	@BB-378 @BB-373
	Scenario: checking Table Management functionality when it is unselected
		Given Is a Bar Restaurant checkbox in selected and Table Management checkbox is unselected
		    When User selects Table Management checkbox
		    And user clicks on Save button
		    Then Floors dropdown should be displayed
		    And the link Floors should be displayed
		    And close the browser	

	
	@BB-392 @BB-373
	Scenario: checking Orderline Notes functionality when it is unselected
		Given Is a Bar Restaurant checkbox in selected and Orderline Notes checkbox is unselected
		    When User selects Orderline Notes checkbox
		    And user clicks on Save button
		    Then Orderline Notes checkbox should be selected
		    And close the browser