package PageObject.PageElements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class VersionPageElems {
    public static SelenideElement requiredVersion = $x("//td[@class=\"versions-table__name\"]//child::a[1]");
    public static SelenideElement buttonReleases = $x("//a[@class=\"aui-nav-item \" and contains(@data-link-id, \"release\")]");
}
