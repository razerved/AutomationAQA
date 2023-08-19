package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard/";

    //Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");

    public TopMenuPage topMenuPage;
    public SideMenuPage sideMenuPage;
    //Блок инициализации
    public DashboardPage() {
        super();

        topMenuPage = new TopMenuPage();
        sideMenuPage = new SideMenuPage();
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    //Блок атомарных методов
    public SelenideElement getHeaderTitle(){
        //getTopPanel();
        return $(headerTitleLabelLocator);
    }

    //Блок комплексных методов




}
