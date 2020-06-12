package com.co.calculadora.app.stepdefinition;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OperacionesBasicasStepDefinition {

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^ana ingresa a la app calculadora$")
    public void anaIngresaALaAppCalculadora() {

    }

    @Cuando("^realiza las operaciones basicas$")
    public void realizaLasOperacionesBasicas() {

    }

    @Entonces("^verifica si el resultado fue (\\d+)$")
    public void verificaSiElResultadoFue(int arg1) {

    }


}
