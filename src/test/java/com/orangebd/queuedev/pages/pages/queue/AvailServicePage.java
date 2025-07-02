package com.orangebd.queuedev.pages.pages.queue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AvailServicePage extends BasePage {
    public final By nameField=By.xpath("//input[@placeholder='i.e John doe']");
    public final By emailField= By.xpath("//input[@placeholder='i.e example@xyz.com']");
    public final By mobileField=By.xpath("//input[@placeholder='i.e 9212345671']");
    // private final By pumale=By.xpath("//div[@class='bg-[#009A67] text-white border-[#009A67] rounded-[25px] inline-flex items-center border border-[#ddddd] px-5 py-3 lg:px-8 lg:py-4 text-2xl lg:text-4xl font-medium transition shadow-sm hover:border-[#009A67] focus:outline-none outline-none cursor-pointer']");
    public final By male=By.xpath("//div[normalize-space()='Male']");
    private final By availservice= By.xpath("//input[@placeholder='i.e John doe']");
    private final By service=By.xpath("//div[normalize-space()='Tourist Attractions']");
    private final By priprity=By.xpath("//div[normalize-space()='Regular']");
    private final By chekBox=By.xpath("//input[@id='terms']");
    private final By next=By.xpath("//button[normalize-space()='Next']");
    //private final By generateToken=By.xpath("//button[@id='generate-token']");
    public final By generateToken=By.xpath("//button[@id='generate-token']");
    public AvailServicePage(WebDriver driver) {
        super(driver);
    }
    public boolean isServiceDisplayed() {
        waitForElement(availservice);
        WebElement element = driver.findElement(availservice);
        return element.isDisplayed();
    }
    public AvailServicePage ernterName(String name) {
        waitForElement(nameField);
        getWebElement(nameField).sendKeys(name);
        return this;
    }
    public AvailServicePage ernterEmail(String email) {
        waitForElement(emailField);
        getWebElement(emailField).sendKeys(email);
        return this;
    }
    public AvailServicePage mobileField(String mobile) {
        waitForElement(mobileField);
        getWebElement(mobileField).sendKeys(mobile);
        return this;
    }
    public AvailServicePage selectMale(){
        waitForElement(male);
        getWebElement(male).click();
        return this;
    }
    public AvailServicePage clcikservice(){
        waitForElement(service);
        getWebElement(service).click();
        return this;
    }
    public AvailServicePage clickPriority(){
        waitForElement(priprity);
        getWebElement(priprity).click();
        return this;
    }
    public AvailServicePage clcikCheckBox(){
        waitForElement(chekBox);
        getWebElement(chekBox).click();
        return this;
    }
    public AvailServicePage clcikNext(){
        waitForElement(next);
        getWebElement(next).click();
        return this;
    }
    public HomePage generateToken() throws InterruptedException {
        waitForElement(generateToken);
        getWebElement(generateToken).click();
        Thread.sleep(4000);
        return getInstance(HomePage.class);
    }




}
