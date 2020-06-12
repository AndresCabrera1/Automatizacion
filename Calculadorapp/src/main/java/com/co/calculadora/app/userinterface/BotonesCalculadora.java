package com.co.calculadora.app.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonesCalculadora {

    public static final Target TXT_NUMEROCALCULADORA = Target.the("presiona la tecla {0} ").locatedBy("//*[@resource-id ='com.google.android.calculator:id/digit_{0}']");


}
