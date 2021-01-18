package co.com.choucair.stepdefinitions;

import co.com.choucair.certification.model.AcademyChoucairData;
import co.com.choucair.certification.questions.Answer;
import co.com.choucair.certification.tasks.Login;
import co.com.choucair.certification.tasks.OpenUp;
import co.com.choucair.certification.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;

public class stepdefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Christian quiere aprender automatizacion en la plataforma ChoucairAcademy$")
    public void christian_quiere_aprender_automatizacion_en_la_plataforma_ChoucairAcademy(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled("Christian").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    //No me ha funcionado la forma de mapeo al final, lo siento
    @When("^el busque el curso en la plataforma choucair Choucair Academy$")
    public void el_busque_el_curso_en_la_plataforma_choucair_Choucair_Academy(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    /*@Then("^el encuentra el curso llamado$")
    public void el_encuentra_el_curso_llamado(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }*/

    /*@Given("^Christian quiere aprender automatizacion en la Academy choucair$")
    public void christianQuiereAprenderAutomatizacionEnLaAcademyChoucair() {
        OnStage.theActorCalled("Christian").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^el busca un curso (.*) en la plaaforma choucair academy$")
    public void elBuscaUnCursoRecursosAutomatizacionBancolombiaEnLaPlaaformaChoucairAcademy(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    //Este metodo aun no he logrado implementarlo
    @Then("^el encuentra el curso llamado recursos (.*)$")
    public void elEncuentraElCursoLlamadoRecursosRecursosAutomatizacionBancolombia(String question) {
        //OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }*/
}
