package StepDefinition;

import Hooks.WebHooks;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.TextReportExtension;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import java.io.IOException;
import static PageObject.PageSteps.AuthSteps.*;
import static PageObject.PageSteps.MainPageSteps.checkNumberOfTasks;
import static PageObject.PageSteps.MainPageSteps.goToTasks;
import static PageObject.PageSteps.TaskSteps.*;
import static PageObject.PageSteps.VersionPageSteps.checkVersion;
import static PageObject.PageSteps.VersionPageSteps.goToReleases;
import static Configuration.Configuration.getConfigurationValue;

@Feature("Тестирование Jira")
@ExtendWith(TextReportExtension.class)
public class JiraTest extends WebHooks {

    @Tag("auth")
    @Test
    @Story("Проверяем авторизацию")
    public void checkAuth() throws IOException {
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        screenshot();
        Selenide.closeWindow();
    }

    @Tag("tasks")
    @Test
    @Story("Проверяем общее число задач")
    public void checkNumberOfTasksInProject() throws IOException {
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        goToTasks();
        checkNumberOfTasks();
        screenshot();
        Selenide.closeWindow();
    }

    @Tag("version")
    @Test
    @Story("Проверяем версию проекта")
    public void checkVersionOfProject() throws IOException {
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        goToReleases();
        checkVersion();
        screenshot();
        Selenide.closeWindow();
    }

    @Tag("newTask")
    @Test
    @Story("Заводим новый баг, меняем статус на \"Готово\" и проверяем его")
    public void createNewBugAndChangeVersion() throws IOException {
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        setMainName();
        setDescription();
        setVersion();
        setEnv();
        setAffectedVersions();
        setRole();
        createBug();
        setStatus();
        screenshot();
        Selenide.closeWindow();
    }
}
