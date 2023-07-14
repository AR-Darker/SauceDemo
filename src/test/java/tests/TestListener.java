package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.printf("Test started: %s \n ",result.getName());
    }
    public void onTestSuccess(ITestResult result) {
        System.out.printf("Test success: %s \n ",result.getName());
    }
    public void onTestFailure(ITestResult result) {
        WebDriver driver = (WebDriver)result.getTestContext().getAttribute("driver");
        ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        System.out.printf("Test failure: %s \n ",result.getName());
    }
    //добавить все методы из тест листенера + добавить ретрай в сэйлсфорс
    //добавть дескриптион в сэйлс форс тесты
    //шипинги в сэйлфорс + *переход на контакт пэйдж и сделать там как в аккаунт пэйдж*
}
