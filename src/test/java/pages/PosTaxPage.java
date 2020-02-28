package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PosTaxPage {
    public  PosTaxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Point of Sale')][1]")
    public  WebElement headerPOs;
    @FindBy(xpath =" //a[@data-menu-xmlid='point_of_sale.menu_pos_config_pos']")
    public WebElement postOfSaleConfig;

    @FindBy(xpath="(//td[@class='o_data_cell o_required_modifier'])[1]")
    public WebElement firstCheckBox;

    @FindBy(xpath= "//input[@id='o_field_input_418']")
    public  WebElement txtFromDropdown;


    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;

    @FindBy(xpath = "//input[@id='o_field_input_169']")
    public WebElement dropDownUnderFiscalPositionPerOrder;

   @FindBy(linkText ="NORTH AMERICA" )
    public  WebElement northAmerica;

}
