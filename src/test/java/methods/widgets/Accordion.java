package methods.widgets;

import configs.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Accordion extends BaseMethods {
    public Accordion(WebDriver driver) {
        super(driver);
    }

//    String elementsWidgets = "//h5[text()='Widgets']";
    String menuListAccordion = "//span[@class='text' and text()='Accordian']";
    String secondPanelAccordion = "//div[@id='section2Heading']";
    String checkIsSecondPanelAccordionOpened = "//div[@id='section2Content']/p";

    public Accordion homePage() {
        linkToHomePage.click();
        return this;
    }

    public Accordion goToWidgetsPage() {
        clickBy(By.xpath(elementsWidgets));
        return this;
    }

    public Accordion goToAccordionPage() {
        if (mainHeader.getText().equalsIgnoreCase(titleOfPageWidgets)) {
            clickBy(By.xpath(menuListAccordion));
        }
        return this;
    }

    public Accordion clickToOpenAccordionPanel() {
        clickBy(By.xpath(secondPanelAccordion));
        return this;
    }

    public Accordion checkIsPanelOpened() {
        isElementDisplayed(By.xpath(checkIsSecondPanelAccordionOpened));
        return this;
    }
}
