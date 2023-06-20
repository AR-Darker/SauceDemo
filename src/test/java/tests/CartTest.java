package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.CartPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static pages.CartPage.*;
import static pages.LoginPage.LOGIN_BUTTON;

public class CartTest extends BaseTest{
    @Test
    public void CartButtonIsWorking(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();
        driver.findElement(By.xpath("//*[text()= 'Add to cart' and @id ='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//*[@class = 'shopping_cart_link']")).click();
        assertTrue(driver.findElement(By.xpath("//*[text()= 'Your Cart']")).isDisplayed());
    }
    @Test
    public void CheckOutButtonIsWorking(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();
        driver.findElement(By.xpath("//*[text()= 'Add to cart' and @id ='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//*[@class = 'shopping_cart_link']")).click();
        driver.findElement(CHECKOUT_BUTTON).click();
        assertTrue(driver.findElement(By.xpath("//*[text() = 'Checkout: Your Information']")).isDisplayed());

    }
    @Test

    public void ContinueButtonIsWorking(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();
        driver.findElement(By.xpath("//*[text()= 'Add to cart' and @id ='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//*[@class = 'shopping_cart_link']")).click();
        driver.findElement(CONTINUESHOPPING_BUTTON).click();
        assertTrue(driver.findElement(INVENTORYPAGE_CHECKER).isDisplayed());

    }
    @Test
    public void RemoveButtonIsWorking(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();
        driver.findElement(By.xpath("//*[text()= 'Add to cart' and @id ='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//*[@class = 'shopping_cart_link']")).click();
        driver.findElement(REMOVE_BUTTON).click();
        assertFalse(driver.findElement(REMOVE_BUTTON).isEnabled());
    }
    @Test
    public void CheckOutPriceCorrect(){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(LOGIN_BUTTON).click();}



}
