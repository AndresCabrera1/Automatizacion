package com.co.compra.web.task;

import static com.co.compra.web.userinterface.DiligenciarCarroComprasUI.*;

import com.co.compra.web.model.DataCarrito;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;



public class DiligenciarCarroCompras implements Task {

    private String nombre, pais, ciudad, tarjetaCredito, mes, ano;

    public DiligenciarCarroCompras(String nombre, String pais, String ciudad, String tarjetaCredito, String mes, String ano) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tarjetaCredito = tarjetaCredito;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    @Step("{0} diligencia los datos y procede a finalizar la compra")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CARRITO),
                Click.on(BTN_REALIZAR_PEDIDO),
                SendKeys.of(nombre).into(TXT_NOMBRE),
                SendKeys.of(pais).into(TXT_PAIS),
                SendKeys.of(ciudad).into(TXT_CIUDAD),
                SendKeys.of(tarjetaCredito).into(TXT_TC),
                SendKeys.of(mes).into(TXT_MES),
                SendKeys.of(ano).into(TXT_ANO),
                Click.on(BTN_COMPRA)
        );
        DataCarrito.setDatosTransaccion(TXT_DATOS_COMPRA.resolveAllFor(actor).get(0).getText().split("\n"));
    }


    public static Performable enviar(String nombre, String pais, String ciudad, String tarjetaCredito, String mes, String ano){
        return Tasks.instrumented(DiligenciarCarroCompras.class,nombre, pais, ciudad, tarjetaCredito, mes, ano);
    }
}
