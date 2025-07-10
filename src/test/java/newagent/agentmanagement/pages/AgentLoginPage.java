package newagent.agentmanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentLoginPage extends BasePage {

    private final By user = By.xpath("//input[@id='email']");
    private final By pass = By.xpath("//input[@id='password']");
    private final By loginBtn = By.xpath("//button[@id='login']");

    public AgentLoginPage(WebDriver driver) {
        super(driver);
    }

    public AgentLoginPage fillUserName(String username) {
        waitForElement(user);
        getWebElement(user).sendKeys(username);
        return this;
    }

    public AgentLoginPage fillPassword(String password) {
        waitForElement(pass);
        getWebElement(pass).sendKeys(password);
        return this;
    }

    public AgentDashBoard clickLoginBtn() {
        waitForElementClickable(loginBtn);
        getWebElement(loginBtn).click();
        return getInstance(AgentDashBoard.class);
    }

    public AgentLoginPage clearFields() {
        waitForElement(user);
        getWebElement(user).clear();
        waitForElement(pass);
        getWebElement(pass).clear();
        return this;
    }

    public boolean isEmailFieldDisplayed() {
        waitForElement(user);
        return getWebElement(user).isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        waitForElement(pass);
        return getWebElement(pass).isDisplayed();
    }

    public boolean isLoginButtonEnabled() {
        waitForElement(loginBtn);
        return getWebElement(loginBtn).isEnabled();
    }
}