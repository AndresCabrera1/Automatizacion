package com.co.compra.web.stepdefinition;

import static com.co.compra.web.model.DatosPorDefecto.Builder.*;

import com.co.compra.web.question.ConfirmarCompra;
import com.co.compra.web.task.AgregarProducto;
import com.co.compra.web.task.DiligenciarCarroCompras;
import com.co.compra.web.task.InicioWeb;
import com.co.compra.web.userinterface.UrlInicioWeb;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static org.hamcrest.Matchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CompraWebStepDefinition {
    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^ana ingresa al portal web$")
    public void anaIngresaAlPortalWeb() {
        theActorCalled("ana").attemptsTo(
                InicioWeb.openUrl(UrlInicioWeb.UrlInicio)
        );
    }


    @Cuando("^visualiza el (.*) procede a realizar la compra$")
    public void visualizaElDellIGbProcedeARealizarLaCompra(String producto) {
        theActorInTheSpotlight().attemptsTo(
                AgregarProducto.carrito(producto),
                DiligenciarCarroCompras.enviar(porDefecto().getNombre(),porDefecto().getPais(),porDefecto().getCiudad(),porDefecto().getTarjetaCredito(),porDefecto().getMes(),porDefecto().getAno())
        );
    }

    @Entonces("^verifica el producto adquirido$")
    public void verificaElProductoAdquirido() {
        theActorInTheSpotlight().should(seeThat(ConfirmarCompra.datos(),is(true)).because("%s confirma los datos enviados %s"));
    }


}
