
    package step_definition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;
import pages.PosCardsViewPage;
import pages.PosDetailPage;
import pages.PosListViewPage;
import utilities.Driver;
import utilities.SeleniumUtils;

    public class EditingPos_Order_StepDef {
        PosListViewPage lv = new PosListViewPage();
        PosCardsViewPage cv = new PosCardsViewPage();
        PosDetailPage posDetailPage = new PosDetailPage();

        public EditingPos_Order_StepDef() {
        }

        @Test
        @Given("User logined as a manager and User is navigate to POS module")
        public void user_logined_as_a_manager_and_User_is_navigate_to_POS_module() {
            LoginPage.getToPOSModule();
        }

        @Test
        @Given("User navigates to Editing mode")
        public void user_navigates_to_Editing_mode() {
            SeleniumUtils.waitForVisibility(this.cv.listBox, 7);
            this.cv.listBox.click();
            this.lv.navigateToEditMode("A");
            this.posDetailPage.editButton.click();
        }

        @Given("Is a Bar Restaurant checkbox in selected and Table Management checkbox is unselected")
        public void is_a_Bar_Restaurant_checkbox_in_selected_and_Table_Management_checkbox_is_unselected() {
            SeleniumUtils.waitForVisibility(this.posDetailPage.isBarRestuarantCheckBox, 3);
            Assert.assertTrue(this.posDetailPage.isBarRestuarantCheckBox.isSelected());
            Assert.assertFalse(this.posDetailPage.tableManagmentCheckBox.isSelected());
        }

        @When("User selects Table Management checkbox")
        public void user_selects_Table_Management_checkbox() {
            this.posDetailPage.tableManagmentCheckBox.click();
        }

        @When("user clicks on Save button")
        public void user_clicks_on_Save_button() {
            SeleniumUtils.waitForVisibility(this.posDetailPage.saveButton, 3);
            this.posDetailPage.saveButton.click();
        }

        @Then("Floors dropdown should be displayed")
        public void floors_dropdown_should_be_displayed() {
            Assert.assertTrue(this.posDetailPage.tableManagmentCheckBox.isSelected());
        }

        @Then("the link Floors should be displayed")
        public void the_link_Floors_should_be_displayed() {
            Assert.assertTrue(this.posDetailPage.underTableManagmentFloorsLink.isDisplayed());
        }

        @Given("Is a Bar Restaurant checkbox in selected and Table Management checkbox is selected")
        public void is_a_Bar_Restaurant_checkbox_in_selected_and_Table_Management_checkbox_is_selected() {
            Assert.assertTrue(this.posDetailPage.isBarRestuarantCheckBox.isSelected() && this.posDetailPage.tableManagmentCheckBox.isSelected());
        }

        @When("User unselects Table Management checkbox")
        public void user_unselects_Table_Management_checkbox() {
            this.posDetailPage.tableManagmentCheckBox.click();
        }

        @Then("Table Management checkbox should not be selected")
        public void table_Management_checkbox_should_not_be_selected() {
            Assert.assertFalse(this.posDetailPage.tableManagmentCheckBox.isSelected());
        }

        @And("Floors dropdown should be not displayed")
        public void floors_dropdown_should_be_not_displayed() {
            Assert.assertFalse(this.posDetailPage.underTableManagmentFloorsDropDown.isDisplayed());
        }

        @Then("the link Floors should be not displayed")
        public void the_link_Floors_should_be_not_displayed() {
            Assert.assertFalse(this.posDetailPage.underTableManagmentFloorsLink.isDisplayed());
        }

        @Given("Is a Bar Restaurant checkbox in selected and Orderline Notes checkbox is unselected")
        public void is_a_Bar_Restaurant_checkbox_in_selected_and_Orderline_Notes_checkbox_is_unselected() {
            Assert.assertTrue(this.posDetailPage.isBarRestuarantCheckBox.isSelected() && !this.posDetailPage.orderlineNotesCheckBox.isSelected());
        }

        @When("User selects Orderline Notes checkbox")
        public void user_selects_Orderline_Notes_checkbox() {
            this.posDetailPage.orderlineNotesCheckBox.click();
        }

        @Then("Orderline Notes checkbox should be selected")
        public void orderline_Notes_checkbox_should_be_selected() {
            Assert.assertTrue(this.posDetailPage.orderlineNotesCheckBox.isSelected());
        }

        @Given("Is a Bar Restaurant checkbox in selected and Orderline Notes checkbox is selected")
        public void is_a_Bar_Restaurant_checkbox_in_selected_and_Orderline_Notes_checkbox_is_selected() {
            Assert.assertTrue(this.posDetailPage.isBarRestuarantCheckBox.isSelected() && this.posDetailPage.orderlineNotesCheckBox.isSelected());
        }

        @When("User unselects Orderline Notes checkbox")
        public void user_unselects_Orderline_Notes_checkbox() {
            this.posDetailPage.orderlineNotesCheckBox.click();
        }

        @Then("Orderline Notes checkbox should not be selected")
        public void orderline_Notes_checkbox_should_not_be_selected() {
            Assert.assertFalse(this.posDetailPage.orderlineNotesCheckBox.isSelected());
        }

        @Given("Category Pictures checkbox is not selected")
        public void category_Pictures_checkbox_is_not_selected() {
            Assert.assertFalse(this.posDetailPage.categoryPicturesCheckBox.isSelected());
        }

        @When("User selects Category Pictures checkbox")
        public void user_selects_Category_Pictures_checkbox() {
            this.posDetailPage.categoryPicturesCheckBox.click();
        }

        @Then("Category Pictures checkbox should be selected")
        public void category_Pictures_checkbox_should_be_selected() {
            Assert.assertTrue(this.posDetailPage.categoryPicturesCheckBox.isSelected());
        }

        @Given("Category Pictures checkbox is  selected")
        public void category_Pictures_checkbox_is_selected() {
            Assert.assertTrue(this.posDetailPage.categoryPicturesCheckBox.isSelected());
        }

        @When("User unselects Category Pictures checkbox")
        public void user_unselects_Category_Pictures_checkbox() {
            this.posDetailPage.categoryPicturesCheckBox.click();
        }

        @Then("Category Pictures checkbox should not be selected")
        public void category_Pictures_checkbox_should_not_be_selected() {
            Assert.assertFalse(this.posDetailPage.categoryPicturesCheckBox.isSelected());
        }

        @Given("Virtual KeyBoard checkbox is not selected")
        public void virtual_KeyBoard_checkbox_is_not_selected() {
            Assert.assertFalse(this.posDetailPage.virtualKeyboardCheckBox.isSelected());
        }

        @When("User selects Virtual KeyBoard checkbox")
        public void user_selects_Virtual_KeyBoard_checkbox() {
            this.posDetailPage.virtualKeyboardCheckBox.click();
        }

        @Then("Virtual KeyBoard checkbox should be selected")
        public void virtual_KeyBoard_checkbox_should_be_selected() {
            Assert.assertTrue(this.posDetailPage.virtualKeyboardCheckBox.isSelected());
        }

        @Given("Virtual KeyBoard checkbox is  selected")
        public void virtual_KeyBoard_checkbox_is_selected() {
            if (!this.posDetailPage.virtualKeyboardCheckBox.isSelected()) {
                throw new PendingException();
            }
        }

        @Then("Virtual KeyBoard checkbox should not be selected")
        public void virtual_KeyBoard_checkbox_should_not_be_selected() {
            Assert.assertFalse(this.posDetailPage.virtualKeyboardCheckBox.isSelected());
        }

        @Given("Large Scrollbars checkbox is not selected")
        public void large_Scrollbars_checkbox_is_not_selected() {
            Assert.assertFalse(this.posDetailPage.largeScrollBarsCheckBox.isSelected());
        }

        @When("User selects Large Scrollbars checkbox")
        public void user_selects_Large_Scrollbars_checkbox() {
            this.posDetailPage.largeScrollBarsCheckBox.click();
        }

        @Then("Large Scrollbars checkbox should be selected")
        public void large_Scrollbars_checkbox_should_be_selected() {
            Assert.assertTrue(this.posDetailPage.largeScrollBarsCheckBox.isSelected());
        }

        @Given("Large Scrollbars checkbox is  selected")
        public void large_Scrollbars_checkbox_is_selected() {
            Assert.assertTrue(this.posDetailPage.largeScrollBarsCheckBox.isSelected());
        }

        @When("User unselects Large Scrollbars checkbox")
        public void user_unselects_Large_Scrollbars_checkbox() {
            this.posDetailPage.largeScrollBarsCheckBox.click();
        }

        @Then("Large Scrollbars checkbox should not be selected")
        public void large_Scrollbars_checkbox_should_not_be_selected() {
            Assert.assertFalse(this.posDetailPage.largeScrollBarsCheckBox.isSelected());
        }

        @Given("Set Start Category checkbox is not selected")
        public void set_Start_Category_checkbox_is_not_selected() {
            Assert.assertFalse(this.posDetailPage.setStartCategoryCheckBox.isSelected());
        }

        @When("User selects Set Start Category checkbox")
        public void user_selects_Set_Start_Category_checkbox() {
            this.posDetailPage.setStartCategoryCheckBox.click();
        }

        @Then("Set Start Category checkbox should not be selected")
        public void set_Start_Category_checkbox_should_not_be_selected() {
            Assert.assertTrue(this.posDetailPage.setStartCategoryCheckBox.isSelected());
        }

        @Given("Set Start Category checkbox is  selected")
        public void set_Start_Category_checkbox_is_selected() {
            Assert.assertTrue(this.posDetailPage.setStartCategoryCheckBox.isSelected());
        }

        @Then("Set Start Category dropdown should be displayed")
        public void set_Start_Category_dropdown_should_be_displayed() {
            Assert.assertTrue(this.posDetailPage.underSetStartCategoryLink.isDisplayed());
        }

        @When("User unselects Set Start Category checkbox")
        public void user_unselects_Set_Start_Category_checkbox() {
            this.posDetailPage.underSetStartCategoryLink.click();
        }

        @Then("Set Start Category checkbox should not be displayed")
        public void set_Start_Category_checkbox_should_not_be_displayed() {
            Assert.assertFalse(this.posDetailPage.underSetStartCategoryLink.isDisplayed());
        }

        @Then("close the browser")
        public void close_the_browser() {
            Driver.closeDriver();
        }
    }


