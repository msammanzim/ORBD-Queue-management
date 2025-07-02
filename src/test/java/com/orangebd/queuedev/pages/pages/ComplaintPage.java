package com.orangebd.queuedev.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComplaintPage extends BasePage{
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
   // private final By generateToken=By.xpath("//button[@id='generate-token']");
    private final By complaint= By.xpath("//input[@placeholder='i.e example@xyz.com']");
    private final By details=By.xpath("//textarea[@placeholder='i.e Complain Details']");
    public final By generateToken=By.xpath("//button[@id='generate-token']");
    public ComplaintPage(WebDriver driver) {
        super(driver);
    }
    public boolean isComplaintDisplayed() {
        waitForElement(complaint);
        WebElement element = driver.findElement(complaint);
        //return element.isDisplayed();
        return element.isDisplayed();
    }

    public ComplaintPage ernterName(String name) {
        waitForElement(nameField);
        getWebElement(nameField).sendKeys(name);
        return this;
    }
    public ComplaintPage ernterEmail(String email) {
        waitForElement(emailField);
        getWebElement(emailField).sendKeys(email);
        return this;
    }
    public ComplaintPage mobileField(String mobile) {
        waitForElement(mobileField);
        getWebElement(mobileField).sendKeys(mobile);
        return this;
    }
    public ComplaintPage selectMale(){
        waitForElement(male);
        getWebElement(male).click();
        return this;
    }
    public ComplaintPage clcikservice(){
        waitForElement(service);
        getWebElement(service).click();
        return this;
    }
    public ComplaintPage clickPriority(){
        waitForElement(priprity);
        getWebElement(priprity).click();
        return this;
    }
    public ComplaintPage complaintDetails(String Detils){
        waitForElement(details);
        getWebElement(details);
        return this;
    }
    public ComplaintPage clcikCheckBox(){
        waitForElement(chekBox);
        getWebElement(chekBox).click();
        return this;
    }
    public ComplaintPage clcikNext(){
        waitForElement(next);
        getWebElement(next).click();
        return this;
    }
    public Congratulations clickGenerateToken() {
        By generateToken = By.xpath("//button[@id='generate-token']");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for element
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(generateToken));

        // Scroll only if found (element not null)
        if (element != null) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);", element);

            element.click();
        } else {
            throw new RuntimeException("Generate Token button not found!");
        }

        return getInstance(Congratulations.class);
    }
}
