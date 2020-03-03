package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.PosDetailPage;
import pages.PosListViewPage;
import utilities.Driver;
import utilities.SeleniumUtils;

public class EditingPos_PosBoxHrdw_StepDef {
    PosListViewPage listView = new PosListViewPage();
      PosDetailPage dePa = new PosDetailPage();


    @Given("i logged as a Manager and click to Pos")
           public void i_logged_as_a_Manager_and_click_to_Pos() {
        LoginPage.getToPOSModule();
    }

    @Given("change view and choose first point of sale go to edit mode")
           public void change_view_and_choose_first_point_of_sale_go_to_edit_mode() {
           SeleniumUtils.pause(3);

        listView.listButton.click();
        Driver.getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[3]/div[3]/button[2]"));
        navigateToEditMode("ASD");
        dePa.editButton.click();

    }
    @When("User should be select Is a Bar Restaurant checkbox is selected")
         public void user_should_be_select_Is_a_Bar_Restaurant_checkbox_is_selected() {
              SeleniumUtils.pause(3);
                Assert.assertTrue("Is bar Restaurant not selected", dePa.isBarRestuarantCheckBox.isSelected());
    }

    @Then("Order Printers is Displayed")
          public void order_Printers_is_Displayed() {
                 SeleniumUtils.pause(3);
                        Assert.assertTrue("Order printer is not displayed",dePa.orderPrinters.isDisplayed());

    }

    @Then("Printers Dropped down is displayed")
          public void printers_Dropped_down_is_displayed() {
                 SeleniumUtils.pause(3);
                         Assert.assertTrue(dePa.underOrderPrintersDropDown.isDisplayed());
    }

    @Then("click the save button")
          public void click_the_save_button() {
                 dePa.saveButton.click();
                      SeleniumUtils.pause(3);
                             Assert.assertTrue("not saved",dePa.saveButton.isEnabled());
    }
    @When("User should see Barcode Nomenclature dropped down is displayed")
          public void user_should_see_Barcode_Nomenclature_dropped_down_is_displayed() {
                  Assert.assertTrue(dePa.underBarcodeScannerDefaultNomenclatureDropdown.isDisplayed());
    }


    @Then("user able to click the save button")
         public void user_able_to_click_the_save_button() {
                 dePa.saveButton.click();
    }

    public void navigateToEditMode(String nameOfPos) {
        PosListViewPage lv = new PosListViewPage();
        nameOfPos = nameOfPos.toLowerCase();
        for (WebElement pos : lv.namesOfPOS) {
            if (pos.getText().toLowerCase().contains(nameOfPos)) {
                pos.click();
                break;

            }
        }
    }
}


//                              MEHMET BICER
