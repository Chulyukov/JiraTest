package PageObject.PageSteps;

import PageObject.PageElements.TaskElems;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.Assert;
import java.time.Duration;
import static com.codeborne.selenide.Selenide.switchTo;
import static java.time.zone.ZoneRulesProvider.refresh;

public class TaskSteps extends TaskElems {
        @Step("Открываем окно заведения бага и пишем название тест-кейса")
        public static void setMainName() {
            Configuration.holdBrowserOpen = true;
            buttonCreateTask.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
            mainTheme.setValue("New Bug 01");
        }

        @Step("Заполняем поле \"Описание\"")
        public static void setDescription() {
            switchTo().frame("mce_0_ifr");
            iframeText.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
            iframeText.setValue("lololololo");
            switchTo().defaultContent();
        }

        @Step("Выставляем нужные версии для исправлений")
        public static void setVersion() {
            fixInVersions.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        }

        @Step("Заполняем поле \"Окружение\"")
        public static void setEnv() {
            switchTo().frame("mce_6_ifr");
            iframeText.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
            iframeText.setValue("hihihihihi");
            switchTo().defaultContent();
        }

        @Step("Выставляем затронутые версии")
        public static void setAffectedVersions() {
            affectedVersions.scrollIntoView(true).click();
        }

        @Step("Назначаем себя в роли исполнителя")
        public static void setRole() {
            buttonAppointMe.scrollIntoView(true).click();
        }

        @Step("Нажимаем кнопку \"Создать\"")
        public static void createBug() {
            buttonCreate.scrollIntoView(true).click();
            refresh();
        }

        @Step("Заходим в ранее заведенный баг, меняем статус и проверяем его")
        public static void setStatus() {
            linkMyBug.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
            if (popup.is(Condition.visible)) {
                popup.click();
            }
            buttonMoreStatus.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
            buttonStatusDone.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
            switch (statusCheck.getText()) {
                case "Готово":
                    Assert.assertEquals("ГОТОВО",statusCheck.getText());
                    break;
                default:
                    statusCheck.getText();
            }
        }
    }
