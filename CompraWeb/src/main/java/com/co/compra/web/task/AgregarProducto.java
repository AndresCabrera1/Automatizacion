package com.co.compra.web.task;

import com.co.compra.web.Interaction.Alert;
import com.co.compra.web.userinterface.Producto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class AgregarProducto implements Task {
    private String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    @Override
    @Step("{0} busca el producto y lo agrega al carrito")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Producto.TXTCATEGORIAS),
                Click.on(Producto.TXTPRODUCTO.of(producto)),
                WaitUntil.the(Producto.BTNAGREGARCARRO,isVisible()),
                Click.on(Producto.BTNAGREGARCARRO),
                Alert.aceptar()
        );


    }

    public static Performable carrito(String producto){
        return Tasks.instrumented(AgregarProducto.class,producto);
    }
}
