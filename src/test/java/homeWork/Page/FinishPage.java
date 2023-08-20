package homeWork.Page;

import com.codeborne.selenide.SelenideElement;
import homeWork.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class FinishPage extends BasePage {

    private final String path = "/checkout-step-two.html";

    private final SelenideElement finishButtonLocator = $("#finish");

    public FinishPage() {
        super();
    }

    @Override
    protected SelenideElement getPageIdentifier() {
        return finishButtonLocator;
    }


    public SelenideElement getFinishButtonLocator() {
        return finishButtonLocator;
    }




}
