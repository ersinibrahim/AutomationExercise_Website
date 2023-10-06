package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Cart_page {

    public Cart_page() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//td[@class='cart_price']/p)[1]")
    public WebElement cart_prices_str1;

    @FindBy(xpath = "(//td[@class='cart_price']/p)[2]")
    public WebElement cart_prices_str2;

    @FindBy(xpath = "(//button[@class='disabled'])[1]")
    public WebElement product1_quantity;

    @FindBy(xpath = "(//button[@class='disabled'])[2]")
    public WebElement product2_quantity;

    @FindBy(xpath = "(//a[@href='/product_details/1'])[1]")
    public WebElement product1_details;

    @FindBy(xpath = "(//a[@href='/product_details/2'])[1]")
    public WebElement product2_details;


}
