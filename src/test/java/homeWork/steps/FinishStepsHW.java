package homeWork.steps;

import homeWork.Page.CompletePageHW;
import homeWork.base.BaseStepsHW;
import org.openqa.selenium.WebDriver;

public class FinishStepsHW extends BaseStepsHW {
    public FinishStepsHW(WebDriver wd) {
        super(wd);
    }

    public CompletePageHW clickButtonFinishPage() {
        finishPage.getFinishButtonLocator().click();
        return new CompletePageHW(wd);
    }
}
