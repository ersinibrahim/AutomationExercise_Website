package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.ArrayList;

public class Home_page extends Parent{

    public Home_page() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products_button;

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

    @FindBy(css = "button[class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping_button;

    @FindBy(xpath = "//a[@data-product-id='2']")
    public WebElement product2_AddToCard_button;

    @FindBy(xpath = "//a[@data-product-id='2']/parent::div/h2")
    public WebElement product2_price;

    @FindBy(css = "p[class='text-center']>a[href='/view_cart']")
    public WebElement view_cart_button;

    @FindBy(css="div[id='ad_position_box']")
    public WebElement ad_position_box;

    @FindBy(xpath="(//td[@class='cart_price']/p)[1]")
    public WebElement cart_prices_str1;

    @FindBy(xpath="(//td[@class='cart_price']/p)[2]")
    public WebElement cart_prices_str2;

    @FindBy(xpath="(//button[@class='disabled'])[1]")
    public WebElement product1_quantity;

    @FindBy(xpath="(//button[@class='disabled'])[2]")
    public WebElement product2_quantity;

    @FindBy(xpath = "(//a[@href='/product_details/1'])[1]")
    public WebElement product1_details;

    @FindBy(xpath = "(//a[@href='/product_details/2'])[1]")
    public WebElement product2_details;



}
