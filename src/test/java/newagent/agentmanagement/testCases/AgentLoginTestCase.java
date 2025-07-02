package newagent.agentmanagement.testCases;

import newagent.agentmanagement.pages.AgentDashBoard;
import newagent.agentmanagement.pages.AgentLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AgentLoginTestCase extends BaseTest {
    AgentLoginPage agentLoginPage;
    AgentDashBoard agentDashBoard;

    @Test
    public void doLoginWithPass() {
        agentDashBoard = page.getInstance(AgentLoginPage.class)
                .fillUserName("butig1@leaps.ph")
                .fillPassword("12345678")
                .clcikLoginBtn();


        Assert.assertTrue(agentDashBoard.isDisplayedPfofile());
    }
}