package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.configuration.ReadProperties;

import java.time.Duration;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void userCanLogin() {
        Configuration.baseUrl = ReadProperties.getUrl();
        Configuration.timeout = 8000;
        //Configuration.browser = Browsers.CHROME;
        //Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.fastSetValue = true;
        Configuration.headless = false;
        //Configuration.fastSetValue = true; - быстрое вставление параметров ( не всегда работает )
        //Configuration.assertionMode = SOFT;

        open(ReadProperties.getUrl());
        //WebDriverRunner.getWebDriver().manage().window().maximize();
        //open("/");

        $(By.id("name")).setValue(ReadProperties.username()).pressTab();
        $("#password").val(ReadProperties.password());
        $("#button_primary").click();

        $(".page_title")
                .shouldBe(visible, Duration.ofSeconds(20))
                .should(text("All Projects"));

        open("/index.php?/admin/projects/overview");

        $$(By.className("hoverSensitive"))
                .shouldHave(size(2))
                .find(text("wp_test_01"))
                .find(By.tagName("a"))
                .click();

        $(byName("announcement"))
                .should(exist)
                .shouldBe(visible)
                .shouldHave(exactText("sdfsdf"));

        //$("sdfsdfs").uploadFile(new File("pathToFile"));
        //$("sdfsdf").download();

        sleep(1000);
        $("dfsd").innerHtml();
        $("dfsd").innerText();

        SelenideElement element = $(byText("sdfsdfsdf"));
        SelenideElement parentElement = element.parent();
    }


}
