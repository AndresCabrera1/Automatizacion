package com.co.servicios.dummy.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrar_usuario.feature",
        glue = "com.co.servicios.dummy.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class RegistrarUsuario {
}
