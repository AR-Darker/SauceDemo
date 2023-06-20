package tests;

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

    @BeforeMethod

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//не забудь иницализировать страницы
        loginPage = new LoginPage(driver);
        inventoryPage = new Inventorypage(driver);


    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        driver.quit();
    }}