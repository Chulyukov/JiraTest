package PageObject.PageSteps;

import PageObject.PageElements.VersionPageElems;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class VersionPageSteps extends VersionPageElems {
    @Step("Переходим в раздел \"Релизы\"")
    public static void goToReleases() {
        buttonProjects.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        dropdownMenu.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        buttonTestProject.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        buttonReleases.click();
    }

    @Step("Проверяем версию (должна быть 2.0)")
    public static void checkVersion() {
        assertEquals("Version 2.0", requiredVersion.getText());
    }
}
