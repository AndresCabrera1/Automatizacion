package com.co.servicios.dummy.task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;
import net.thucydides.core.annotations.Step;

import static com.co.servicios.dummy.model.DatosServicios.*;
import static com.co.servicios.dummy.userinterface.Navegacion.Actualizar;

public class ActualizarUsuario implements Task {
    private String idUser,nombre, trabajo;

    public ActualizarUsuario(String idUser, String nombre, String trabajo) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.trabajo = trabajo;
    }

    @Override
    @Step("{0} Procede a actualizar sus datos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Put.to(Actualizar.Url()+idUser).with(rq ->
                rq.header("Content-Type","application/json").
                   header("Authorization", "Bearer "+ getToken()).
                   body("{\"name\":\""+nombre+"\",\"job\":\""+trabajo+"\"}")));
        setNombreActualizado(SerenityRest.lastResponse().getBody().jsonPath().getString("name"));
        setTrabajoActualizado(SerenityRest.lastResponse().getBody().jsonPath().getString("job"));
    }

    public static Performable ingrsar(String idUser, String nombre, String trabajo){
        return Tasks.instrumented(ActualizarUsuario.class, idUser,nombre,trabajo);
    }
}
