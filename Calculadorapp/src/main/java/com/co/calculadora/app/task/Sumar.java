package com.co.calculadora.app.task;

import com.co.calculadora.app.interaction.LoadingDriver;
import com.co.calculadora.app.interaction.PresionarTeclaCalculadora;
import com.co.calculadora.app.userinterface.BotonesCalculadora;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;



public class Sumar implements Task {


    @Override
    @Step("{0} realiza una sumatoria")
    public <T extends Actor> void performAs(T actor) {
                actor.attemptsTo(LoadingDriver.time(),
                        PresionarTeclaCalculadora.enter("50000"),
                        PresionarTeclaCalculadora.enter("6999444")
        );
    }

    public static Performable total(){
        return Tasks.instrumented(Sumar.class);
    }


}
