package com.co.servicios.dummy.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.Actor.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class RegistrarUsuarioStepDefinitions {

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que ana se registra con (.*) y (.*)$")
    public void queAnaSeRegistraConEveHoltReqresInYCityslicka(String correo,String contrasena) {
        theActorCalled("ana").attemptsTo();
    }

    @Cuando("^ingresa y actualiza su (.*) y (.*)$")
    public void ingresaYActualizaSuEveHoltYStatusCodeWeekly(String nombre, String Trabajo) {
        theActorInTheSpotlight().attemptsTo();
    }

    @Entonces("^verifica la informacion ingresada$")
    public void verificaLaInformacionIngresada() {
     theActorInTheSpotlight().should();
    }


}
