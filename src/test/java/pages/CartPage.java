package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.LoginPage.*;


public class CartPage extends BasePage {

    public static final By CHECKOUT_BUTTON = By.id("checkout");
    public static final By REMOVE_BUTTON = By.id("remove-sauce-labs-backpack");
    public static final By CONTINUESHOPPING_BUTTON = By.id("continue-shopping");
    public static final By INVENTORYPAGE_CHECKER = By.xpath("//*[text()='Products']");
    public static final By CART_CHECKER = By.xpath("//*[text()= 'Your Cart']");

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void open(){
        driver.get("https://www.saucedemo.com/");

    }
    public void login(){
        driver.findElement(USER_NAME).sendKeys("standard_user");
        driver.findElement(PASSWORD).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();

    }
    public boolean titleIsVisible(){
        return driver.findElement(CART_CHECKER).isDisplayed();
    }

}

