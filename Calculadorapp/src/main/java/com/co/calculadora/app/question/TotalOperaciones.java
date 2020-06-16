package com.co.calculadora.app.question;

import static com.co.calculadora.app.model.DatosOperacionesBasicas.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("obtiene el resultado de la operacion realizada ")
public class TotalOperaciones implements Question<Boolean> {
    private String resEsperado;


    public TotalOperaciones(String resEsperado) {
        this.resEsperado = resEsperado;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        System.out.println(" -->" + (Double.parseDouble(getSuma()) + Double.parseDouble(getResta()) + Double.parseDouble(getMult()) + Double.parseDouble(getDiv())));

        return String.valueOf((Double.parseDouble(getSuma()) + Double.parseDouble(getResta()) + Double.parseDouble(getMult()) + Double.parseDouble(getDiv()))).equalsIgnoreCase(resEsperado);
    }

    public static TotalOperaciones igual( String resEsperado){
        return new TotalOperaciones(resEsperado);
    }
}
