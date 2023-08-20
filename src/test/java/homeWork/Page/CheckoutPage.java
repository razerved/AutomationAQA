package homeWork.Page;

import com.codeborne.selenide.SelenideElement;
import homeWork.base.BasePage;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage extends BasePage {
    private final String  path = "/checkout-step-one.html";

    private final SelenideElement nameLocator = $("#first-name");
    private final SelenideElement lastNameLocator = $("#last-name");
    private final SelenideElement zipLocator = $("#postal-code");
    private final SelenideElement continueButtonLocator = $("#continue");


    public CheckoutPage() {
        super();
    }

    @Override
    protected SelenideElement getPageIdentifier() {
        return continueButtonLocator;
    }


    public SelenideElement getNameLocator() {
        return nameLocator;
    }
    public SelenideElement getLastNameLocator() {
        return lastNameLocator;
    }
    public SelenideElement getZipLocator() {
        return zipLocator;
    }

    public SelenideElement getContinueButtonLocator() {
        return continueButtonLocator;
    }

    public void setName(String name){
        getNameLocator().sendKeys(name);
    }
    public void setLastName(String lastName){
        getLastNameLocator().sendKeys(lastName);
    }
    public void setZip(String zipCode){
        getZipLocator().sendKeys(zipCode);
    }





}
