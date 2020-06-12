package com.co.calculadora.app.interaction;

import com.co.calculadora.app.userinterface.BotonesCalculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PresionarTeclaCalculadora implements Interaction {
    private String tecla;

    public PresionarTeclaCalculadora(String tecla) {
        this.tecla = tecla;
    }

    @Override
    @Step("{0} ingresa el numero  #tecla")
    public <T extends Actor> void performAs(T actor) {
        for (char c : tecla.toCharArray()) {
            actor.attemptsTo(
                    Click.on(
                            BotonesCalculadora.TXT_NUMEROCALCULADORA.of(Character.toString(c))
                    ));
        }
    }

    public static Interaction enter(String tecla){
        return instrumented(PresionarTeclaCalculadora.class, tecla);
    }
}

