package newagent.agentmanagement.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AgentDashBoard extends BasePage {
    private final By pfofile= By.xpath("//img[@alt='image']");
    private final By reserve=By.xpath("//div[@class='justify-between w-full h-full p-2 flex items-center rounded-xl rounded-[20px] border-[2px] border-[solid] border-[rgba(255,255,255,0.81)]']");
    private final By call=By.xpath("//body/div[@id='__nuxt']/div[@class='min-h-screen']/main/div[@class='min-h-[calc(100vh-75px)] flex flex-col justify-between items-center py-[10px]']/div[@class='h-full md:h-[calc(100vh-95px)] w-full px-3 flex flex-wrap flex items-center justify-center']/div[1]");
    private final By start=By.xpath("//body/div[@id='__nuxt']/div[@class='min-h-screen']/main/div[@class='min-h-[calc(100vh-75px)] flex flex-col justify-between items-center py-[10px]']/div[@class='h-full md:h-[calc(100vh-95px)] w-full px-3 flex flex-wrap flex items-center justify-center']/div[1]");
    public AgentDashBoard(WebDriver driver) {
        super(driver);
    }


    public boolean isDisplayedPfofile() {
        waitForElement(pfofile);
        WebElement element = driver.findElement(pfofile);
        return element.isDisplayed();
    }

    public AgentDashBoard clcickReserve() throws InterruptedException {
        waitForElement(reserve);
        Thread.sleep(2000);
        getWebElement(reserve).click();
        waitForElement(call);
        return this;
    }
    public AgentDashBoard clickCall() throws InterruptedException {
        waitForElement(call);
        Thread.sleep(2000);
        getWebElement(call).click();
        return this;
    }
    public AgentDashBoard clcikStart() throws InterruptedException {
        waitForElement(start);
        getWebElement(start).click();
        Thread.sleep(3000);
        return this;
    }




}