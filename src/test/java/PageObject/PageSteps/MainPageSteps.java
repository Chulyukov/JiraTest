package PageObject.PageSteps;

import PageObject.PageElements.MainPageElems;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.Assert;
import java.time.Duration;

public class MainPageSteps extends MainPageElems {
    @Step("Переходим в раздел \"Проекты\"")
    public static void goToTasks() {
        buttonProjects.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        dropdownMenu.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        buttonTestProject.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
        buttonTasks.shouldBe(Condition.visible, Duration.ofSeconds(60)).click();
    }

    @Step("Проверяем количество заведенных задач (должно быть больше 0)")
    public static void checkNumberOfTasks() {
        int val = Integer.parseInt(tasksNumber.shouldBe(Condition.visible, Duration.ofSeconds(60)).getText().substring(0, tasksNumber.getText().indexOf(" ")));
        Assert.assertTrue(val > 0);
    }

}
