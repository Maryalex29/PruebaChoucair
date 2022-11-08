package co.com.choucair.prueba.stepdefinitions;

import co.com.choucair.prueba.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


class pruebaStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^MaryH quiere registrarse en la pagina Utest$")
    public void maryhQuiereRegistrarseEnLaPaginaUtest() {
        OnStage.theActorCalled("MaryH").wasAbleTo(OpenUp.thePage());
    }
    @When("^ella selecciona la opcion join today$")
    public void ellaSeleccionaLaOpcionJoinToday() {
    }
    @Then("^ella realiza el diligenciamiento del formulario$")
    public void ellaRealizaElDiligenciamientoDelFormulario() {
    }

}

