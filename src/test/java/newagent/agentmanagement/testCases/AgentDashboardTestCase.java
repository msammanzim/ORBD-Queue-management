package newagent.agentmanagement.testCases;

import newagent.agentmanagement.pages.AgentDashBoard;
import newagent.agentmanagement.pages.AgentLoginPage;
import org.testng.annotations.Test;

public class AgentDashboardTestCase extends BaseTest{
    AgentLoginPage agentLoginPage;
    AgentDashBoard agentDashBoard;

    @Test
    public void doReService() throws InterruptedException {
        agentDashBoard = page.getInstance(AgentLoginPage.class)
                .fillUserName("butig1@leaps.ph")
                .fillPassword("12345678")
                .clcikLoginBtn()
                .clcickReserve()
                .clickCall()
                .clcikStart();

}
}