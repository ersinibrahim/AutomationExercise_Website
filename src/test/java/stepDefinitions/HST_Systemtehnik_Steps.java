package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HST_Technik;
import utilities.BaseDriver;

import java.util.ArrayList;

public class HST_Systemtehnik_Steps {

        HST_Technik hst_technik_page;
        WebDriver driver= BaseDriver.getDriver();
        Actions actions=new Actions(driver);
        String youtubeLink;

        public HST_Systemtehnik_Steps(HST_Technik hst_technik_page){

            this.hst_technik_page=hst_technik_page;
        }

    @Given("^Navigate to HST_Systemtechnik Website$")
    public void navigateToHST_SystemtechnikWebsite() {

            driver.get("https://hst.de/");
            driver.manage().window().maximize();


    }

    @When("^Click Fokus Mikroplastik under the Themen_Tab$")
    public void clickFokusMikroplastikUnderTheThemen_Tab() {

            hst_technik_page.waitUntilVisible(hst_technik_page.themen_Tab);
            actions.moveToElement(hst_technik_page.themen_Tab);
            actions.release().perform();
            hst_technik_page.fokus_Mikroplastik.click();

    }

    @Then("^Scroll down the page and click Youtube symbol$")
    public void scrollDownThePageAndClickYoutubeSymbol() {

            hst_technik_page.scrollToElement(hst_technik_page.youtube_symbol);
            youtubeLink= hst_technik_page.youtube_symbol.getAttribute("href");
            hst_technik_page.youtube_symbol.click();

    }

    @Then("^Check Page Url$")
    public void checkPageUrl() {

        ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
            hst_technik_page.scrollToElement(hst_technik_page.youtubeCookies_RejectButton);
            hst_technik_page.youtubeCookies_RejectButton.click();

            hst_technik_page.waitUntilVisible(hst_technik_page.subscribeButton);

        String youtube_Page= driver.getCurrentUrl();

        Assert.assertEquals(youtube_Page, youtubeLink);



    }
}
