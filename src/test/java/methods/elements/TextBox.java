package methods.elements;

import configs.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class TextBox extends BaseMethods {
    public TextBox(WebDriver driver) {
        super(driver);
    }

    String userNameInput = "//input[@id='userName']";
    String userEmailInput = "//input[@id='userEmail']";
    String currentAddressTextArea = "//textarea[@id='currentAddress']";
    String permanentAddressTextArea = "//textarea[@id='permanentAddress']";
    String submitButton = "//button[@id='submit']";
    String textofElementName = "//p[@id='name']";
    String textofElementEmail = "//p[@id='email']";
    String textofElementCurrentAddress = "//p[@id='currentAddress']";
    String textofElementPermanentAddress = "//p[@id='permanentAddress']";
    String elementsTextBox = "//h5[text()='Elements']";

    String menuListTextBox = "//span[@class='text' and text()='Text Box']";
    String titleOfPage = "Text Box";

    public TextBox homePage() {
        linkToHomePage.click();
        return this;
    }

    public TextBox goToElementsPage() {
        clickBy(By.xpath(elementsTextBox));
        return this;
    }

    public TextBox goToTextBoxPage() {
        if (mainHeader.getText().equalsIgnoreCase(titleOfPageGeneral)) {
            clickBy(By.xpath(menuListTextBox));
        }
        return this;
    }

    public TextBox addUserName(String userNameField) {
        writeText(By.xpath(userNameInput), userNameField);
        return this;
    }

    public TextBox addEmail(String userEmailField) {
        writeText(By.xpath(userEmailInput), userEmailField);
        return this;
    }

    public TextBox addCurrentAddress(String currentAddress) {
        writeText(By.xpath(currentAddressTextArea), currentAddress);
        return this;
    }

    public TextBox addPermanentAddress(String permanentAddress) {
        writeText(By.xpath(permanentAddressTextArea), permanentAddress);
        return this;
    }

    public TextBox clickOnSubmit() {
        clickBy(By.xpath(submitButton));
        return this;
    }

    public TextBox checkIsCorrectFieldValues(String textOfNameField, String textOfEmailField, String textOfCurrentAddressField, String textOfPermanentAddressField) {
        checkTextOfNameField(By.xpath(textofElementName), textOfNameField);
        checkTextOfEmailField(By.xpath(textofElementEmail), textOfEmailField);
        checkTextOfCurrentAddressField(By.xpath(textofElementCurrentAddress), textOfCurrentAddressField);
        checkTextOfPermanentAddressField(By.xpath(textofElementPermanentAddress), textOfPermanentAddressField);
        return this;
    }

}
