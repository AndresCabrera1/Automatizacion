package com.co.servicios.dummy.stepdefinition;

import com.co.servicios.dummy.question.VerificarDatos;
import com.co.servicios.dummy.task.ActualizarUsuario;
import com.co.servicios.dummy.task.ConsultarUsuario;
import com.co.servicios.dummy.task.LoginUsuario;
import com.co.servicios.dummy.task.RegistrarUsuario;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static com.co.servicios.dummy.model.DatosServicios.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.is;

public class RegistrarUsuarioStepDefinitions {
    private  EnvironmentVariables environmentVariables;

    @Before
    public void prepareStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que ana se registra con (.*) y (.*)$")
    public void queAnaSeRegistraConEveHoltReqresInYCityslicka(String correo,String contrasena) {
        theActorCalled("ana").whoCan(CallAnApi.at(environmentVariables.getProperty("UrlBaseService"))).attemptsTo(
                RegistrarUsuario.datos(correo,contrasena)
        );
    }

    @Cuando("^ingresa y actualiza su (.*) y (.*)$")
    public void ingresaYActualizaSuEveHoltYStatusCodeWeekly(String nombre, String Trabajo) {
        theActorInTheSpotlight().whoCan(CallAnApi.at(environmentVariables.getProperty("UrlBaseService"))).attemptsTo(
                LoginUsuario.ingrsar(getCorreo(),getContrasena()),
                ActualizarUsuario.ingrsar(getIdRegistro(),nombre,Trabajo),
                ConsultarUsuario.obtener(getIdRegistro())
        );

    }

    @Entonces("^verifica la informacion ingresada$")
    public void verificaLaInformacionIngresada() {
     theActorInTheSpotlight().should(seeThat(VerificarDatos.home(),is(true)).because("%s Visualiza los datos enviados por el servicio %s"));
    }


}
