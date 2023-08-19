package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideMenuPage extends BasePage {
    private final By sidebarLocator = By.id("sidebar");

    public SideMenuPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return sidebarLocator;
    }


}
