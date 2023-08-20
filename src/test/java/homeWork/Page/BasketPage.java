package homeWork.Page;

import com.codeborne.selenide.SelenideElement;
import homeWork.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class BasketPage extends BasePage {
    private final String path = "/inventory.html";

    private final SelenideElement buttonCheckoutLocator = $("#checkout");



    public BasketPage() {
        super();
    }

    @Override
    protected SelenideElement getPageIdentifier() {
        return buttonCheckoutLocator;
    }


    public SelenideElement getButtonCheckoutLocator() {
        return buttonCheckoutLocator;
    }




}
