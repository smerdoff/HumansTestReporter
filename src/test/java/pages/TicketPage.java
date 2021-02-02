package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class TicketPage extends BasePage {
    private static final String URL = "https://humansinc.atlassian.net/browse/%s";
    private static final String TITLE_LOCATOR = "sc-gUlUPW";



    @Override
    public TicketPage openPage(String ticketNumber) {
        open(String.format(URL,ticketNumber));
        isPageOpened();
        return this;
    }

    @Override
    public TicketPage isPageOpened() {
        $(By.className("sc-jvEmr")).waitUntil(Condition.visible,300000);
        return this;
    }

    public TicketPage readTitle() {
        String currentTitle = $(By.className(TITLE_LOCATOR)).getText();
        return this;
    }

    public TicketPage validateEnteredURL(String ticketNumber){
        String expectedURL = "https://humansinc.atlassian.net/browse/" + ticketNumber;
        Assert.assertEquals(expectedURL,url(), "A wrong page is opened");
        return this;
    }
}
