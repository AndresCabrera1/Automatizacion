package com.co.calculadora.app.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class LoadingDriver implements Interaction {
    @Override
    @Step("{0} espera a que cargue la aplicacion")
    public <T extends Actor> void performAs(T actor) {
        WebDriver webDriver = getProxiedDriver();
        webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
    }

    public static Interaction time(){
        return instrumented(LoadingDriver.class);
}
    }
