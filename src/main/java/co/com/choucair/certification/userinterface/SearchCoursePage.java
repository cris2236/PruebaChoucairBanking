package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {
    public static final Target SELECT_CATEGORY = Target.the("Categoria donde deseas realizar la busqueda").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target SEARCH_COURSE = Target.the("Barra de busqueda de cursos").located(By.id("coursesearchbox"));
    public static final Target CONFIRM_BUTTON = Target.the("Boton para realizar la busqueda").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target COURSE_NAME = Target.the("Nombre del curso a buscar").located(By.xpath("//a//preceding::h4[12]"));
    public static final Target NAME_COURSE = Target.the("Titulo del curso a identificar").located(By.xpath("//preceding::h4[12]"));
}