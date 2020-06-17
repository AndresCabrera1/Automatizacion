package com.co.compra.web.Interaction;

import com.co.compra.web.task.AgregarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class Alert implements Interaction {
    @Override
    @Step("{0} acepta la alerta del navegador")
    public <T extends Actor> void performAs(T actor) {
        WebDriver webDriver = getProxiedDriver();
        BrowseTheWeb.as(actor).withDriver(webDriver).waitFor(ExpectedConditions.alertIsPresent());
        BrowseTheWeb.as(actor).withDriver(webDriver).getAlert().accept();


    }

    public static Interaction aceptar(){
        return Tasks.instrumented(Alert.class);
    }
}
