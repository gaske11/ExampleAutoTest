package steps;

import configs.WebDriverConfigs;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

public class AccordionSteps extends WebDriverConfigs {
    @Дано("Пользователь находится на странице с виджетом аккордион")
    public void пользовательНаходитсяНаСтраницеСВиджетомАккордион() {
        accordion
            .homePage()
            .goToWidgetsPage()
            .goToAccordionPage();
    }

    @Когда("нажато открытие второй панели аккордиона")
    public void нажатоОткрытиеВторойПанелиАккордиона() {
        accordion
            .clickToOpenAccordionPanel();
    }

    @Тогда("проверить открылся ли аккордион виджет и отображается ли текст внутри")
    public void проверитьОткрылсяЛиАккордионВиджетИОтображаетсяЛиТекстВнутри() {
        accordion
            .checkIsPanelOpened();
    }
}
