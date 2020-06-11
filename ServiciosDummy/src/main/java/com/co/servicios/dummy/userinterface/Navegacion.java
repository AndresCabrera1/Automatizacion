package com.co.servicios.dummy.userinterface;

public enum Navegacion {

    Registrar("/api/register"),
    login("/api/login"),
    Actualizar("/api/users/"),
    Consultar("/api/users/");

    private final String url;

    Navegacion(String url){
        this.url = url;
    }

    public String Url(){
        return url;
    }
}
