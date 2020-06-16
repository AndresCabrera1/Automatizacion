package com.co.compra.web.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class CompraWebStepDefinition {
    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^ana ingresa al portal web$")
    public void anaIngresaAlPortalWeb() {

    }


    @Cuando("^visualiza el (.*) procede a realizar la compra$")
    public void visualizaElDellIGbProcedeARealizarLaCompra(String arg1) {

    }

    @Entonces("^verifica el producto adquirido$")
    public void verificaElProductoAdquirido() {

    }


}
