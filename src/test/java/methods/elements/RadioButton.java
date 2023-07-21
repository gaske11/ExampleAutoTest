package methods.elements;

import configs.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButton extends BaseMethods {
    public RadioButton(WebDriver driver) {
        super(driver);
    }

    String elementsRadioButton = "//h5[text()='Elements']";
    String successText = "//span[@class='text-success']";
    String labelYes = "//label[@for='yesRadio']";
    String radioButtonTextToSelect = "Yes";
    String menuListRadioButton = "//span[@class='text' and text()='Radio Button']";


    public RadioButton homePage() {
        linkToHomePage.click();
        return this;
    }

    public RadioButton goToElementsPage() {
        clickBy(By.xpath(elementsRadioButton));
        return this;
    }

    public RadioButton goToRadioButtonPage() {
        if (mainHeader.getText().equalsIgnoreCase(titleOfPageGeneral)) {
            clickBy(By.xpath(menuListRadioButton));
        }
        return this;
    }

    public RadioButton clickOnYesInput() {
        clickBy(By.xpath(labelYes));
        return this;
    }

    public RadioButton checkIfsuccessMessagePresented() {
        checkText(By.xpath(successText), radioButtonTextToSelect);
        return this;
    }

}
