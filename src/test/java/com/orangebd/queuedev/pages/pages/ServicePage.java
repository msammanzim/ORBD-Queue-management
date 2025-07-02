package com.orangebd.queuedev.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicePage extends BasePage{
    private final By service= By.xpath("//h1[@class='text-[26px] lg:text-[54px] font-semibold text-gray-900']");
    private final By inquery=By.xpath("//i[@class='text-[#FFF] text-[26px] lg:text-[54px] far fa-messages-question']");
    private final By availservice=By.xpath("//h1[normalize-space()='Avail Service']");
    private final By complaint=By.xpath("//a[@href='/service/complaint']//div[@class='w-[250px] lg:w-[500px] h-[144px] lg:h-[288px] rounded-[15px] lg:rounded-[20px] flex flex-col items-center justify-center']");

    public ServicePage(WebDriver driver) {
        super(driver);
    }
    public boolean isServiceDisplayed() {
        waitForElement(service);
        WebElement element = driver.findElement(service);
        return element.isDisplayed();
    }

    public InqueyPage clickInquery(){
        waitForElement(inquery);
        getWebElement(inquery).click();
        return getInstance(InqueyPage.class);

    }

    public AvailServicePage clcikAvailService(){
        waitForElement(availservice);
        getWebElement(availservice).click();
        return getInstance(AvailServicePage.class);
    }

    public ComplaintPage clcikComplaintPage(){
        waitForElement(complaint);
        getWebElement(complaint).click();
        return getInstance(ComplaintPage.class);

    }

}
