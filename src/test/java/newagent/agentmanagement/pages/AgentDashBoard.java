package newagent.agentmanagement.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AgentDashBoard extends BasePage {

    private final By profile = By.xpath("//img[@alt='image']");
    private final By reserve = By.xpath("//button[contains(text(), 'Reserve') or .='Reserve']");
    private final By call = By.xpath("//*[contains(text(), 'Call')]");
    private final By start = By.xpath("//*[contains(text(), 'Start')]");
    private final By complete = By.xpath("//*[contains(text(), 'Complete')]");
    private final By comment = By.xpath("//textarea[@class='w-full border-none outline-none focus:outline-none']");
    private final By submit = By.xpath("//button[normalize-space()='Submit']");
    private final By notoken = By.xpath("//p[normalize-space()='No Token Reserved']");

    public AgentDashBoard(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedProfile() {
        waitForElement(profile);
        return getWebElement(profile).isDisplayed();
    }

    public boolean isWaitfor() {
        waitForElement(profile);
        return getWebElement(profile).isDisplayed();
    }

    public AgentDashBoard clickCounter() {
        waitForElementClickable(By.xpath("//p[normalize-space()='Butig Counter 1']"));
        getWebElement(By.xpath("//p[normalize-space()='Butig Counter 1']")).click();
        return this;
    }

    public boolean isNoTokenFound() {
        waitForElement(notoken);
        return getWebElement(notoken).isDisplayed();
    }

    public boolean isStartButtonVisible() {
        try {
            waitForElement(start);
            return getWebElement(start).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isCompleteButtonVisible() {
        try {
            waitForElement(complete);
            return getWebElement(complete).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isCommentFieldVisible() {
        try {
            waitForElement(comment);
            return getWebElement(comment).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isSubmitButtonVisible() {
        try {
            waitForElement(submit);
            return getWebElement(submit).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public AgentDashBoard clickReserve() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        try {
            // Wait for page to be fully loaded
            wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                    .executeScript("return document.readyState").equals("complete"));

            // Try multiple fallback locators
            By[] reserveLocators = new By[] {
                    By.xpath("//button[contains(text(), 'Reserve')]"),
                    By.xpath("//*[text()='Reserve']"),
                    By.xpath("//button[normalize-space()='Reserve']"),
                    By.xpath("//div[contains(@class, 'reserve')]//button")
            };

            boolean clicked = false;

            for (By locator : reserveLocators) {
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                    wait.until(ExpectedConditions.elementToBeClickable(locator));

                    WebElement reserveButton = driver.findElement(locator);

                    // Scroll and click
                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", reserveButton);
                    Thread.sleep(500); // Optional: Just to visually see in UI

                    reserveButton.click();
                    clicked = true;
                    break;

                } catch (Exception e) {
                    System.out.println("Locator failed: " + locator.toString());
                }
            }

            if (!clicked) {
                throw new RuntimeException("Reserve button not found with known locators.");
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to click Reserve button. Reason: " + e.getMessage(), e);
        }

        return this;
    }

    public AgentDashBoard clickCall() {
        waitForElementClickable(call);
        getWebElement(call).click();
        return this;
    }

    public AgentDashBoard clickStart() {
        waitForElementClickable(start);
        getWebElement(start).click();
        return this;
    }

    public AgentDashBoard clickComplete() {
        waitForElementClickable(complete);
        getWebElement(complete).click();
        return this;
    }

    public AgentDashBoard commentText() {
        waitForElement(comment);
        WebElement commentBox = getWebElement(comment);
        commentBox.clear();
        commentBox.sendKeys("hello");
        return this;
    }

    public AgentDashBoard clickSubmit() {
        waitForElementClickable(submit);
        getWebElement(submit).click();
        return this;
    }
}