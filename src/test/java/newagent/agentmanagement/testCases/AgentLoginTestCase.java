    package newagent.agentmanagement.testCases;

    import newagent.agentmanagement.pages.AgentDashBoard;
    import newagent.agentmanagement.pages.AgentLoginPage;
    import org.testng.Assert;
    import org.testng.annotations.DataProvider;
    import org.testng.annotations.Test;
    import java.time.Duration;

    public class AgentLoginTestCase extends BaseTest {
        private AgentLoginPage agentLoginPage;
        private AgentDashBoard agentDashBoard;

        @DataProvider(name = "invalidLoginData")
        public Object[][] getInvalidLoginData() {
            return new Object[][] {
                    {"invalid@email.com", "12345678", "Invalid credentials"},
                    {"", "12345678", "Email is required"},
                    {"butig1@leaps.ph", "", "Password is required"},
                    {"invalid-email", "12345678", "Invalid email format"}
            };
        }

        @Test(priority = 1)
        public void testSuccessfulLogin() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            agentDashBoard = page.getInstance(AgentLoginPage.class)
                    .fillUserName("butig1@leaps.ph")
                    .fillPassword("12345678")
                    .clickLoginBtn()
                            .clickReserve();

            Assert.assertTrue(agentDashBoard.isDisplayedProfile());
        }

        @Test(priority = 2)
        public void testLoginWithRememberMe() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            agentLoginPage = page.getInstance(AgentLoginPage.class)
                    .clearFields()
                    .fillUserName("butig1@leaps.ph")
                    .fillPassword("12345678");


            Assert.assertTrue(agentLoginPage.isLoginButtonEnabled());

            agentDashBoard = agentLoginPage.clickLoginBtn();
            Assert.assertTrue(agentDashBoard.isDisplayedProfile());
        }

    //    @Test(dataProvider = "invalidLoginData", priority = 3)
    //    public void testInvalidLogin(String username, String password, String expectedError) {
    //        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //
    //        agentLoginPage = page.getInstance(AgentLoginPage.class)
    //                .clearFields()
    //                .fillUserName(username)
    //                .fillPassword(password);
    //
    //        if (!username.isEmpty() && !password.isEmpty()) {
    //            agentLoginPage.clickLoginBtn();
    //        }
    //
    //        String actualError = agentLoginPage.getErrorMessage();
    //        Assert.assertEquals(actualError, expectedError);
    //    }

        @Test(priority = 3)
        public void testLoginFieldsVisibility() {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            agentLoginPage = page.getInstance(AgentLoginPage.class);

            Assert.assertTrue(agentLoginPage.isEmailFieldDisplayed());
            Assert.assertTrue(agentLoginPage.isPasswordFieldDisplayed());
            Assert.assertTrue(agentLoginPage.isLoginButtonEnabled());
        }
    }