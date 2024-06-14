package co.com.globallogic.certificacion.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StudentRegistrationPage {

    public static final Target TXT_NAME = Target.the("Campo de texto Name")
            .located(By.id("firstName"));

    public static final Target TXT_LAST_NAME = Target.the("Campo de texto Last Name")
            .located(By.id("lastName"));

    public static final Target TXT_EMAIL = Target.the("Campo de texto EMAIL")
            .located(By.id("userEmail"));

    public static final Target RAD_GENDER = Target.the("Radio select gender")
            .located(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label"));

    public static final Target TXT_PHONE_NUMBER = Target.the("Campo de texto Phone number")
            .located(By.id("userNumber"));

    public static final Target INPUT_BIRTHDAY = Target.the("Input Birthday")
            .located(By.id("dateOfBirthInput"));

    public static final Target PICKER_MONTH = Target.the("Seleccionar mes")
            .located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select/option[5]"));

    public static final Target PICKER_YEAR = Target.the("Seleccionar anio")
            .located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select/option[91]"));

    public static final Target PICKER_DAY = Target.the("Seleccionar dia")
            .located(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[6]"));

    public static final Target INPUT_SUBJECTS = Target.the("Campo de texto Subjects")
            .located(By.xpath("//*[@id='subjectsContainer']/div/div[1]"));

    public static final Target SUBJECT_OPTION = Target.the("Subject Option")
            .located(By.xpath("//div[contains(@class, 'subjects-auto-complete__option')]"));

    public static final Target ENGLISH_OPTION_SUBJECT = Target.the("Campo de texto Subjects")
            .located(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]"));

    public static final Target CHK_HOBBIES = Target.the("Campo check Hobbies")
            .located(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));

    public static final Target BTN_UPLOAD_PICTURE = Target.the("Campo para subir una imagen")
            .located(By.id("uploadPicture"));

    public static final Target TXT_ADDRESS = Target.the("Campo de texto Address")
            .located(By.id("currentAddress"));

    public static final Target SEL_STATE = Target.the("Seleccionar State")
            .located(By.id("state"));

    public static final Target STATE_NCR = Target.the("Seleccionar State NCR")
            .located(By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]"));

    public static final Target SEL_CITY = Target.the("Seleccionar City")
            .located(By.id("city"));

    public static final Target CITY_NOIDA = Target.the("Seleccionar ciudad Noida")
            .located(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]"));

    public static final Target BTN_SUBMIT = Target.the("Boton Submit")
            .located(By.id("submit"));

    public static final Target BTN_CLOSE_MODAL = Target.the("Boton Close")
            .located(By.id("closeLargeModal"));

    public static final Target MSG_FORMULARIO_COMPLETO = Target.the("Mensaje de formulario completo")
            .located(By.id("example-modal-sizes-title-lg"));

}
