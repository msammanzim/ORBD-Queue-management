package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.queue.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceTest extends BaseTest{
    HomePage homePage;
    ServicePage servicePage;
    InqueyPage inqueyPage;
    AvailServicePage availServicePage;
    ComplaintPage complaintPage;
    @Test(priority = 1)
    //click the service inquery
    public void clickInquery(){
        inqueyPage=page.getInstance(LoginPage.class)
                .enterEmail("butig@leaps.ph")
                .enterPassword("butig")
                .clickLogin()
                .clickGetStarted()
                .clickInquery();
        Assert.assertTrue(inqueyPage.isNameDisplayed());

}
@Test(priority = 2)
//clcik the service availservice
    public void clickAvailService(){
   availServicePage =page.getInstance(LoginPage.class)
            .enterEmail("butig@leaps.ph")
            .enterPassword("butig")
            .clickLogin()
            .clickGetStarted()
                    .clcikAvailService();
    Assert.assertTrue(availServicePage.isServiceDisplayed());
}
    @Test(priority = 3)
    //clcik the clickcomplaint
    public void clickComplaint(){
        complaintPage =page.getInstance(LoginPage.class)
                .enterEmail("butig@leaps.ph")
                .enterPassword("butig")
                .clickLogin()
                .clickGetStarted()
                        .clcikComplaintPage();
        Assert.assertTrue(complaintPage.isComplaintDisplayed());
    }
}

