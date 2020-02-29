package step_definition;

import cucumber.api.java.en.When;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.PosCardsViewPage;
import pages.PosDetailPage;
import pages.PosListViewPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EditingPos_Bar_StepDef {

    PosCardsViewPage posCardsViewPage=new PosCardsViewPage();
    PosDetailPage pos_detail_page=new PosDetailPage();
    PosListViewPage posListViewPage = new PosListViewPage();

    public void openListView() {
    LoginPage.getToPOSModule();
    SeleniumUtils.waitForVisibility(posCardsViewPage.listBox, 4);
    posCardsViewPage.listBox.click();
}

    @Test
    @Given("User opens url ang go to POS")
    public void user_opens_url_ang_go_to_POS() {
        LoginPage.getToPOSModule();
        SeleniumUtils.waitForVisibility(posCardsViewPage.listBox, 4);
        posCardsViewPage.listBox.click();
        posListViewPage.navigateToEditMode("a");
        pos_detail_page.editButton.click();
    }


    @Given("If a Bar Restaurant functionality checkbox is not selected")
    public void if_a_Bar_Restaurant_functionality_checkbox_is_not_selected() {
       Assert.assertFalse(pos_detail_page.isBarRestuarantCheckBox.isSelected());
    }

    @Then("Table Management checkbox should not be displayed")
    public void table_Management_checkbox_should_not_be_displayed() {
        Assert.assertFalse(pos_detail_page.tableManagmentCheckBox.isDisplayed());
    }

    @Then("Orderline Notes checkbox should not be displayed")
    public void orderline_Notes_checkbox_should_not_be_displayed() {
        Assert.assertFalse(pos_detail_page.orderlineNotesCheckBox.isDisplayed());
    }

    @Then("Order Printers checkbox should not be displayed")
    public void order_Printers_checkbox_should_not_be_displayed() {
        Assert.assertFalse(pos_detail_page.orderPrinters.isDisplayed());
    }

    @Then("Bill Printing checkbox should not be displayed")
    public void bill_Printing_checkbox_should_not_be_displayed() {
        Assert.assertFalse(pos_detail_page.billPrintingCheckBox.isDisplayed());
    }

    @Then("Tips checkbox should not be displayed")
    public void tips_checkbox_should_not_be_displayed() {
        Assert.assertFalse(pos_detail_page.tipsCheckBox.isDisplayed());

    }

    @Then("Bill Splitting checkbox should not be displayed")
    public void bill_Splitting_checkbox_should_not_be_displayed() {
        Assert.assertFalse(pos_detail_page.billSplittingCheckBox.isDisplayed());
    }



    @Given("Is a Bar Restaurant functionality checkbox is selected")
    public void is_a_Bar_Restaurant_functionality_checkbox_is_selected() {
        Assert.assertTrue(pos_detail_page.isBarRestuarantCheckBox.isSelected());
    }

    @Then("Table Management checkbox is displayed")
    public void table_Management_checkbox_is_displayed() {
        Assert.assertTrue(pos_detail_page.tableManagmentCheckBox.isDisplayed());

    }

    @Then("Orderline Notes checkbox is displayed")
    public void orderline_Notes_checkbox_is_displayed() {
        Assert.assertTrue(pos_detail_page.orderlineNotesCheckBox.isDisplayed());
    }

    @Then("Order Printers checkbox is displayed")
    public void order_Printers_checkbox_is_displayed() {
        Assert.assertTrue(pos_detail_page.orderPrinters.isDisplayed());
    }

    @Then("Bill Printing checkbox is displayed")
    public void bill_Printing_checkbox_is_displayed() {
        Assert.assertTrue(pos_detail_page.billPrintingCheckBox.isDisplayed());
    }

//    @Then("Tips checkbox is displayed")
//    public void tips_checkbox_is_displayed() {
//        Assert.assertTrue(pos_detail_page.tipsCheckBox.isDisplayed());
//    }

    @Then("Bill Splitting checkbox is displayed")
    public void bill_Splitting_checkbox_is_displayed() {
        Assert.assertTrue(pos_detail_page.billSplittingCheckBox.isDisplayed());
    }

    @When("User unselects Is a Bar Restaurant functionality checkbox and clicks on Save button")
    public void user_unselects_Is_a_Bar_Restaurant_functionality_checkbox_and_clicks_on_Save_button() {
        Assert.assertTrue(pos_detail_page.isBarRestuarantCheckBox.isSelected());
        pos_detail_page.isBarRestuarantCheckBox.click();// select
        pos_detail_page.saveButton.click();

    }

    @Then("Tips checkbox is  not displayed")
    public void tips_checkbox_is_not_displayed() {
        Assert.assertFalse(pos_detail_page.tipsCheckBox.isDisplayed());

    }

    @Given("Is a Bar Restaurant functionality checkbox is not selected")
    public void is_a_Bar_Restaurant_functionality_checkbox_is_not_selected() {
        Assert.assertFalse(pos_detail_page.isBarRestuarantCheckBox.isSelected());

    }

    @When("User selects Is a Bar Restaurant functionality checkbox and clicks on Save button")
    public void user_selects_Is_a_Bar_Restaurant_functionality_checkbox_and_clicks_on_Save_button() {
        Assert.assertFalse(pos_detail_page.isBarRestuarantCheckBox.isSelected());
       pos_detail_page.isBarRestuarantCheckBox.click();
        pos_detail_page.saveButton.click();
    }

    @Then("Tips checkbox is  displayed")
    public void tips_checkbox_is_displayed() {
        Assert.assertTrue(pos_detail_page.tipsCheckBox.isDisplayed());
    }
}