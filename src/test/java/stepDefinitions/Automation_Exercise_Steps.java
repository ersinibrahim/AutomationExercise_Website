package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Cart_page;
import pages.Home_page;
import pages.Products_page;
import utilities.BaseDriver;

import java.util.ArrayList;

public class Automation_Exercise_Steps {

    Home_page home_page;
    Products_page products_page;
    Cart_page cart_page;

    WebDriver driver = BaseDriver.getDriver();
    Actions actions = new Actions(driver);
    ArrayList<String> products = new ArrayList<String>();
    ArrayList<Integer> prices = new ArrayList<Integer>();
    ArrayList<String> cart_products = new ArrayList<String>();
    ArrayList<Integer> cart_prices = new ArrayList<Integer>();


    public Automation_Exercise_Steps(Home_page home_page, Products_page products_page, Cart_page cart_page) {

        this.home_page = home_page;
        this.products_page = products_page;
        this.cart_page = cart_page;
    }


    @Given("^Navigate to AutomationExercise Website$")
    public void navigateToAutomationExerciseWebsite() {
        driver.get("https://automationexercise.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getCurrentUrl().contains("automationexercise"));

    }

    @When("^Click Products_Tab and Test products and View Cart Functionality$")
    public void clickProducts_TabAndTestProductsAndViewCartFunctionality() {

        home_page.clickFunction(home_page.products_button);
        //Assert.assertTrue(driver.getCurrentUrl().contains("products"));

        driver.get("https://automationexercise.com/products");

        prices.add(home_page.changeToIntiger(products_page.product1_price));
        products.add(products_page.product1_name.getText());




        // driver.switchTo().frame(0);


        //home_page.waitUntilClickable(home_page.product1_AddToCard_button);

        actions.moveToElement(products_page.product1_img);
        home_page.clickFunction(products_page.product1_AddToCard_button);

        home_page.clickFunction(home_page.continueShopping_button);

        prices.add(home_page.changeToIntiger(products_page.product2_price));
        products.add(products_page.product2_name.getText());

        actions.moveToElement(products_page.product2_img);
        home_page.clickFunction(products_page.product2_AddToCard_button);
        home_page.clickFunction(home_page.view_cart_button);

    }

    @Then("^Check Products, Prices and Quantities$")
    public void checkProductsPricesAndQuantities() {


        cart_prices.add(home_page.changeToIntiger(cart_page.cart_prices_str1));
        cart_prices.add(home_page.changeToIntiger(cart_page.cart_prices_str2));
        cart_products.add(cart_page.product1_details.getText());
        cart_products.add(cart_page.product2_details.getText());

        Assert.assertEquals(cart_prices.get(0), prices.get(0));
        Assert.assertEquals(cart_prices.get(1), prices.get(1));
        Assert.assertEquals(cart_products.get(0), products.get(0));
        Assert.assertEquals(cart_products.get(1), products.get(1));

        int firstproduct_quantity = home_page.changeToIntiger(cart_page.product1_quantity);
        int secondproduct_quantity = home_page.changeToIntiger(cart_page.product2_quantity);

        Assert.assertEquals(firstproduct_quantity, 1);
        Assert.assertEquals(secondproduct_quantity, 1);


    }
}
