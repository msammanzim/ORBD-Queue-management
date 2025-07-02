package com.orangebd.queuedev.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InqueyPage extends BasePage{
    public final By nameField=By.xpath("//input[@placeholder='i.e John doe']");
    public final By emailField= By.xpath("//input[@placeholder='i.e example@xyz.com']");
    public final By mobileField=By.xpath("//input[@placeholder='i.e 9212345671']");
   // private final By pumale=By.xpath("//div[@class='bg-[#009A67] text-white border-[#009A67] rounded-[25px] inline-flex items-center border border-[#ddddd] px-5 py-3 lg:px-8 lg:py-4 text-2xl lg:text-4xl font-medium transition shadow-sm hover:border-[#009A67] focus:outline-none outline-none cursor-pointer']");
    public final By male=By.xpath("//div[normalize-space()='Male']");
    public final By priorityLane=By.xpath("//div[normalize-space()='Regular']");
    public final By details=By.xpath("//textarea[@placeholder='i.e Inquiry Details']");
    public final By checkBox=By.xpath("//input[@id='terms']");
    public final By btnNext=By.xpath("//button[normalize-space()='Next']");
    public final By generateToken=By.xpath("//button[@id='generate-token']");

    public InqueyPage(WebDriver driver) {
        super(driver);
    }

    public boolean isNameDisplayed() {
        waitForElement(nameField);
        WebElement element = driver.findElement(nameField);
        return element.isDisplayed();
    }
    public InqueyPage ernterName(String name) {
        waitForElement(nameField);
        getWebElement(nameField).sendKeys(name);
        return this;
    }
    public InqueyPage ernterEmail(String email) {
        waitForElement(emailField);
        getWebElement(emailField).sendKeys(email);
        return this;
    }
    public InqueyPage mobileField(String mobile) {
        waitForElement(mobileField);
        getWebElement(mobileField).sendKeys(mobile);
        return this;
    }
    public InqueyPage selectMale(){
        waitForElement(male);
        getWebElement(male).click();
        return this;
    }
    public InqueyPage selectPriority(){
        waitForElement(priorityLane);
        getWebElement(priorityLane).click();
        return this;
    }
    public InqueyPage inquaryDetails(String Detils){
        waitForElement(details);
        getWebElement(details);
        return this;
    }
    public InqueyPage clcikCheckBox(){
        waitForElement(checkBox);
        getWebElement(checkBox).click();
        return this;
    }

    public InqueyPage clcikNext(){
        waitForElement(btnNext);
        getWebElement(btnNext).click();
        return this;
    }
    public Congratulations generateToken(){
        waitForElement(generateToken);
        getWebElement(generateToken).click();
        return getInstance(Congratulations.class);
    }




}

