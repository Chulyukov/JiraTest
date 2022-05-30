package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class MainPageElems {
    public static SelenideElement buttonTasks = $x("//a[@class=\"aui-nav-item \"][1]");
    public static SelenideElement tasksNumber = $x("//div[@class=\"ghx-backlog-header js-marker-backlog-header\"]//parent::div[@class=\"ghx-issue-count\"]");
}
