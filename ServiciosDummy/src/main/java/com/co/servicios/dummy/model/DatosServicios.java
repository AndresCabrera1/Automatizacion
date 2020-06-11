package com.co.servicios.dummy.model;

import java.util.HashMap;
import java.util.Map;

public class DatosServicios {
    private static String idRegistro ,correo,contrasena, token, nombreActualizado, trabajoActualizado, trabajoConsultado;
    private static Map<String,String> nombreConsultado = new HashMap<>();



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

    public static String getNombreActualizado() {
        return nombreActualizado;
    }

    public static void setNombreActualizado(String NombreActualizado) {
        nombreActualizado = NombreActualizado;
    }

    public static String getTrabajoActualizado() {
        return trabajoActualizado;
    }

    public static void setTrabajoActualizado(String TrabajoActualizado) {
        trabajoActualizado = TrabajoActualizado;
    }

    public static Map<String,String> getNombreConsultado() {
        return nombreConsultado;
    }

    public static void setNombreConsultado(Map<String,String> NombreConsultado) {
        nombreConsultado = NombreConsultado;
    }

    public static String getTrabajoConsultado() {
        return trabajoConsultado;
    }

    public static void setTrabajoConsultado(String TrabajoConsultado) {
        trabajoConsultado = TrabajoConsultado;
    }
}
