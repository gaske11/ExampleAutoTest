package configs;

import org.openqa.selenium.WebDriver;

public class Main extends BaseMethods {

    String SITE_URL = "https://demoqa.com/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public Main goTo() {
        driver.get(SITE_URL);
        return this;
    }
}
