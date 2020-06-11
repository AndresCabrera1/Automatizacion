package com.co.servicios.dummy.task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.annotations.Step;

import static com.co.servicios.dummy.model.DatosServicios.setNombreConsultado;
import static com.co.servicios.dummy.model.DatosServicios.setTrabajoConsultado;
import static com.co.servicios.dummy.userinterface.Navegacion.Consultar;

public class ConsultarUsuario implements Task {
    private String idUser;

    public ConsultarUsuario(String idUser) {
        this.idUser = idUser;
    }

    @Override
    @Step("{0} visualiza los datos en el home ")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(Consultar.Url()+idUser));
        setTrabajoConsultado(SerenityRest.lastResponse().getBody().jsonPath().getString("ad.company"));
        setNombreConsultado(SerenityRest.lastResponse().getBody().jsonPath().getJsonObject("data"));
    }

    public static Performable obtener(String idUser){
        return Tasks.instrumented(ConsultarUsuario.class, idUser);
    }
}
