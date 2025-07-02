package com.orangebd.queuedev.pages.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    // Locators
    private final By emailField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[contains(@class,'bg-[#00B076]')]");
    private final By welcomeMessage = By.xpath("//button[@class='flex items-center px-4 py-2 bg-[#00B076] border border-transparent font-semibold text-white uppercase tracking-widest hover:bg-[#00B076] focus:bg-[#00B076] active:bg-[#00B076] focus:outline-none focus:ring-2 focus:ring-[#00B076] focus:ring-offset-2 transition ease-in-out duration-150 justify-center items-center rounded-[64px] bg-[#00B076] lg:w-[618px] h-[45px] lg:h-[85px] text-[18px] lg:text-[32px] px-[53px] gap-[10px]']");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Actions
    public LoginPage enterEmail(String email) {
        waitForElement(emailField);
        getWebElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage enterPassword(String password) {
        waitForElement(passwordField);
        getWebElement(passwordField).sendKeys(password);
        return this;
    }

    public HomePage clickLogin() {
        getWebElement(loginButton).click();
        return getInstance(HomePage.class);
    }

    public boolean isWelcomeMessageDisplayed() {
        waitForElement(welcomeMessage);
        return getWebElement(welcomeMessage).isDisplayed();
    }
}