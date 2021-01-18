package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("boton que nos muestra el formulario de login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("campo para identificar el usuario para logear").located(By.name("username"));

    public static final Target INPUT_PASSWORD = Target.the("campos para identificar la contraseña para logear").located(By.name("password"));

    public static final Target CONFIRM_BUTTON = Target.the("boton para iniciar session").located(By.xpath("//div[@class='sign-up-btn text-center']//button"));
}