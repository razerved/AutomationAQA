package homeWork.Page;

import homeWork.base.BasePageHW;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPageHW extends BasePageHW {
    private final static String path = "https://www.saucedemo.com/inventory.html";
    private final By goodsLocator = By.cssSelector(".inventory_item");
    private final By buttonLocator = By.cssSelector(".btn.btn_primary");
    private final By titleLocator = By.cssSelector(".title");
    private final By basketLocator = By.cssSelector(".shopping_cart_link");

    public ProductsPageHW(WebDriver wd) {
        super(wd);
    }

    @Override
    protected By getPageIdentifier() {
        return titleLocator;
    }

    public List<WebElement> getGoodsLocator() {
        return wd.findElements(goodsLocator);
    }

    public List<WebElement> getButtonLocator() {
        return wd.findElements(buttonLocator);
    }
    public WebElement getBasketLocator() {
        return wd.findElement(basketLocator);
    }








}
