package methods.widgets;

import configs.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Autocomplete extends BaseMethods {
    public Autocomplete(WebDriver driver) {
        super(driver);
    }

    String autocompleteText= "White";
    String menuListAutocomplete = "//span[@class='text' and text()='Auto Complete']";
    String autocompleteInput = "//div[@id='autoCompleteMultiple']//div[@class='auto-complete__input']/input";
    String checkTextLocatedBy = "//div[contains(@class, 'auto-complete__multi-value__label')]";
    @FindBy(xpath = "//div[@id='autoCompleteMultiple']//div[@class='auto-complete__input']/input")
    WebElement autocompleteResultClick;

    public Autocomplete homePage() {
        linkToHomePage.click();
        return this;
    }

    public Autocomplete goToWidgetsPage() {
        clickBy(By.xpath(elementsWidgets));
        return this;
    }

    public Autocomplete goToAutocompletePage() {
        if (mainHeader.getText().equalsIgnoreCase(titleOfPageWidgets)) {
            clickBy(By.xpath(menuListAutocomplete));
        }
        return this;
    }

    public Autocomplete selectAutocompleteResult() {
        clickBy(By.xpath(autocompleteInput));
        writeText(By.xpath(autocompleteInput), "White");
        autocompleteResultClick.sendKeys(Keys.ENTER);
        return this;
    }

    public Autocomplete checkAutocompleteText() {
        checkText(By.xpath(checkTextLocatedBy), autocompleteText);
        return this;
    }
}
