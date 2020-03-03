@BB-374 @cucumber
Feature: 

	Background:
		#@BB-399
		Given I logged as a manager and click to PoS
		    And Change view and choose first point of sale and went to edit mode
		
		

	
	@BB-398 @BB-373
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