package com.co.servicios.dummy.userinterface;

public enum Navegacion {
    Login("");

    private final String url;

    Navegacion(String url){
        this.url = url;
    }

    public String Url(){
        return url;
    }
}
