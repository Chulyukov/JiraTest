package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class VersionPageElems {
    public static SelenideElement buttonProjects = $x("//a[@title=\"Просмотр недавних проектов или списка всех проектов\"]");
    public static SelenideElement dropdownMenu = $x("//a[text()=\"Просмотр всех проектов\"]");
    public static SelenideElement buttonTestProject = $x("//a[@data-track-click=\"projects.browse.project\"]");
    public static SelenideElement requiredVersion = $x("//td[@class=\"versions-table__name\"]//child::a[1]");
    public static SelenideElement buttonReleases = $x("//a[@class=\"aui-nav-item \" and contains(@data-link-id, \"release\")]");
}
