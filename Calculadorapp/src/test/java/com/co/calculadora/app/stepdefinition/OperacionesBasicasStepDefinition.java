package com.co.calculadora.app.stepdefinition;
import com.co.calculadora.app.task.Sumar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OperacionesBasicasStepDefinition {

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }


    @Dado("^ana ingresa a la app calculadora y realiza una suma$")
    public void anaIngresaALaAppCalculadoraYRealizaUnaSuma() {
        theActorCalled("ana").attemptsTo(
                Sumar.total()
        );
    }

    @Cuando("^hace otras operaciones basicas$")
    public void haceOtrasOperacionesBasicas() {

    }


    @Entonces("^verifica si el resultado fue (\\d+)$")
    public void verificaSiElResultadoFue(int arg1) {

    }


}
