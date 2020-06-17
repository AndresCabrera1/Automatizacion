package com.co.compra.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DiligenciarCarroComprasUI {
    public static final Target BTN_CARRITO = Target.the(" Ingresa al carrito de compras  ").located(By.id("cartur"));
    public static final Target BTN_REALIZAR_PEDIDO = Target.the(" empieza a realizar la orden  ").located(By.className("btn-success"));
    public static final Target TXT_NOMBRE = Target.the(" Digita el nombre").located(By.id("name"));
    public static final Target TXT_PAIS = Target.the(" Digita el pais ").located(By.id("country"));
    public static final Target TXT_CIUDAD = Target.the(" Digita la ciudad ").located(By.id("city"));
    public static final Target TXT_TC = Target.the(" Digita el numero de tarjeta ").located(By.id("card"));
    public static final Target TXT_MES = Target.the(" Digita mes de la tarjeta ").located(By.id("month"));
    public static final Target TXT_ANO = Target.the(" Digita el año de la tarjeta").located(By.id("year"));
    public static final Target BTN_COMPRA = Target.the(" Finaliza la compra").located(By.xpath("(//button[@class='btn btn-primary'])[3]"));
    public static final Target TXT_DATOS_COMPRA = Target.the(" Finaliza la compra").located(By.className("text-muted"));

}
