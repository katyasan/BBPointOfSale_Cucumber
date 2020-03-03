@BB-374 @cucumber
Feature: 

	Background:
		#@BB-396
		 Given I logged as a manager and click to PoS
		    And Change view and choose first point of sale and went to edit mode
		

	
	@BB-395 @BB-373
	Scenario: Checkbox bar is not specified, select all checkboxes Bill&Receipts section
		Given Checkbox is Bar is not specified
		    When I scroll down to Bill&Receipts section
		    And I select checkbox Header & Footer
		    And I select checkbox Automatic Receipt Printing
		    And I select checkbox Invoicing
		    And I click to Save button
		    Then I verify what selected checkboxes is saved and selected , checkbox is bar is not specified
		