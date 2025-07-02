package com.orangebd.queuedev.pages.pages.queue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private final By welcomeText = By.xpath("//*[contains(text(),'Welcome to')]");
    private final  By getStarted=By.xpath("//button[@class='flex items-center px-4 py-2 bg-[#00B076] border border-transparent font-semibold text-white uppercase tracking-widest hover:bg-[#00B076] focus:bg-[#00B076] active:bg-[#00B076] focus:outline-none focus:ring-2 focus:ring-[#00B076] focus:ring-offset-2 transition ease-in-out duration-150 justify-center items-center rounded-[64px] bg-[#00B076] lg:w-[520px] px-10 h-[70px] lg:h-[125px] text-2xl lg:text-5xl']");
    public HomePage(WebDriver driver) {
        super(driver);


    }
    public boolean isWelcomeTextDisplayed() {
        waitForElement(welcomeText);
        WebElement element = driver.findElement(welcomeText);
        return element.isDisplayed();
    }
    public ServicePage clickGetStarted(){
        waitForElement(welcomeText);
        WebElement element = driver.findElement(By.xpath("//button[@class='flex items-center px-4 py-2 bg-[#00B076] border border-transparent font-semibold text-white uppercase tracking-widest hover:bg-[#00B076] focus:bg-[#00B076] active:bg-[#00B076] focus:outline-none focus:ring-2 focus:ring-[#00B076] focus:ring-offset-2 transition ease-in-out duration-150 justify-center items-center rounded-[64px] bg-[#00B076] lg:w-[520px] px-10 h-[70px] lg:h-[125px] text-2xl lg:text-5xl']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElement(getStarted);
        getWebElement(getStarted).click();
        return getInstance(ServicePage.class);
    }


}
