package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.PosDetailPage;
import utilities.Config;
import utilities.Driver;

public class EditingPos_Pricing_StepDef {


 LoginPage loginPage = new LoginPage();

 PosDetailPage posDetailPage = new PosDetailPage();

    @Given("User is logged into Brite ERP as a manger and on POS page")
    public void user_is_logged_into_Brite_ERP_as_a_manger_and_on_POS_page(){

     Driver.getDriver().get(Config.getProperty("url"));
     loginPage.userNameInput.sendKeys(Config.getProperty("userNameInput"));
     loginPage.passwordInput.sendKeys(Config.getProperty("passwordInput"));
     loginPage.buttonLogIn.click();
    // posDetailPage.pointOfSale.click();
     //posDetailPage.poinOFSaleInList.click();
    }



    @Given("User Click on  point of sale modul")
    public void user_Click_on_point_of_sale_modul() {

        //posDetailPage.pointOfSale.click();

     String posModule = "(//span[contains(text(), 'Point of Sale')])[1]";

     Driver.getDriver().findElement(By.xpath(posModule)).click();

    }


    @Given("User Click on list point of sale")
   public void user_Click_on_list_point_of_sale() {
      //posDetailPage.poinOFSaleInList.click();

     String posModule = "(//span[contains(text(), 'Point of Sale')])[2]";

     Driver.getDriver().findElement(By.xpath(posModule)).click();

   }
 @Given("User click on One of the  POS")
 public void user_click_on_One_of_the_POS() {
    posDetailPage.phone.click();
 }

 @Then("User navigates to edit button and click")
 public void user_navigates_to_edit_button_and_click() {
       posDetailPage.editButton.click();

 }


    @Given("Tax-Excluded Prices selected")
    public void tax_Excluded_Prices_selected() {
    posDetailPage.taxExcludedPricesCheckBox.click();

    }

    @When("User selects Tax-Included Prices")

    public void user_selects_Tax_Included_Prices() {
     posDetailPage.taxIncludedPricesCheckBox.click();



    }

    @Then("Tax-Included Prices radiobutton  should be selected")
    public void tax_Included_Prices_radiobutton_should_be_selected() {
        Assert.assertTrue(posDetailPage.taxIncludedPricesCheckBox.isSelected());
    }

    @Then("the link How to manage tax-included prices should be displayed")
    public void the_link_How_to_manage_tax_included_prices_should_be_displayed() {

   Assert.assertTrue(posDetailPage.menageTaxIncludedPricesCheckBox.isDisplayed());

    }
    @Then("Tax-Excluded Prices radiobutton  should  NOT be selected")
    public void tax_Excluded_Prices_radiobutton_should_NOT_be_selected() {

        Assert.assertFalse(posDetailPage.taxExcludedPricesCheckBox.isSelected());
    }


    @Given("Tax-Included Prices selected")
    public void tax_Included_Prices_selected() {

        posDetailPage.taxIncludedPricesCheckBox.click();


    }

    @Given("the link How to manage tax-included prices is displayed")
    public void the_link_How_to_manage_tax_included_prices_is_displayed() {
        Assert.assertTrue(posDetailPage.menageTaxIncludedPricesCheckBox.isDisplayed());
    }

    @Given("Tax-Excluded Prices radio button  is NOT selected")
    public void tax_Excluded_Prices_radio_button_is_NOT_selected() {
        Assert.assertFalse(posDetailPage.taxExcludedPricesCheckBox.isSelected());

    }

    @Given("User selects Tax-Excluded Prices")
    public void user_selects_Tax_Excluded_Prices() {

        posDetailPage.taxExcludedPricesCheckBox.click();
    }

    @Then("Tax-Excluded Prices radio button  should be selected")
    public void tax_Excluded_Prices_radio_button_should_be_selected() {

        Assert.assertTrue( posDetailPage.taxExcludedPricesCheckBox.isSelected());
    }

 //   @Then("the link How to manage tax-included prices should be  NOT displayed")
  //  public void the_link_How_to_manage_tax_included_prices_should_be_NOT_displayed() {

  //      Assert.assertFalse(posDetailPage.menageTaxIncludedPricesCheckBox.isDisplayed());

   // }

    @Then("Tax-Included Prices radio button should be  NOT selected")
    public void tax_Included_Prices_radio_button_should_be_NOT_selected() {

      Assert.assertFalse(posDetailPage.taxIncludedPricesCheckBox.isSelected());

    }

    @Given("Pricelist checkbox is not selected")
    public void pricelist_checkbox_is_not_selected() {
        Assert.assertFalse(posDetailPage.priceListCheckBox.isSelected());
    }

    @When("User selects Pricelist checkbox")
    public void user_selects_Pricelist_checkbox(){

       posDetailPage.priceListCheckBox.click();

    }

//    @Then("Available Pricelists dropdown should be  displayed")
//    public void available_Pricelists_dropdown_should_be_displayed() {
//       Assert.assertTrue(posDetailPage.underPricelistDropDown1.isDisplayed());
//
//    }

    @Then("Default Pricelists dropdown should be  displayed")
    public void default_Pricelists_dropdown_should_be_displayed() {

    Assert.assertTrue(posDetailPage.underPricelistDropDown2.isDisplayed());

    }

    @Then("the link Pricelist should be  displayed")
    public void the_link_Pricelist_should_be_displayed() {
      Assert.assertTrue(posDetailPage.underPricelistLink.isDisplayed());

    }

//    @Given("Pricelist checkbox is selected")
//    public void pricelist_checkbox_is_selected() {
//       Assert.assertTrue(posDetailPage.priceListCheckBox.isSelected());
//      //  posDetailPage.priceListCheckBox.click();
//    }

    @Given("Available Pricelists dropdown is displayed")
    public void available_Pricelists_dropdown_is_displayed() {
        Assert.assertFalse(posDetailPage.underPricelistDropDown1.isDisplayed());
    }

    @Given("Default Pricelists dropdown is displayed")
    public void default_Pricelists_dropdown_is_displayed() {
        Assert.assertTrue(posDetailPage.underPricelistDropDown2.isDisplayed());

    }

    @Given("the link Pricelist is displayed")
    public void the_link_Pricelist_is_displayed() {
        Assert.assertTrue(posDetailPage.underPricelistLink.isDisplayed());

    }

    @When("User unselects Pricelist checkbox and clicks on Save button")
    public void user_unselects_Pricelist_checkbox_and_clicks_on_Save_button(){
        posDetailPage.priceListCheckBox.click();
        posDetailPage.saveButton.click();

    }

    @Then("Available Pricelists dropdown should be not displayed")
    public void available_Pricelists_dropdown_should_be_not_displayed(){
       Assert.assertFalse(posDetailPage.underPricelistDropDown1.isDisplayed());

    }

    @Then("Default Pricelists dropdown should be  not displayed")
    public void default_Pricelists_dropdown_should_be_not_displayed() {
        Assert.assertFalse(posDetailPage.underPricelistDropDown2.isDisplayed());

    }

    @Then("the link Pricelist should be  not displayed")
    public void the_link_Pricelist_should_be_not_displayed() {
        Assert.assertFalse(posDetailPage.underPricelistLink.isDisplayed());

    }

    @Given("Price Control checkbox is not selected")
    public void price_Control_checkbox_is_not_selected() {
      Assert.assertFalse(posDetailPage.priceControlCheckBox.isSelected());
    }

    @When("User selects Price Control checkbox and clicks on Save button")
    public void user_selects_Price_Control_checkbox_and_clicks_on_Save_button() {
        posDetailPage.priceControlCheckBox.click();
        posDetailPage.saveButton.click();

    }

    @Then("Price Control checkbox should be selected")
    public void price_Control_checkbox_should_be_selected() {
        posDetailPage.priceControlCheckBox.click();

    }

    @Given("Price Control checkbox is selected")
    public void price_Control_checkbox_is_selected() {
        Assert.assertTrue(posDetailPage.priceControlCheckBox.isSelected());


    }

    @When("User unselects Price Control checkbox and clicks on Save button")
    public void user_unselects_Price_Control_checkbox_and_clicks_on_Save_button() {
        posDetailPage.priceControlCheckBox.click();
        posDetailPage.saveButton.click();
    }
}

