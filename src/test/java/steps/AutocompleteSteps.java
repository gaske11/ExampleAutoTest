package steps;

import configs.WebDriverConfigs;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class AutocompleteSteps extends WebDriverConfigs {
    @Дано("Пользователь находится на странице с полем автопредложения")
    public void пользовательНаходитсяНаСтраницеСПолемАвтопредложения() {
        autocomplete
            .homePage()
            .goToWidgetsPage()
            .goToAutocompletePage();
    }

    @Когда("введено и выбрано значение из списка атопредложений")
    public void введеноИВыбраноЗначениеИзСпискаАтопредложений() {
        autocomplete
            .selectAutocompleteResult();
    }

    @Тогда("проверить выбор результата и отображение в инпуте")
    public void проверитьВыборРезультатаИОтображениеВИнпуте() {
        autocomplete
            .checkAutocompleteText();
    }
}
