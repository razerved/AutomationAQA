package homeWork.Page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import homeWork.base.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage extends BasePage {
    private final static String path = "/inventory.html";
    private final ElementsCollection goodsLocator = $$(".inventory_item");
    private final ElementsCollection buttonLocator = $$(".btn.btn_primary");
    private final SelenideElement titleLocator = $(".title");
    private final SelenideElement basketLocator = $(".shopping_cart_link");

    public ProductsPage() {
        super();
    }

    @Override
    protected SelenideElement getPageIdentifier() {
        return titleLocator;
    }

    public ElementsCollection getGoodsLocator() {
        return goodsLocator;
    }

    public ElementsCollection getButtonLocator() {
        return buttonLocator;
    }
    public SelenideElement getBasketLocator() {
        return basketLocator;
    }








}
