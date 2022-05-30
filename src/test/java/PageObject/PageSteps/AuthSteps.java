package PageObject.PageSteps;

import PageObject.PageElements.LoginElems;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;
import static Configuration.Configuration.getConfigurationValue;
import static com.codeborne.selenide.Selenide.open;

public class AuthSteps extends LoginElems {
    @Step("Открываем страницу по ссылке {url}")
    public static void openUrl(String url) {
        open(url);
    }

    @Step("Заполняем все данные, попадаем в личный кабинет и переходим в проект \"Test\"")
    public static void authorization() {
        inputLogin.shouldBe(Condition.visible, Duration.ofSeconds(60))
                .click();
        inputLogin.setValue(getConfigurationValue("login"));
        inputPassword.shouldBe(Condition.visible, Duration.ofSeconds(60))
                .click();
        inputPassword.setValue(getConfigurationValue("password"));
        inputPassword.pressEnter();
        error.shouldNotBe(Condition.visible);
        buttonProjects.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        dropdownMenu.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        buttonTestProject.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
    }
}
