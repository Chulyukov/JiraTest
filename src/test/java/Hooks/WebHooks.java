package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;


public class WebHooks {
    @BeforeEach
    public void setWebDriverFormat() {
        Configuration.startMaximized = true;
        Configuration.headless = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] screenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }
}
