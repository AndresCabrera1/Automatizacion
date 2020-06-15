package com.co.calculadora.app.stepdefinition;
import static com.co.calculadora.app.model.DatosOperacionesBasicas.*;

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
import static org.hamcrest.Matchers.stringContainsInOrder;

public class OperacionesBasicasStepDefinition {

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^Ana tiene (.*) manzanas, pero viene su hermano y se come (.*)$")
    public void anaTieneManzanasPeroVieneSuHermanoYSeCome(String dato1, String dato2) {
        theActorCalled("Ana").attemptsTo(
                Restar.total(dato1,dato2)
        );
    }

    @Cuando("^vienen tres amigos y se comen la mitad de las que quedan, pero traen el triple de las que se comio su hermano$")
    public void vienenAmigosYSeComenLaMitadDeLasQueQuedanPeroTraenElTripleDeLasQueSeComioSuHermano() {

        theActorInTheSpotlight().attemptsTo(
                Division.total(getResta(),"2"),
                Multiplicacion.total(getDiv(),"3"),
                Sumar.total(getSuma(),"2")
        );
    }

    @Entonces("^mas tarde su padre trae dos manzanas, resultado esperado (.*)$")
    public void masTardeSuPadreTraeDosManzanas(String resEsperado) {
        theActorInTheSpotlight().should(seeThat(TotalOperaciones.igual(resEsperado),is(true)).because("%s el esultado debe ser #resEsperado %s"));
    }


}
