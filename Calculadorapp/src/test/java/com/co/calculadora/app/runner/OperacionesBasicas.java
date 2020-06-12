package com.co.calculadora.app.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/operaciones_basicas.feature",
        glue = "com.co.calculadora.app.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class OperacionesBasicas {
}
