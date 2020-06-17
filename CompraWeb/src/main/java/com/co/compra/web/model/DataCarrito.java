package com.co.compra.web.model;

public class DataCarrito {

    private static String[] datosTransaccion;

    public static String[] getDatosTransaccion() {
        return datosTransaccion;
    }

    public static void setDatosTransaccion(String[] DatosTransaccion) {
        datosTransaccion = DatosTransaccion;
    }
}
