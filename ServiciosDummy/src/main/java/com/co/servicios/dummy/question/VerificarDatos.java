package com.co.servicios.dummy.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.co.servicios.dummy.model.DatosServicios.*;

@Subject("verifica los datos en home de la pagina principal")
public class VerificarDatos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return getTrabajoActualizado().equalsIgnoreCase(getTrabajoConsultado()) && getNombreConsultado().get("first_name").concat(getNombreConsultado().get("last_name")).equalsIgnoreCase(getNombreActualizado().replace(" ",""));
    }

    public static VerificarDatos home(){
        return new VerificarDatos();
    }
}
