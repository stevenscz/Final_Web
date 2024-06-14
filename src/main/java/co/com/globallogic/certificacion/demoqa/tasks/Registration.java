package co.com.globallogic.certificacion.demoqa.tasks;

import co.com.globallogic.certificacion.demoqa.interactions.ScrollDownTo;
import co.com.globallogic.certificacion.demoqa.userinterfaces.StudentRegistrationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Registration implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(StudentRegistrationPage.TXT_NAME, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.TXT_NAME),
                Enter.theValue("Stevens").into(StudentRegistrationPage.TXT_NAME),
                Enter.theValue("Caicedo").into(StudentRegistrationPage.TXT_LAST_NAME),
                WaitUntil.the(StudentRegistrationPage.TXT_EMAIL, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.TXT_EMAIL),
                Enter.theValue("stevens.caicedo@globallogic.com").into(StudentRegistrationPage.TXT_EMAIL),
                WaitUntil.the(StudentRegistrationPage.RAD_GENDER, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.RAD_GENDER),
                WaitUntil.the(StudentRegistrationPage.RAD_GENDER, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(StudentRegistrationPage.RAD_GENDER),
                WaitUntil.the(StudentRegistrationPage.TXT_PHONE_NUMBER, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.TXT_PHONE_NUMBER),
                Enter.theValue("3187568899").into(StudentRegistrationPage.TXT_PHONE_NUMBER),
                WaitUntil.the(StudentRegistrationPage.INPUT_BIRTHDAY, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.INPUT_BIRTHDAY),
                Click.on(StudentRegistrationPage.INPUT_BIRTHDAY),
                Click.on(StudentRegistrationPage.PICKER_MONTH),
                Click.on(StudentRegistrationPage.PICKER_YEAR),
                Click.on(StudentRegistrationPage.PICKER_DAY),
                WaitUntil.the(StudentRegistrationPage.CHK_HOBBIES, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.CHK_HOBBIES),
                Click.on(StudentRegistrationPage.CHK_HOBBIES),
                WaitUntil.the(StudentRegistrationPage.TXT_ADDRESS, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.TXT_ADDRESS),
                Enter.theValue("Calle 123 Avenida siempre viva").into(StudentRegistrationPage.TXT_ADDRESS),
                WaitUntil.the(StudentRegistrationPage.BTN_SUBMIT, isEnabled()).forNoMoreThan(15).seconds(),
                ScrollDownTo.element(StudentRegistrationPage.BTN_SUBMIT),
                Click.on(StudentRegistrationPage.BTN_SUBMIT)
        );
    }

    public static Registration register() {
        return Tasks.instrumented(Registration.class);
    }
}
