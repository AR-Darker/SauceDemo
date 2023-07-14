package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.CartPage;
import pages.Inventorypage;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    Inventorypage inventoryPage;
    CartPage cartPage;
    @Parameters({"browser"})

    @BeforeMethod

    public void setUp(@Optional("chrome") String browser, ITestContext testContext) {
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            testContext.setAttribute("driver",driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }else{
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            testContext.setAttribute("driver",driver);

        }

//не забудь иницализировать страницы
        loginPage = new LoginPage(driver);
        inventoryPage = new Inventorypage(driver);
        cartPage = new CartPage(driver);


    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        driver.quit();
    }
}