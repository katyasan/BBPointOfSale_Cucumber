package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.PosListViewPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.concurrent.TimeUnit;

public class ListOfPos_ListView_StepDef {
    PosListViewPage posListViewPage = new PosListViewPage();
    SeleniumUtils seleniumUtils = new SeleniumUtils();

    @Given("User is logged into Brite EPR as a sales manager and on POS page")
    public void user_is_logged_into_Brite_EPR_as_a_sales_manager_and_on_POS_page() {
        LoginPage.getToPOSModule();
    }

    @Given("manager clicks on Products link from left menu")
    public void manager_clicks_on_Products_link_from_left_menu() {
        seleniumUtils.waitForVisibility(posListViewPage.products_link_from_left_menu, 20);
        seleniumUtils.waitForClickability(posListViewPage.products_link_from_left_menu, 20);
        posListViewPage.products_link_from_left_menu.click();
    }

//--------------------------------------------------------------------------
    @When("List view button is displayed on the page")
    public void list_view_button_is_displayed_on_the_page() {
        seleniumUtils.waitForVisibility(posListViewPage.listButton, 20);
    Assert.assertTrue("List view button verification FAILED!", posListViewPage.listButton.isDisplayed());
    }

    @Then("manager clicks on the List view button")
    public void manager_clicks_on_the_List_view_button() {
        seleniumUtils.waitForClickability(posListViewPage.listButton, 10);
posListViewPage.listButton.click();
    }

    @When("manager is on List of Products page")
    public void manager_is_on_List_of_Products_page() {
//        seleniumUtils.waitForVisibility(posListViewPage.head_of_the_page, 10);
//
//         String actualHead = posListViewPage.head_of_the_page.getText();
//
//        Assert.assertTrue("Products Title verification FAILED!", actualHead.contains("Products"));

        seleniumUtils.waitForClickability(posListViewPage.listButton, 20);
        posListViewPage.listButton.click();

        seleniumUtils.waitForVisibility(posListViewPage.selectAllCheckBox, 20);
  Assert.assertTrue("List of Products are not displayed in List view mode. Verification FAILED!",
          posListViewPage.selectAllCheckBox.isDisplayed());
    }

    @Then("Back and Forward buttons are displayed on the page")
    public void back_and_Forward_buttons_are_displayed_on_the_page() {
        seleniumUtils.waitForVisibility(posListViewPage.leftArrow, 10);
Assert.assertTrue("Left arrow is not displayed. Verification FAILED!",
        posListViewPage.leftArrow.isDisplayed());

seleniumUtils.waitForVisibility(posListViewPage.rightArrow, 10);
Assert.assertTrue("Right arrow is not displayed. Verification FAILED!",
        posListViewPage.rightArrow.isDisplayed());
    }

//--------------------------------------------------------------------------------
    @When("page limit is more than page value")
    public void page_limit_is_more_than_page_value() {
        seleniumUtils.waitForClickability(posListViewPage.listButton, 20);
        posListViewPage.listButton.click();

        seleniumUtils.waitForVisibility(posListViewPage.selectAllCheckBox, 10);
        Assert.assertTrue("List of Products are not displayed in List view mode. Verification FAILED!",
                posListViewPage.selectAllCheckBox.isDisplayed());

        String expectedNumber = posListViewPage.page_limit_button.getText();
        String actualNumber = posListViewPage.page_value_button.getText();

     Assert.assertTrue("Page limit is NOT more than page value. Verification FAILED! "
             ,actualNumber.
                     contains(expectedNumber));
    }

    @When("manager clicks on forward button")
    public void manager_clicks_on_forward_button() {
seleniumUtils.waitForVisibility(posListViewPage.rightArrow, 10);
seleniumUtils.waitForClickability(posListViewPage.rightArrow, 10);
        posListViewPage.rightArrow.click();
    }

    @Then("Products list should appear and page value starts from 81")
    public void products_list_should_appear_and_page_value_starts_from_81() {
seleniumUtils.waitForVisibility(posListViewPage.page_value_button, 10);

//        Assert.assertTrue("After clicking next page List of Products are not displayed in List view mode. Verification FAILED!",
//                posListViewPage.selectAllCheckBox.isDisplayed());
        Assert.assertTrue("After clicking next page value doesn't change to 81. Verification FAILED!"
                ,posListViewPage.page_value_button.getText().contains("81-"));
    }

}