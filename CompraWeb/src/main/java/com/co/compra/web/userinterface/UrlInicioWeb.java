package com.co.compra.web.userinterface;

public enum UrlInicioWeb {

    UrlInicio("https://www.demoblaze.com/index.html");

    private final String url;


    UrlInicioWeb(String url) {
        this.url = url;
    }

    public String Url() {

        return url;
    }
}
