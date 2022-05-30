package PageObject.PageSteps;

import PageObject.PageElements.VersionPageElems;
import io.qameta.allure.Step;

import static org.junit.Assert.assertEquals;

public class VersionPageSteps extends VersionPageElems {
    @Step("Переходим в раздел \"Релизы\"")
    public static void goToReleases() {
        buttonReleases.click();
    }

    @Step("Проверяем версию (должна быть 2.0)")
    public static void checkVersion() {
        assertEquals("Version 2.0", requiredVersion.getText());
    }
}
