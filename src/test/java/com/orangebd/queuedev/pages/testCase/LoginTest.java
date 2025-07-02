package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.queue.HomePage;
import com.orangebd.queuedev.pages.pages.queue.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
@Test
public void doLoginWithoutPass(){

    homePage=page.getInstance(LoginPage.class)
            .enterEmail("butig@leaps.ph")
            .enterPassword("butig")
            .clickLogin();
    Assert.assertTrue(homePage.isWelcomeTextDisplayed(), "Welcome text was not displayed after login!");

    //loginPage.clickLogin();


}

}
