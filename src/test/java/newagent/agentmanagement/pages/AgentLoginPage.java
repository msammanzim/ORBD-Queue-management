package newagent.agentmanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgentLoginPage extends BasePage {

    private final By user = By.xpath("//input[@id='email']");
    private final By pass = By.xpath("//input[@id='password']");
    private final By loginBtn = By.xpath("//button[@class='flex items-center px-4 py-2 bg-[#00B076] border border-transparent font-semibold text-white uppercase tracking-widest hover:bg-[#00B076] focus:bg-[#00B076] active:bg-[#00B076] focus:outline-none focus:ring-2 focus:ring-[#00B076] focus:ring-offset-2 transition ease-in-out duration-150 justify-center items-center rounded-[64px] bg-[#00B076] w-[100%] h-[45px] text-[14px]']");

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

    public AgentDashBoard clcikLoginBtn() {
        waitForElement(loginBtn);
        getWebElement(loginBtn).click();
        return getInstance(AgentDashBoard.class);
    }
}