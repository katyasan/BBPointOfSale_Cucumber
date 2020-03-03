@BB-374 @cucumber
Feature: 

	
	@BB-389 @BB-373
	Scenario: checking Fiscal Position per Order checkbox if it is selected
		Given Fiscal Position per Order  checkbox is not selected
		When dropdown for Fiscal per Order positions is not  displayed
		Then User clicks on Save button
			

	
	@BB-390 @BB-373
	Scenario: checking Fiscal Position  checkbox
		Given Fiscal Position  checkbox is selected
		When Dropdown under fiscal position is displayed
		Then click save button	

	
	@BB-393 @BB-373
	Scenario: checking Fiscal Position  checkbox if it is not selected selected
		Given Fiscal Position  checkbox is not selected
		When dropdown for under Fiscal Position is not displayed
		Then click save button