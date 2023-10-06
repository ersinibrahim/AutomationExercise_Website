package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.ArrayList;

public class Home_page extends Parent {

    public Home_page() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products_button;


    @FindBy(css = "button[class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping_button;


    @FindBy(css = "p[class='text-center']>a[href='/view_cart']")
    public WebElement view_cart_button;


}
