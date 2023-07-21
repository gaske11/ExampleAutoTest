package configs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class BaseMethods {
    public WebDriver driver;
    public WebDriverWait wait;

    public BaseMethods(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //find main header of page to check correct page
    @FindBy(className = "main-header")
    public WebElement mainHeader;
    @FindBy(xpath = "//*[@id='app']/header/a")
    public WebElement linkToHomePage;

    public String titleOfPageGeneral = "Elements";
    public String titleOfPageWidgets = "Widgets";
    public String titleOfPageForms = "Practice Form";
    public String elementsWidgets = "//h5[text()='Widgets']";


    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
    }

    //Wait Frame Method
    public void waitVisibilityFrame(By elementBy) {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elementBy));
    }

    public void waitVisibilityPage(By elementBy) {
        wait.until(ExpectedConditions.presenceOfElementLocated(elementBy));
    }

    //Click by Element
    public void clickBy(By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    // Check Is Element Displayed
    public BaseMethods isElementDisplayed(By elementBy) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isDisplayed());
        return this;
    }

    // Wait until element will be clickable
    public void waitForFilling(By elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    //Write Text In Field located By
    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }

    //Check element according to Text
    public void checkText(By elementBy, String textToCheck) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).getText().equalsIgnoreCase(textToCheck));
    }

    public void checkTextOfNameField(By elementBy, String textOfName) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).getText().equalsIgnoreCase(textOfName));
    }

    public void checkTextOfEmailField(By elementBy, String textOfEmail) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).getText().equalsIgnoreCase(textOfEmail));
    }

    public void checkTextOfCurrentAddressField(By elementBy, String textOfCurrentAddress) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).getText().equalsIgnoreCase(textOfCurrentAddress));
    }

    public void checkTextOfPermanentAddressField(By elementBy, String textOfPermanentAddress) {
        waitVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).getText().equalsIgnoreCase(textOfPermanentAddress));
    }

    //Go to page to select checkbox and another list of multiple elements
    public void clickToSelectCheckBox(By elementBy, String textOfType) {
        waitVisibility(elementBy);
        List<WebElement> checkBoxElements = driver.findElements(elementBy);
        for (WebElement checkBox : checkBoxElements) {
            checkBox.getText();

            if (checkBox.getText().equalsIgnoreCase(textOfType)) {
                checkBox.click();
                break;
            }
        }
    }

    // Select option in dropdown
    public void selectOption(By elementBy, String textOfOption) {
        Select dropdown = new Select(driver.findElement(elementBy));
        dropdown.selectByValue(textOfOption);

    }

    // Check autocomplete results
    public void autocompleteResults(By elementBy) {
        waitVisibility(elementBy);
        List<WebElement> results = driver.findElements(elementBy);
        WebElement result = results.get(0);
        if (result.isDisplayed()) {
            result.click();
        }
    }

    // Scroll to Bottom of page
    public void executorScrollToBottom() {
        ((JavascriptExecutor) driver)
            .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    // Scroll to the Top of page
    public void executorScrollUp() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight, 0)");

    }

    // Switch focus to frame on page
    public void frameBodySwitch() {
        WebElement frameBody = driver.findElement(By.xpath("//iframe[contains(@class, 'cke_reset')]"));
        driver.switchTo().frame(frameBody);
    }

    // Return to default content of page (Used after working with frames on page)
    public void switchToDefaultFrame() {
        driver.switchTo().defaultContent();
    }


}
