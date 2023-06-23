package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pages.CartPage.CART_CHECKER;

public class InventoryTest extends BaseTest {

    @Test
    public void addItemToCart() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.addItemInCartByItemName("Sauce Labs Backpack");
        cartPage.openCartButtonClick();
        assertTrue(driver.findElement(By.xpath("//*[@class ='inventory_item_name'][text() = 'Sauce Labs Backpack']")).isDisplayed());


    }
}
