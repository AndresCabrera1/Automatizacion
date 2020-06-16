package com.co.calculadora.app.task;

import static com.co.calculadora.app.model.DatosOperacionesBasicas.*;
import static com.co.calculadora.app.userinterface.BotonesCalculadora.*;

import com.co.calculadora.app.interaction.LoadingDriver;
import com.co.calculadora.app.interaction.PresionarTeclaCalculadora;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;


public class Sumar implements Task {

    private String dato1,dato2;

    public Sumar(String dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    @Override
    @Step("{0} realiza una sumatoria")
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(LoadingDriver.time(),
                        PresionarTeclaCalculadora.enter(dato1),
                        Click.on(TXT_SUMA),
                        PresionarTeclaCalculadora.enter(dato2),
                        Click.on(TXT_IGUAL)
        );
        setSuma(Text.of(TXT_RESULTADO).viewedBy(actor).asString());

    }

    public static Performable total(String dato1,String dato2){
        return Tasks.instrumented(Sumar.class,dato1,dato2);
    }


}
