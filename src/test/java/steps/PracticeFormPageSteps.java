package steps;

import configs.WebDriverConfigs;
import io.cucumber.java.ru.*;

public class PracticeFormPageSteps extends WebDriverConfigs {
    @Дано("Пользователь находится на странице с формой")
    public void пользовательНаходитсяНаСтраницеСФормой() {
        formPage
            .homePage()
            .goToFormsPage()
            .goToPracticeFormPage();
    }

    @Когда("Пользователь вводит Имя и Фамилию")
    public void пользовательВводитИмяИФамилию() {
        formPage
            .addFirstName()
            .addLastName();

    }

    @И("вводит почтовый адресс")
    public void вводитПочтовыйАдресс() {
        formPage
            .addEmail();
    }

    @И("выбирает Пол")
    public void выбираетПол() {
        formPage
            .selectGender();
    }

    @И("вводит номер мобильного телефона")
    public void вводитНомерМобильногоТелефона() {
        formPage
            .addPhoneNumber();
    }

    @И("вводит Дату рождения")
    public void вводитДатуРождения() {
        formPage
            .addBirthDate();
    }

    @И("выбирает хобби")
    public void выбираетХобби() {
        formPage
            .selectHobbie();
    }

    @И("заполняет адресс")
    public void заполняетАдресс() {
        formPage
            .addCurrentAddress();
    }

    @Тогда("нажать кнопку Submit для отправки формы")
    public void нажатьКнопкуSubmitДляОтправкиФормы() {
        formPage
            .submitClick();
    }

    @Затем("проверить правильность введённых значений в форме")
    public void проверитьПравильностьВведённыхЗначенийВФорме() {
        formPage
            .checkModalHeader();
    }
}
