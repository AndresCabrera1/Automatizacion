package com.co.compra.web.question;

import static com.co.compra.web.model.DataCarrito.*;

import static com.co.compra.web.model.DatosPorDefecto.Builder.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Confirma la compra realizada ")
public class ConfirmarCompra implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return getDatosTransaccion()[2].replaceAll("Card Number: ","").equalsIgnoreCase(porDefecto().getTarjetaCredito()) &&
        getDatosTransaccion()[3].replaceAll("Name: ","").equalsIgnoreCase(porDefecto().getNombre()) ;
    }

    public static ConfirmarCompra datos(){
        return new ConfirmarCompra();
    }
}
