package com.co.calculadora.app.task;

import com.co.calculadora.app.interaction.LoadingDriver;
import com.co.calculadora.app.interaction.PresionarTeclaCalculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;

import static com.co.calculadora.app.model.DatosOperacionesBasicas.setDiv;
import static com.co.calculadora.app.model.DatosOperacionesBasicas.setMult;
import static com.co.calculadora.app.userinterface.BotonesCalculadora.*;

public class Division implements Task {
    private final String dato1,dato2;

    public Division(String dato1, String dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    @Override
    @Step("{0} realiza una Division")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                PresionarTeclaCalculadora.enter(dato1),
                Click.on(TXT_DIV),
                PresionarTeclaCalculadora.enter(dato2),
                Click.on(TXT_IGUAL)
        );
        setDiv(Text.of(TXT_RESULTADO).viewedBy(actor).asString());
    }

    public static Performable total(String dato1, String dato2){
        return Tasks.instrumented(Division.class,dato1,dato2);
    }

}
