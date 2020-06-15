package com.co.calculadora.app.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BotonesCalculadora {

    public static final Target TXT_NUMEROCALCULADORA = Target.the("presiona la tecla {0} ").locatedBy("//*[@resource-id ='com.google.android.calculator:id/digit_{0}']");
    public static final Target TXT_SUMA = Target.the("Suma los valores ingresados presionando la tecla + ").located(By.id("op_add"));
    public static final Target TXT_RESTA = Target.the("Resta los valores ingresados presionando la tecla - ").located(By.id("op_sub"));
    public static final Target TXT_MULT = Target.the("Multiplica los valores ingresados presionando la tecla X ").located(By.id("op_mul"));
    public static final Target TXT_DIV = Target.the("Divide los valores ingresados presionando la tecla ÷ ").located(By.id("op_div"));
    public static final Target TXT_IGUAL = Target.the("Obtiene los resultados con la tecla = ").located(By.id("eq"));
    public static final Target TXT_RESULTADO = Target.the("Obtiene los resultados de la operacion realizada").located(By.id("result_final"));



}
