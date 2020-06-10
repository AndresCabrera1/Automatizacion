package com.co.servicios.dummy.task;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.thucydides.core.annotations.Step;

import static com.co.servicios.dummy.model.DatosServicios.setToken;
import static com.co.servicios.dummy.userinterface.Navegacion.login;

public class LoginUsuario implements Task {
    private String correo,contrasena;

    public LoginUsuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    @Step("{0} ingresa con las credenciales registradas correo: #correo y contrasena #contrasena")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(login.Url()).with(rq -> rq.header("Content-Type","application/json").body(
                "{\"email\":\""+correo+"\",\"password\": \""+contrasena+"\"}"
        )));

        setToken(SerenityRest.lastResponse().getBody().jsonPath().getString("token"));
    }

    public static Performable ingrsar(String correo , String contrasena){
        return Tasks.instrumented(LoginUsuario.class, correo, contrasena);
    }
}
