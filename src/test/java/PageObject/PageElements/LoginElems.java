package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class LoginElems {
    public static SelenideElement inputLogin = $x("//input[@name = \"os_username\"]");
    public static SelenideElement inputPassword = $x("//input[@name = \"os_password\"]");
    public static SelenideElement error = $x("//div[contains(@id, \"error\") and contains(@class, \"aui-message-error\")]");
    public static SelenideElement buttonProjects = $x("//a[@title=\"Просмотр недавних проектов или списка всех проектов\"]");
    public static SelenideElement dropdownMenu = $x("//a[text()=\"Просмотр всех проектов\"]");
    public static SelenideElement buttonTestProject = $x("//a[@data-track-click=\"projects.browse.project\"]");
}
