package com.co.compra.web.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Producto {
    public static final Target TXTCATEGORIAS = Target.the(" busca la categoria de su preferencia ").located(By.xpath("(//a[@id='itemc'])[2]"));
    public static final Target TXTPRODUCTO = Target.the(" busca el producto de su preferencia {0} ").locatedBy("//div//h4//a[contains(text(),'{0}')]");
    public static final Target BTNAGREGARCARRO = Target.the("{0} agrga el producto al carro de compras ").located(By.xpath("//a[@class='btn btn-success btn-lg']"));
}
