package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class HST_Technik extends Parent{

    public HST_Technik() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(id = "menu-item-11745")
    public WebElement themen_Tab;

    @FindBy(id = "menu-item-17591")
    public WebElement fokus_Mikroplastik;

    @FindBy(css = "a[class*='item-bfda3b2']")
    public WebElement youtube_symbol;

    @FindBy(xpath = "(//button[@jsname='tWT92d'])[1]")
    public WebElement youtubeCookies_RejectButton;

    @FindBy(xpath = "//div[@id='subscribe-button']/parent::div[@id='buttons']")
    public WebElement subscribeButton;


}
