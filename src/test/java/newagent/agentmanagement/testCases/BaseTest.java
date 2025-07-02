package newagent.agentmanagement.testCases;

import newagent.agentmanagement.pages.BasePage;
import newagent.agentmanagement.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected Page page;

    @BeforeMethod
    public void setupBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://queue.ph.orangebd.com/agent-login");
        page = new BasePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}