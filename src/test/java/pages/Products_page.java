package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Products_page extends Parent {

    public Products_page() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "img[src='/get_product_picture/1']")
    public WebElement product1_img;

    @FindBy(xpath = "(//img[@src='/get_product_picture/1'])/parent::div/p")
    public WebElement product1_name;

    @FindBy(xpath = "(//img[@src='/get_product_picture/2'])/parent::div/p")
    public WebElement product2_name;

    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement product1_AddToCard_button;

    @FindBy(css = "img[src='/get_product_picture/2']")
    public WebElement product2_img;

    @FindBy(xpath = "//a[@data-product-id='1']/parent::div/h2")
    public WebElement product1_price;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement product2_AddToCard_button;

    @FindBy(xpath = "//a[@data-product-id='2']/parent::div/h2")
    public WebElement product2_price;


}
