package methods.elements;

import configs.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox extends BaseMethods {
    public CheckBox(WebDriver driver) {
        super(driver);
    }

    String collapsedMenuCheckboxesList = "//li[contains(@class, 'rct-node-expanded')]//span[@class='rct-title']";
    String expandAll = "//button[@title='Expand all']";
    String checkboxTextToSelect = "General";
    String elementsCheckBox = "//h5[text()='Elements']";
    String menuListCheckBox = "//span[@class='text' and text()='Check Box']";
    String successText = "//span[@class='text-success']";

    public CheckBox homePage() {
        linkToHomePage.click();
        return this;
    }

    public CheckBox goToElementsPage() {
        clickBy(By.xpath(elementsCheckBox));
        return this;
    }

    public CheckBox goToCheckBoxPage() {
        if (mainHeader.getText().equalsIgnoreCase(titleOfPageGeneral)) {
            clickBy(By.xpath(menuListCheckBox));
        }
        return this;
    }

    public CheckBox clickToExpandAll() {
        clickBy(By.xpath(expandAll));
        return this;
    }

    public CheckBox clickToSelectMenuCheckbox() {
        clickToSelectCheckBox(By.xpath(collapsedMenuCheckboxesList), checkboxTextToSelect);
        return this;
    }

    public CheckBox checkIfsuccessMessagePresented() {
        checkText(By.xpath(successText), checkboxTextToSelect);
        return this;
    }

}
