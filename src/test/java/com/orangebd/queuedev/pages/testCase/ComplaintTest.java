package com.orangebd.queuedev.pages.testCase;

import com.orangebd.queuedev.pages.pages.queue.*;
import org.testng.annotations.Test;

public class ComplaintTest extends BaseTest {

    HomePage homePage;
    ServicePage servicePage;
    InqueyPage inqueyPage;
    AvailServicePage availServicePage;
    ComplaintPage complaintPage;
    Congratulations congratulations;

    @Test(priority = 1)
    //click the service inquery
    public void fillUpInqueryField() throws InterruptedException {
        homePage = page.getInstance(LoginPage.class)
                .enterEmail("butig@leaps.ph")
                .enterPassword("butig")
                .clickLogin()
                .clickGetStarted()
                .clcikComplaintPage()
                .ernterName("samman")
                .ernterEmail("samman@gmail.com")
                .mobileField("09552222223")
                .selectMale()
                .clcikservice()
                .clickPriority()
                .complaintDetails("Hay")
                .clcikCheckBox()
                .clcikNext()
                .generateToken();
    }
}
