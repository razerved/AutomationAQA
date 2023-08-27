package homeWork.steps;

import homeWork.Page.CompletePage;
import homeWork.base.BaseSteps;
import org.openqa.selenium.WebDriver;

public class FinishSteps extends BaseSteps {
    public FinishSteps(WebDriver wd) {
        super(wd);
    }

    public CompletePage clickButtonFinishPage() {
        finishPage.getFinishButtonLocator().click();
        return new CompletePage(wd);
    }
}
