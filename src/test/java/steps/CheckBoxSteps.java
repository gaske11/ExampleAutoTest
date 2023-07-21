package steps;

import configs.WebDriverConfigs;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class CheckBoxSteps extends WebDriverConfigs {
    @Дано("Пользователь находится на странице со списком, содержащим чекбоксы")
    public void пользовательНаходитсяНаСтраницеСоСпискомСодержащимЧекбоксы() {
        checkBox
            .homePage()
            .goToElementsPage()
            .goToCheckBoxPage();
    }

    @Когда("нажата кнопка открытия всех выпадающих списков с чекбоксами")
    public void нажатаКнопкаОткрытияВсехВыпадающихСписковСЧекбоксами() {
        checkBox
            .clickToExpandAll();
    }

    @Тогда("найти чекбокс с текстом General и выбрать его")
    public void найтиЧекбоксСТекстомGeneralИВыбратьЕго() {
        checkBox
            .clickToSelectMenuCheckbox();
    }

    @И("проверить наличие сообщения об успешном выборе чекбокса с текстом General")
    public void проверитьНаличиеСообщенияОбУспешномВыбореЧекбоксаСТекстомGeneral() {
        checkBox
            .checkIfsuccessMessagePresented();
    }
}
