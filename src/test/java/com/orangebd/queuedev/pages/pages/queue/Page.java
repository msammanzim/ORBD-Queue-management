package com.orangebd.queuedev.pages.pages.queue;
import newagent.agentmanagement.pages.AgentLoginPage;
import com.orangebd.queuedev.pages.utill.General;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.List;

public abstract class Page {
    WebDriver driver;
    WebDriverWait wait;

    public Page(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(General.WAIT_TIME));
    }

    public abstract String getPageTitle();

    public abstract WebElement getWebElement(By locator);

    public abstract List<WebElement> getWebElements(By locator);

    public abstract void waitForElement(By locator);

    public <T extends BasePage> T getInstance(Class<T> tClass) {
        try {

            return tClass.getDeclaredConstructor(WebDriver.class).newInstance(driver);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

    }
}