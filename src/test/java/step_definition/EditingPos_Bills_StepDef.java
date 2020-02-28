package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.*;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EditingPos_Bills_StepDef {

    PosCardsViewPage cv = new PosCardsViewPage();
    PosDetailPage dp = new PosDetailPage();

    @Test
    @Given("I logged as a manager and click to PoS")
    public void i_logged_as_a_manager_and_click_to_PoS() {
        LoginPage.getToPOSModule();
    }

    @Given("Change view and choose first point of sale and went to edit mode")
    public void change_view_and_choose_first_point_of_sale_and_went_to_edit_mode() {
        cv.listBox.click();
        Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[2]")).click();
        dp.editButton.click();

    }

    @Given("Checkbox is Bar is not specified")
    public void checkbox_is_Bar_is_not_specified() {
        if(dp.isBarRestuarantCheckBox.isSelected()){
            dp.isBarRestuarantCheckBox.click();
        }
    }

    @When("I scroll down to Bill&Receipts section")
    public void i_scroll_down_to_Bill_Receipts_section() {
        SeleniumUtils.scrollToElement(Driver.getDriver(),dp.inventoryTitle);
    }

    @When("I select checkbox Header & Footer")
    public void i_select_checkbox_Header_Footer() {
        if(!dp.headerFooterCheckBox.isSelected()) {
            dp.headerFooterCheckBox.click();
        }
    }

    @When("I select checkbox Automatic Receipt Printing")
    public void i_select_checkbox_Automatic_Receipt_Printing() {
        if(!dp.automaticReceiptPrintingCheckBox.isSelected()){
            dp.automaticReceiptPrintingCheckBox.click();
        }
    }

    @When("I select checkbox Invoicing")
    public void i_select_checkbox_Invoicing() {
       if(!dp.invoicingCheckBox.isSelected()){
           dp.invoicingCheckBox.click();
       }
    }

    @When("I click to Save button")
    public void i_click_to_Save_button() {
       dp.saveButton.click();
    }

    @Then("I verify what selected checkboxes is saved and selected , checkbox is bar is not specified")
    public void i_verify_what_selected_checkboxes_is_saved_and_selected_checkbox_is_bar_is_not_specified() {
        Assert.assertTrue("Bar was selected", !dp.isBarRestuarantCheckBox.isSelected());
        Assert.assertTrue("Header was not selected", dp.headerFooterCheckBox.isSelected());
        Assert.assertTrue("Receipt was not selected", dp.automaticReceiptPrintingCheckBox.isSelected());
        Assert.assertTrue("Invoicing was not selected", dp.invoicingCheckBox.isSelected());

    }
        //2 scenario


        @When("I unselect checkbox Header & Footer")
        public void i_unselect_checkbox_Header_Footer() {
            if(dp.headerFooterCheckBox.isSelected()) {
                dp.headerFooterCheckBox.click();
            }
        }

        @When("I unselect checkbox Automatic Receipt Printing")
        public void i_unselect_checkbox_Automatic_Receipt_Printing() {
            if (dp.automaticReceiptPrintingCheckBox.isSelected()) {
                dp.automaticReceiptPrintingCheckBox.click();
            }
        }
        @When("I unselect checkbox Invoicing")
        public void i_unselect_checkbox_Invoicing() {
            if (dp.invoicingCheckBox.isSelected()) {
                dp.invoicingCheckBox.click();
            }
        }
        @Then("I verify what unselected checkboxes is saved and unselected , checkbox is bar is not specified")
        public void i_verify_what_unselected_checkboxes_is_saved_and_unselected_checkbox_is_bar_is_not_specified() {
            Assert.assertTrue("Bar was selected", !dp.isBarRestuarantCheckBox.isSelected());
            Assert.assertTrue("Header was selected", !dp.headerFooterCheckBox.isSelected());
            Assert.assertTrue("Receipt was selected", !dp.automaticReceiptPrintingCheckBox.isSelected());
            Assert.assertTrue("Invoicing was selected", !dp.invoicingCheckBox.isSelected());
        }

        //3 scenario
    @Given("Checkbox is Bar is specified")
    public void checkbox_is_Bar_is_specified() {
        if(dp.isBarRestuarantCheckBox.isEnabled()) {
            dp.isBarRestuarantCheckBox.click();
        }
    }

    @When("I select checkbox Bill Printing")
    public void i_select_checkbox_Bill_Printing() {
        if(dp.billPrintingCheckBox.isEnabled())
            dp.billPrintingCheckBox.click();
    }

    @When("I select checkbox Bill Splitting")
    public void i_select_checkbox_Bill_Splitting() {
        if(dp.billSplittingCheckBox.isEnabled())
            dp.billSplittingCheckBox.click();
    }

    @When("I select checkbox Tips")
    public void i_select_checkbox_Tips() {
        if(dp.tipsCheckBox.isEnabled())
            dp.tipsCheckBox.click();
    }

    @Then("I verify what selected checkboxes is saved and selected, checkbox is bar is specified")
    public void i_verify_what_selected_checkboxes_is_saved_and_selected_checkbox_is_bar_is_specified() {
        Assert.assertTrue("Bar was not selected", dp.isBarRestuarantCheckBox.isSelected());
        Assert.assertTrue("Header was not selected", dp.headerFooterCheckBox.isSelected());
        Assert.assertTrue("Receipt was not selected", dp.automaticReceiptPrintingCheckBox.isSelected());
        Assert.assertTrue("Invoicing was not selected", dp.invoicingCheckBox.isSelected());

    }

    @When("I write text to header")
    public void i_write_text_to_header() {
        dp.underHeaderFooterTextBox1.clear();
        String headerTextExpected = "hello";
        dp.underHeaderFooterTextBox1.sendKeys(headerTextExpected);
    }

    @When("I write text to footer")
    public void i_write_text_to_footer() {
        dp.underHeaderFooterTextBox2.clear();
        String footerTextExpected = "world";
        dp.underHeaderFooterTextBox2.sendKeys(footerTextExpected);

    }

    @Then("I verify what text and text is saved")
    public void i_verify_what_text_and_text_is_saved() {
        WebElement HeaderText = Driver.getDriver().findElement(By.xpath("//*[@id=\"receipt\"]/div[2]/div[2]/div[2]/div[1]/span"));
        WebElement FooterText = Driver.getDriver().findElement(By.xpath("//*[@id=\"receipt\"]/div[2]/div[2]/div[2]/div[2]/span"));

        Assert.assertTrue(HeaderText.getText().equalsIgnoreCase("hello"));
        Assert.assertTrue(FooterText.getText().equalsIgnoreCase("WORLD"));
    }



}



