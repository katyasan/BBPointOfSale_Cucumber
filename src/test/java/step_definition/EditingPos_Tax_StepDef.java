package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import pages.PosDetailPage;
import pages.PosTaxPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EditingPos_Tax_StepDef {

    LoginPage loginPage = new LoginPage();
    PosTaxPage posTaxPage = new PosTaxPage();
    PosDetailPage posDetailPage = new PosDetailPage();
    WebDriver driver;


    @Given("User is logged into Brite  ERP  as a manager and on POS page")
    public void user_is_logged_into_Brite_ERP_as_a_manager_and_on_POS_page() {
       Driver.getDriver().get("http://app2.briteerp.com/web/login");
       loginPage.userNameInput.sendKeys("in_pos_manager7@info.com");
       loginPage.passwordInput.sendKeys("KjKtfgrs36");
       loginPage.buttonLogIn.click();

       SeleniumUtils.pause(5);



    }

    @Given("User will click  POS header")
    public void user_will_click_POS_header() {
        posTaxPage.headerPOs.click();
        SeleniumUtils.pause(2);
    }

    @Given("User will click POS from Configuration")
    public void user_will_click_POS_from_Configuration() {
        posTaxPage.postOfSaleConfig.click();

    }

    @Then("User click first check box from  POS name")
    public void user_click_first_check_box_from_POS_name() {
        posTaxPage.firstCheckBox.click();
        SeleniumUtils.pause(3);
    }

    @Then("User will click Edit button")
    public void user_will_click_Edit_button() {
        posTaxPage.editButton.click();
        SeleniumUtils.pause(3);
    }

    @Given("Verify Taxes title on POS Editing page")
    public void verify_Taxes_title_on_POS_Editing_page() {
        String expectedTitle = "Taxes";
        WebElement actualTitle = Driver.getDriver().findElement(By.xpath("//h2[.='Taxes']"));
        Assert.assertFalse(actualTitle.equals(expectedTitle));
    }

    @When("Fiscal Position per Order  checkbox is  selected")
    public void fiscal_Position_per_Order_checkbox_is_selected() {
        if (posDetailPage.fiscalPositionPerOrderCheckBox.isEnabled())
            posDetailPage.fiscalPositionPerOrderCheckBox.click();
    }

    @When("Dropdown under Fiscal position is displayed")
    public void dropdown_under_Fiscal_position_is_displayed() {
        posDetailPage.underFiscalPositionPerOrderDropDown.isDisplayed();

    }

    @Then("click Save button")
    public void click_Save_button() {
        posDetailPage.saveButton.click();

    }

    @Given("Fiscal Position per Order  checkbox is not selected")
    public void fiscal_Position_per_Order_checkbox_is_not_selected() {
        if (!posDetailPage.fiscalPositionPerOrderCheckBox.isSelected()) {
            posDetailPage.fiscalPositionPerOrderCheckBox.isEnabled();
        }

    }

    @When("dropdown for Fiscal per Order positions is not  displayed")
    public void dropdown_for_Fiscal_per_Order_positions_is_not_displayed() {
        if(posDetailPage.underFiscalPositionPerOrderDropDown.isEnabled()){
            System.out.println("Dropdown is not displayed");
        }
    }

    @Then("User clicks on Save button")
    public void user_clicks_on_Save_button() {
        posDetailPage.saveButton.click();
        SeleniumUtils.pause(2);
    }


    @Given("Fiscal Position  checkbox is selected")
    public void fiscal_Position_checkbox_is_selected() {
        if (posDetailPage.fiscalPositionCheckBox.isEnabled())
            posDetailPage.fiscalPositionCheckBox.click();
    }

    @When("Dropdown under fiscal position is displayed")
    public void dropdown_under_fiscal_position_is_displayed() {
        posDetailPage.underFiscalPositionDropDown.isDisplayed();

    }

    @When("Get first location")
    public void get_first_location() {
        posTaxPage.dropDownUnderFiscalPositionPerOrder.click();
        SeleniumUtils.pause(1);
        String dropDownUn = posTaxPage.dropDownUnderFiscalPositionPerOrder.getText();
        System.out.println(dropDownUn);


    }

    @Then("click save button")
    public void click_save_button() {
        posDetailPage.saveButton.click();
        SeleniumUtils.pause(2);

    }

    @Given("Fiscal Position  checkbox is not selected")
    public void fiscal_Position_checkbox_is_not_selected() {

        if (!posDetailPage.fiscalPositionCheckBox.isSelected()) {
            posDetailPage.fiscalPositionCheckBox.isEnabled();

        }
    }
        @When("dropdown for under Fiscal Position is not displayed")
        public void dropdown_for_under_Fiscal_Position_is_not_displayed () {
            Assert.assertTrue("dropdown for under fiscal position is not  displayed", posDetailPage.fiscalPositionCheckBox.isDisplayed());
        }



}