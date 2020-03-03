@BB-374 @cucumber
Feature: 


		#@BB-385
		Background: User already on Point of Sale
		Given User is logged into Brite  ERP  as a manager and on POS page
		And User will click  POS header
		And User will click POS from Configuration
		And User click first check box from  POS name
		And User will click Edit button

		
		

	
	@BB-380 @BB-373
	Scenario:  Checking that user is able to change settings in TAX section on POS Details page
		Given Verify Taxes title on POS Editing page
		When Fiscal Position per Order  checkbox is  selected
		And Dropdown under Fiscal position is displayed
		Then click Save button
		