package configs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

    plugin = {
        "pretty",
        "html:target/cucumber.html",
        "json:target/cucumber/cucumber.json"
    },
    features = {
        "src/resources/features/01_text_box_page.feature",
        "src/resources/features/02_check_box_page.feature",
        "src/resources/features/03_radio_button_page.feature",
        "src/resources/features/04_practice_form_page.feature",
        "src/resources/features/05_accordion_page.feature",
        "src/resources/features/06_autocomplete_page.feature",

    },
    glue = {"steps"},
    monochrome = true
)

public class ReportRunner {}
