package steps;

import configs.WebDriverConfigs;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class RadioButtonSteps extends WebDriverConfigs {
    @Дано("Пользователь находится на странице со списком опций радио кнопок")
    public void пользовательНаходитсяНаСтраницеСоСпискомОпцийРадиоКнопок() {
        radioButton
            .homePage()
            .goToElementsPage()
            .goToRadioButtonPage();
    }

    @Когда("выбрана опция Yes из списка")
    public void выбранаОпцияYesИзСписка() {
        radioButton
            .clickOnYesInput();

    }

    @Тогда("проверить наличие сообщения об успешном выборе опции с текстом Yes")
    public void проверитьНаличиеСообщенияОбУспешномВыбореОпцииСТекстомYes() {
        radioButton
            .checkIfsuccessMessagePresented();
    }
}
