package com.co.servicios.dummy.task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static com.co.servicios.dummy.model.DatosServicios.*;
import static com.co.servicios.dummy.userinterface.Navegacion.Registrar;

public class RegistrarUsuario implements Task {

    private String correo,contrasena;

    public RegistrarUsuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    @Step("{0} Ingresa el correo:  #correo y contrasena: #contrasena para registrarse")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(Registrar.Url()).with(rq -> rq.header("Content-Type","application/json").body(
                "{\"email\":\""+correo+"\",\"password\": \""+contrasena+"\"}"
        )));

        setIdRegistro(SerenityRest.lastResponse().getBody().jsonPath().getString("id"));
        setCorreo(correo);
        setContrasena(contrasena);
    }

    public static Performable datos(String correo , String contrasena){
        return Tasks.instrumented(RegistrarUsuario.class, correo, contrasena);
    }
}
