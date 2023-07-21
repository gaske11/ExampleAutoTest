package configs;

import io.github.bonigarcia.wdm.WebDriverManager;
import methods.elements.CheckBox;
import methods.elements.RadioButton;
import methods.elements.TextBox;
import methods.forms.PracticeForm;
import methods.widgets.Accordion;
import methods.widgets.Autocomplete;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class WebDriverConfigs {
    public static WebDriver driver;
    public static BaseMethods baseMethods;
    public static Main main;
    public static TextBox textBox;
    public static CheckBox checkBox;
    public static RadioButton radioButton;
    public static PracticeForm formPage;
    public static Accordion accordion;
    public static Autocomplete autocomplete;


    public static void start() {

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
        checkBox = PageFactory.initElements(driver, CheckBox.class);
        radioButton = PageFactory.initElements(driver, RadioButton.class);
        formPage = PageFactory.initElements(driver, PracticeForm.class);
        accordion = PageFactory.initElements(driver, Accordion.class);
        autocomplete = PageFactory.initElements(driver, Autocomplete.class);

    }

    public static void tearDown() {
        driver.quit();
    }

}
