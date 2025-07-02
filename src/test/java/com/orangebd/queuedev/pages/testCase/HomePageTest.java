package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.HomePage;
import com.orangebd.queuedev.pages.pages.LoginPage;
import com.orangebd.queuedev.pages.pages.ServicePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

HomePage homePage;
ServicePage servicePage;
@Test
    public void clickGetStarted(){
    servicePage=page.getInstance(LoginPage.class)
            .enterEmail("butig@leaps.ph")
            .enterPassword("butig")
            .clickLogin()
            .clickGetStarted();
    Assert.assertTrue(servicePage.isServiceDisplayed());
}
}
