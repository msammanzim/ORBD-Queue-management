package newagent.agentmanagement.testCases;

import newagent.agentmanagement.pages.AgentDashBoard;
import newagent.agentmanagement.pages.AgentLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AgentDashboardTestCase extends BaseTest {

    private AgentLoginPage agentLoginPage;
    private AgentDashBoard agentDashBoard;

    @Test(priority = 1)
    public void testSingleServiceCompletion() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        agentDashBoard = page.getInstance(AgentLoginPage.class)
                .fillUserName("butig1@leaps.ph")
                .fillPassword("12345678")
                .clickLoginBtn();

        Assert.assertTrue(agentDashBoard.isDisplayedProfile(), "Dashboard profile should be visible");

        agentDashBoard
                .clickReserve()
                .clickCall()
                .clickStart()
                .clickComplete()
                .commentText()
                .clickSubmit();
    }

    @Test(priority = 2)
    public void testMultipleServicesCompletion() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        agentDashBoard = page.getInstance(AgentLoginPage.class)
                .fillUserName("butig1@leaps.ph")
                .fillPassword("12345678")
                .clickLoginBtn();

        Assert.assertTrue(agentDashBoard.isDisplayedProfile(), "Dashboard profile should be visible");

        for (int i = 0; i < 3; i++) {
            agentDashBoard
                    .clickReserve()
                    .clickCall()
                    .clickStart()
                    .clickComplete()
                    .commentText()
                    .clickSubmit();
        }
    }

    @Test(priority = 3)
    public void testCompleteServiceWithAssertions() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        agentDashBoard = page.getInstance(AgentLoginPage.class)
                .fillUserName("butig1@leaps.ph")
                .fillPassword("12345678")
                .clickLoginBtn();

        Assert.assertTrue(agentDashBoard.isDisplayedProfile(), "Dashboard profile should be visible");

        agentDashBoard.clickReserve();

        agentDashBoard.clickCall();
        Assert.assertTrue(agentDashBoard.isStartButtonVisible(), "Start button should be visible");

        agentDashBoard.clickStart();
        Assert.assertTrue(agentDashBoard.isCompleteButtonVisible(), "Complete button should be visible");

        agentDashBoard.clickComplete();
        Assert.assertTrue(agentDashBoard.isCommentFieldVisible(), "Comment field should be visible");

        agentDashBoard.commentText();
        Assert.assertTrue(agentDashBoard.isSubmitButtonVisible(), "Submit button should be visible");

        agentDashBoard.clickSubmit();
        Assert.assertTrue(agentDashBoard.isNoTokenFound(), "Should return to 'No Token Reserved' state");
    }
}