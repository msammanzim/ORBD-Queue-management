package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InqueryTest extends BaseTest{
    HomePage homePage;
    ServicePage servicePage;
    InqueyPage inqueyPage;
    AvailServicePage availServicePage;
    ComplaintPage complaintPage;
    Congratulations congratulations;
    @Test(priority = 1)
    //click the service inquery
    public void fillUpInqueryField(){
        congratulations=page.getInstance(LoginPage.class)
                .enterEmail("butig@leaps.ph")
                .enterPassword("butig")
                .clickLogin()
                .clickGetStarted()
                .clickInquery()
                        .ernterName("hello")
                                .ernterEmail("hello@gmail.com")
                                        .mobileField("09552222222")
                .selectMale()
                .selectPriority()
                .inquaryDetails("hello this is automation script")
                .clcikCheckBox()
                .clcikNext()
                .generateToken();

        //Assert.assertTrue(inqueyPage.isNameDisplayed());

    }
}
