package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard/";

    //Блок описания локаторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");

    public TopMenuPage topMenuPage;
    public SideMenuPage sideMenuPage;
    //Блок инициализации
    public DashboardPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
        sideMenuPage = new SideMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl(){
        super.openPageByUrl(pagePath);
    }

    //Блок атомарных методов
    public WebElement getHeaderTitle(){
        //getTopPanel();
        return driver.findElement(headerTitleLabelLocator);
    }

    //Блок комплексных методов




}
