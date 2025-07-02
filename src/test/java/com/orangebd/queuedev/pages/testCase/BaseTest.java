package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.BasePage;
import com.orangebd.queuedev.pages.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected Page page;

    @BeforeMethod
    public void setupBrowser() {
       driver = new FirefoxDriver();
       // driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://queue-dev.ph.orangebd.com/login");
        page = new BasePage(driver); // If needed, cast to BasePage
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}