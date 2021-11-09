package stepdefinition;

import business.BCGeneral;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepsDefinitionCreate {

    private BCGeneral BCGeneral;

    public StepsDefinitionCreate(BCGeneral BCGeneral) {
        this.BCGeneral = BCGeneral;
    }

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^se abre la pagina web uTest$")
    public void se_abre_la_pagina_web_uTest() {
        BCGeneral.iniciarAplicacion("WWW.GOOGLE.COM");
        throw new PendingException();
    }

    @When("^se diligencia la informacion basica \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\"$")
    public void se_diligencia_la_informacion_basica_something_something_something_y_something(String nombre, String apellido, String correo, String fechadenacimiento) throws Throwable {
        BCGeneral.iniciarAplicacion("WWW.GOOGLE.COM");
    }

    @And("^se diligencia la informacion de georeferencia \"([^\"]*)\", \"([^\"]*)\" y \"([^\"]*)\"$")
    public void se_diligencia_la_informacion_de_georeferencia_something_something_y_something(String ciudad, String codigopostal, String pais) throws Throwable {
        BCGeneral.iniciarAplicacion("WWW.GOOGLE.COM");
    }

    @And("^se diligencia la informacion de dispositivos \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", y \"([^\"]*)\"$")
    public void se_diligencia_la_informacion_de_dispositivos_something_something_something_something_something_y_something(String movil, String modelomovil, String osmovil, String computadoros, String versionpc, String lenguajepc) throws Throwable {
        BCGeneral.iniciarAplicacion("WWW.GOOGLE.COM");
    }

    @And("^se diligencia las claves: \"([^\"]*)\"$")
    public void se_diligencia_las_claves_something(String contrasena) throws Throwable {
        BCGeneral.iniciarAplicacion("WWW.GOOGLE.COM");
    }

}