package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.TicketPage;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BaseTest {
    TicketPage ticketPage;

    @BeforeMethod
    public void setupBrowser() {
        Configuration.headless =false;
        Configuration.startMaximized=true;
        Configuration.timeout= 10000;
        Configuration.browser = "chrome";
        ticketPage = new TicketPage();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() { getWebDriver().quit();}
}
