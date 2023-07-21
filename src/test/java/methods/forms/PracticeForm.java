package methods.forms;

import configs.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeForm extends BaseMethods {
    public PracticeForm(WebDriver driver) {
        super(driver);
    }

    String formsSection = "//h5[text()='Forms']";
    String firstName = "firstName";
    String lastName = "lastName";
    String userEmail = "userEmail";
    String userNumber = "userNumber";
    String monthDatePickerDropdown = "//select[@class='react-datepicker__month-select']";
    String yearDatePickerDropdown = "//select[@class='react-datepicker__year-select']";
    String hobbiesValues = "//input[@type='checkbox']/following-sibling::label";
    String currentAddressTextArea = "currentAddress";
    String modalHeaderText = "Thanks for submitting the form";
    String modalHeaderPath = "//div[@class='modal-header']/div";
    String checkStudentName = "//td[text()='Student Name']/following-sibling::td";
    String checkStudentEmail = "//td[text()='Student Email']/following-sibling::td";
    String checkStudentGender = "//td[text()='Gender']/following-sibling::td";
    String checkStudentMobile = "//td[text()='Mobile']/following-sibling::td";
    String checkStudentDateOfBirth = "//td[text()='Date of Birth']/following-sibling::td";
    String checkStudentHobbies = "//td[text()='Hobbies']/following-sibling::td";
    String checkStudentAddress = "//td[text()='Address']/following-sibling::td";


    @FindBy(xpath = "//input[@type='checkbox']/following-sibling::label")
    String selectCity;
    String selectState = "//input[@type='checkbox']/following-sibling::label";

    @FindBy(xpath = "//span[@class='text' and text()='Practice Form']")
    WebElement menuListForms;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirthInput;

    String genderOptions = "//input[@type='radio']/following-sibling::label";

    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitButton;

    @FindBy(id = "closeLargeModal")
    WebElement closeModalButton;

    String firstNameText = "Examplefirstname";
    String lastNameText = "Examplelastname";
    String emailText = "example@email.com";
    String genderToSelect = "Female";
    String phoneNumberText = "9900233703";
    String monthText = "7";
    String yearText = "1995";
    String monthTextToCheck = "15 August";
    String hobbieToSelect = "Music";
    String currentAddressText = "This is Example Current Address text";
    String dayOfMonth = "//div[@class='react-datepicker__week']/div[@role='option']";
    String textOfDay = "15";


    @FindBy(className = "main-header")
    public WebElement mainHeaderForm;


    public PracticeForm homePage() {
        linkToHomePage.click();
        return this;
    }

    public PracticeForm goToFormsPage() {
        clickBy(By.xpath(formsSection));
        return this;
    }

    public PracticeForm goToPracticeFormPage() {
        menuListForms.click();
//        if (mainHeader.getText().equalsIgnoreCase(titleOfPageForms)) {
//            menuListForms.click();
//        }
        return this;
    }

    public PracticeForm addFirstName() {
        writeText(By.id(firstName), firstNameText);
        return this;
    }

    public PracticeForm addLastName() {
        writeText(By.id(lastName), lastNameText);
        return this;
    }

    public PracticeForm addEmail() {
        writeText(By.id(userEmail), emailText);
        return this;
    }

    public PracticeForm selectGender() {
        clickToSelectCheckBox(By.xpath(genderOptions), genderToSelect);
        return this;
    }

    public PracticeForm addPhoneNumber() {
        writeText(By.id(userNumber), phoneNumberText);
        return this;
    }

    public PracticeForm addBirthDate() {
        dateOfBirthInput.click();
        selectOption(By.xpath(monthDatePickerDropdown), monthText);
        selectOption(By.xpath(yearDatePickerDropdown), yearText);
        clickToSelectCheckBox(By.xpath(dayOfMonth), textOfDay);
        dateOfBirthInput.sendKeys(Keys.ESCAPE);
        return this;
    }

    public PracticeForm selectHobbie() {
        clickToSelectCheckBox(By.xpath(hobbiesValues), hobbieToSelect);
        return this;
    }

    public PracticeForm addCurrentAddress() {
        writeText(By.id(currentAddressTextArea), currentAddressText);
        return this;
    }

    public PracticeForm submitClick() {
        submitButton.sendKeys(Keys.ENTER);
        return this;
    }

    public PracticeForm checkModalHeader() {
        checkText(By.xpath(modalHeaderPath), modalHeaderText);
        checkText(By.xpath(checkStudentName), firstNameText + " " + lastNameText);
        checkText(By.xpath(checkStudentEmail), emailText);
        checkText(By.xpath(checkStudentGender), genderToSelect);
        checkText(By.xpath(checkStudentMobile), phoneNumberText);
        checkText(By.xpath(checkStudentDateOfBirth), monthTextToCheck + "," + yearText);
        checkText(By.xpath(checkStudentHobbies), hobbieToSelect);
        checkText(By.xpath(checkStudentAddress), currentAddressText);
        closeModalButton.sendKeys(Keys.ESCAPE);
        return this;
    }
}
