package com.co.compra.web.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_web.feature",
        glue = "com.co.compra.web.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class CompraWeb {
}
