package tests;

import configs.BaseMethods;
import configs.Main;
import configs.WebDriverConfigs;
import io.github.bonigarcia.wdm.WebDriverManager;
import methods.elements.TextBox;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage extends WebDriverConfigs {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-cookie-encryption");
        options.addArguments("--disable-geolocation");
        options.addArguments("--force-skia-analytic-aa");
        options.addArguments("--allow-cross-origin-auth-prompt");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("disable-infobars");
        options.addArguments("start-maximized");

        //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/PageLoadStrategy.html
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);


        baseMethods = PageFactory.initElements(driver, BaseMethods.class);
        main = PageFactory.initElements(driver, Main.class);
        textBox = PageFactory.initElements(driver, TextBox.class);

        main.goTo();

        textBox
//            .homePage()
            .goToElementsPage()
            .goToTextBoxPage()
            .addUserName("Test user")
            .addEmail("test-user@test.com")
            .addCurrentAddress("Current address example text")
            .addPermanentAddress("Permanent address example text")
            .clickOnSubmit();
    }

}
