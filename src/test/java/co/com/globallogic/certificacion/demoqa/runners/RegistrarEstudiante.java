package co.com.globallogic.certificacion.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrar_estudiante.feature",
        glue = "co.com.globallogic.certificacion.demoqa.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class RegistrarEstudiante {
}
