package homeWork.steps;

import homeWork.Page.CompletePageHW;
import homeWork.base.BaseStepsHW;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class FinishStepsHW extends BaseStepsHW {
    public FinishStepsHW(WebDriver wd) {
        super(wd);
    }

    @Step
    public CompletePageHW clickButtonFinishPage() {
        finishPage.getFinishButtonLocator().click();
        return new CompletePageHW(wd);
    }
}
