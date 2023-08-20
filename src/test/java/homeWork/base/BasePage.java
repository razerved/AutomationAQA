package homeWork.base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

    public BasePage() {
    }

    protected abstract SelenideElement getPageIdentifier();
    public void isPageOpen(){
        $(getPageIdentifier()).shouldBe(visible);
    }
}
