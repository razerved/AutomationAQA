package homeWork.Page;

import com.codeborne.selenide.SelenideElement;
import homeWork.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class CompletePage extends BasePage {
    private final String path = "/checkout-complete.html";
    private final SelenideElement backHomeButtonLocator = $("[name='back-to-products']");
    public CompletePage() {
        super();
    }

    @Override
    protected SelenideElement getPageIdentifier() {
        return backHomeButtonLocator;
    }


    public SelenideElement getBackHomeButtonLocator() {
        return backHomeButtonLocator;
    }

    public void clickBackHomeButton(){
        getBackHomeButtonLocator().click();
    }



}
