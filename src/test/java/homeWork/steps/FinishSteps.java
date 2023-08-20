package homeWork.steps;

import homeWork.Page.CompletePage;
import homeWork.base.BaseSteps;

public class FinishSteps extends BaseSteps {
    public FinishSteps() {
        super();
    }

    public CompletePage clickButtonFinishPage() {
        finishPage.getFinishButtonLocator().click();
        return new CompletePage();
    }
}
