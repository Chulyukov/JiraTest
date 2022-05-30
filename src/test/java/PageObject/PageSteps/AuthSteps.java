package PageObject.PageSteps;

import PageObject.PageElements.LoginElems;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.Assert;

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
        System.out.println(accessAuth.getAttribute("title"));
        Assert.assertEquals("Пользовательский профиль для nchulykov", accessAuth.getAttribute("title"));
    }
}
