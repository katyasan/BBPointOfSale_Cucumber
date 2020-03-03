package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class CreatingPos_StepDef {
    PosCardsViewPage posCV = new PosCardsViewPage();
    PosListViewPage posLV = new PosListViewPage();
    PosCreatePage posCreatePage = new PosCreatePage();
    PosDetailPage posDetailPage = new PosDetailPage();



    @Given("User is logged into Brite ERP as a sales manager and on POS page")
    public void user_is_logged_into_Brite_ERP_as_a_sales_manager_and_on_POS_page() {
        LoginPage.getToPOSModule();
    }

    @Given("User click on list view icon")
    public void user_click_on_list_view_icon() {
        SeleniumUtils.waitForVisibility(posCV.listBox, 15);  // wait until list icon element display
        posCV.listBox.click();
    }

    @When("User click on create button")
    public void user_click_on_create_button() {
        posLV.createButton.click();
    }

    @Then("title should change to {string}")
    public void title_should_change_to(String title) {
        String expectedTitle = title;
        SeleniumUtils.waitForTitleLoaded(expectedTitle,10);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification FAILED",actualTitle, expectedTitle);
    }

    @Then("save and discard button should display")
    public void save_and_discard_button_should_display() {
        SeleniumUtils.waitForVisibility(posCreatePage.savePOSButton,10);
        Assert.assertTrue("Save button is not displayed",posCreatePage.savePOSButton.isDisplayed());
        SeleniumUtils.waitForVisibility(posCreatePage.discardButton,10);
        Assert.assertTrue("Discard button is not displayed",posCreatePage.discardButton.isDisplayed());
    }

    @When("User click on save button without entering name of POS")
    public void user_click_on_save_button_without_entering_name_of_POS() {
        posLV.createButton.click();
        if (posCreatePage.nameInputBoxOfPOS.getText().isEmpty()) {
            posCreatePage.savePOSButton.click();
        }
    }

    @Then("error notification should appear")
    public void error_notification_should_appear() {
        SeleniumUtils.waitForVisibility(posCreatePage.errorMessage, 15);
        //Checking if error (toast) notification is appear
        Assert.assertTrue("Error message is not displayed",posCreatePage.errorMessage.isDisplayed());
    }

    @When("User enter any name of POS into input box")
    public void user_enter_any_name_of_POS_into_input_box() {
        posLV.createButton.click();
        posCreatePage.nameInputBoxOfPOS.sendKeys("cbvc");
    }

    @When("click on discard button")
    public void click_on_discard_button() {
        posCreatePage.discardButton.click();
    }

    @Then("warning message should appear")
    public void warning_message_should_appear() {
        SeleniumUtils.waitForVisibility(posCreatePage.warningMessageSubmit, 15);
        Assert.assertTrue("Warning message is not displayed",posCreatePage.warningMessageSubmit.isDisplayed());

    }

    @When("user accept this message")
    public void user_accept_this_message() {
        posCreatePage.warningMessageSubmit.click();
    }

    @Then("It should navigate to previous page and title should change to {string}")
    public void It_should_navigate_to_previous_page_and_title_should_change_to(String title) {
        String expectedTitle = title;
        String actualTitle = Driver.getDriver().getTitle();
        SeleniumUtils.waitForTitleLoaded(expectedTitle,15);
        Assert.assertEquals("Title verification with discard button FAILED",expectedTitle, actualTitle);
    }


    @When("Enter a name of new POS and select company type")
    public void enter_a_name_of_new_POS_and_select_company_type() {
        SeleniumUtils.waitForClickability(posLV.createButton,10);
        posLV.createButton.click();
        //Enter name of POS
        posCreatePage.nameInputBoxOfPOS.sendKeys(Config.getProperty("nameNewPos"));
        //Choose operation type
        posDetailPage.underOperationTypeDropDown.click();
        SeleniumUtils.waitForVisibility(Driver.getDriver().findElement(By.linkText("YourCompany: 7yy")), 15);
        Driver.getDriver().findElement(By.linkText("YourCompany: 7yy")).click();
    }

    @When("click on save button")
    public void click_on_save_button() {
        posCreatePage.savePOSButton.click();
    }

    @Then("title should contains {string}")
    public void title_should_contains(String title) {
        String expectedTitle = Config.getProperty("nameNewPos") + title;
        SeleniumUtils.waitForTitleLoaded(expectedTitle,10);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Then("Edit button should appear")
    public void edit_button_should_appear() {
        SeleniumUtils.waitForVisibility(posDetailPage.editButton,10);
        Assert.assertTrue("Edit button is not displayed",posDetailPage.editButton.isDisplayed());
    }

    @When("user type name of recently created POS into search box and click enter")
    public void user_type_name_of_recently_created_POS_into_search_box_and_click_enter() {
        SeleniumUtils.waitForVisibility(posLV.searchField,10);
        posLV.searchField.sendKeys(Config.getProperty("nameNewPos") + Keys.ENTER);
    }

    @Then("it should display particular POS")
    public void it_should_display_particular_POS() {
        SeleniumUtils.waitForVisibility(posLV.firstPosInList, 15);
        String actualName = posLV.firstPosInList.getText();
        Assert.assertTrue("POS names mismatch",actualName.contains(Config.getProperty("nameNewPos")));
    }






}
