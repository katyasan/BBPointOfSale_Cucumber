@BB-374 @cucumber
Feature: 

	Background:
		#@BB-391
		Given User is logged into Brite ERP as a manger and on POS page
		And User Click on  point of sale modul
		And User Click on list point of sale
		And User click on One of the  POS
		Then User navigates to edit button and click
		
		

	
	@BB-379 @BB-373
	Scenario: checking Product Prices radiobuttons changing from TaxExcluded Prices to TaxIncluded Prices
		Given Tax-Excluded Prices selected
		When User selects Tax-Included Prices
		Then Tax-Included Prices radiobutton  should be selected
		And the link How to manage tax-included prices should be displayed
		And Tax-Excluded Prices radiobutton  should  NOT be selected
			

	
	@BB-397 @BB-373
	Scenario:  checking Product  Prices radio buttons   changing from TaxIncluded Prices to TaxExcluded Prices
		Given Tax-Included Prices selected
		  And the link How to manage tax-included prices is displayed
		  And Tax-Excluded Prices radio button  is NOT selected
		  And User selects Tax-Excluded Prices
		  Then Tax-Excluded Prices radio button  should be selected
		  And Tax-Included Prices radio button should be  NOT selected
			

	
	@BB-400 @BB-373
	Scenario:  checking Pricelist checkbox
		Given Pricelist checkbox is not selected
		When User selects Pricelist checkbox
		And Default Pricelists dropdown should be  displayed
		And  the link Pricelist should be  displayed
		