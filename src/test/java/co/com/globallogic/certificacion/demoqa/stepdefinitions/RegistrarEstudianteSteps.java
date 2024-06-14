package co.com.globallogic.certificacion.demoqa.stepdefinitions;

import co.com.globallogic.certificacion.demoqa.questions.MessageValidate;
import co.com.globallogic.certificacion.demoqa.tasks.Registration;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class RegistrarEstudianteSteps {

    @Managed
    WebDriver driver;

    @Dado("Ingreso a la pagina web")
    public void ingresoALaPaginaWeb() {
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("Stevens");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/automation-practice-form"));
        driver.manage().window().maximize();
    }
    @Cuando("Lleno todos los campos del formulario")
    public void llenoTodosLosCamposDelFormulario() {
        OnStage.theActorInTheSpotlight().attemptsTo(Registration.register());
    }
    @Entonces("Verifico el mensaje del registro del estudiante exitosamente")
    public void verificoElMensajeDelRegistroDelEstudianteExitosamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(MessageValidate.mensaje()));
    }
}
