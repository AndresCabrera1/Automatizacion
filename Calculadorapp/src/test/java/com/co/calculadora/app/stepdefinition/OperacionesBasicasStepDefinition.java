package com.co.calculadora.app.stepdefinition;

import com.co.calculadora.app.model.DatosOperacionesBasicas;
import com.co.calculadora.app.question.TotalOperaciones;
import com.co.calculadora.app.task.Division;
import com.co.calculadora.app.task.Multiplicacion;
import com.co.calculadora.app.task.Restar;
import com.co.calculadora.app.task.Sumar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import net.serenitybdd.screenplay.actors.OnlineCast;
import static org.hamcrest.Matchers.is;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class OperacionesBasicasStepDefinition {

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }


    @Dado("^que ana realiza una suma (.*) \\+ (.*) y una resta (.*) - (.*)$")
    public void queAnaRealizaUnaSumaYUnaResta(String sum1, String sum2, String res1, String res2) {
        theActorCalled("ana").attemptsTo(
                Sumar.total(sum1,sum2),
                Restar.total(res1,res2)
        );
    }

    @Cuando("^realiza una divicion (.*) ÷ (.*) y mutiplicacion (.*) \\* (.*)$")
    public void realizaUnaDivicionYMutiplicacion(String div1, String div2, String mult1, String mult2) {
        theActorInTheSpotlight().attemptsTo(
                Division.total(div1,div2),
                Multiplicacion.total(mult1,mult2)
        );
    }

    @Entonces("^el resultado es perado es (.*)$")
    public void elResultadoEsPeradoEs(String resEsperado) {
        theActorInTheSpotlight().should(seeThat(TotalOperaciones.igual(resEsperado),is(true)).because("%s el esultado debe ser #resEsperado %s"));
    }
}
