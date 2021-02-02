package tests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class ReporterTest extends BaseTest {
    @Test()
    @Description("URL Validate")
    public void urlValidate() {
        ticketPage.openPage("FTAND-3697")
                .validateEnteredURL("FTAND-3697");
    }

}
