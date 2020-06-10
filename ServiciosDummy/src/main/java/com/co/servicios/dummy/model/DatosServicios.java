package com.co.servicios.dummy.model;

public class DatosServicios {
    private static String idRegistro ,correo,contrasena, token;



    public static String getIdRegistro() {
        return idRegistro;
    }

    public static void setIdRegistro(String IdRegistro) {
        idRegistro = IdRegistro;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String Correo) {
        correo = Correo;
    }

    public static String getContrasena() {
        return contrasena;
    }

    public static void setContrasena(String Contrasena) {
        contrasena = Contrasena;
    }

    public static String getToken() {
        return token;
    }

    public static void setToken(String Token) {
        DatosServicios.token = Token;
    }
}
