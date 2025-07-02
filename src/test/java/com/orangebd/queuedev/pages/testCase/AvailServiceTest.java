package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.queue.*;
import org.testng.annotations.Test;

public class AvailServiceTest extends BaseTest{
    HomePage homePage;
    ServicePage servicePage;
    InqueyPage inqueyPage;
    AvailServicePage availServicePage;
    ComplaintPage complaintPage;
    Congratulations congratulations;
    @Test(priority = 1)
    //click the service inquery
    public void fillUpInqueryField() throws InterruptedException {
        homePage=page.getInstance(LoginPage.class)
                .enterEmail("butig@leaps.ph")
                .enterPassword("butig")
                .clickLogin()
                .clickGetStarted()
                .clcikAvailService()
                .ernterName("samman")
                .ernterEmail("samman@gmail.com")
                .mobileField("09552222223")
                .selectMale()
                .clcikservice()
                .clickPriority()
                .clcikCheckBox()
                .clcikNext()
                .generateToken();
////                .clickInquery()
////                .ernterName("hello")
////                .ernterEmail("hello@gmail.com")
////                .mobileField("09552222222")
////                .selectMale()
//                .selectPriority()
//                .
}}
