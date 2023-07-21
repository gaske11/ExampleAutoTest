package steps;

import configs.WebDriverConfigs;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class TextBoxSteps extends WebDriverConfigs {

    @BeforeAll
    public static void initialization() {
        start();
        main
            .goTo();
    }

    @AfterAll
    public static void finish() {
        driver
            .quit();
    }

    @Дано("Пользователь находится на странице с текстовым полем")
    public void пользовательНаходитсяНаСтраницеСТекстовымПолем() {
        textBox
            .homePage()
            .goToElementsPage()
            .goToTextBoxPage();
    }

    @Когда("фокус находится в текстовом поле для введения имени, ввести значение {string}")
    public void фокусНаходитсяВТекстовомПолеДляВведенияИмениВвестиЗначение(String userNameField) {
        textBox
            .addUserName(userNameField);
    }

    @Тогда("перейти на следующее поле Email и ввести значение {string}")
    public void перейтиНаСледующееПолеEmailИВвестиЗначение(String userEmailField) {
        textBox
            .addEmail(userEmailField);
    }

    @И("перейти на следующее поле Current Address и ввести значение {string}")
    public void перейтиНаСледующееПолеCurrentAddressИВвестиЗначение(String userCurrentAddressField) {
        textBox
            .addCurrentAddress(userCurrentAddressField);
    }

    @И("перейти на следующее поле Permanent Address и ввести значение {string}")
    public void перейтиНаСледующееПолеPermanentAddressИВвестиЗначение(String userPermanentAddressField) {
        textBox
            .addPermanentAddress(userPermanentAddressField);
    }

    @И("нажать на кнопку откправки формы")
    public void нажатьНаКнопкуОткправкиФормы() {
        textBox
            .clickOnSubmit();
    }

    @И("проверить правильность отображения отправленных значений")
    public void проверитьПравильностьОтображенияОтправленныхЗначений() {
        textBox
            .checkIsCorrectFieldValues("Name:Test name", "Email:example@email.ru", "Current Address :Test address",
                "Permananet Address :Test Permanent address");
    }

}
