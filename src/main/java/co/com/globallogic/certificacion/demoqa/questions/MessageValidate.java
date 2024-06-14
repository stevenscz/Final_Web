package co.com.globallogic.certificacion.demoqa.questions;

import co.com.globallogic.certificacion.demoqa.userinterfaces.StudentRegistrationPage;
import co.com.globallogic.certificacion.demoqa.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MessageValidate implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Constantes.MESSAGE.equals(Text.of(StudentRegistrationPage.MSG_FORMULARIO_COMPLETO).answeredBy(actor));
    }

    public static MessageValidate mensaje(){
        return new MessageValidate();
    }
}
