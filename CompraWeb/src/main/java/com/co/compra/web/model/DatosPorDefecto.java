package com.co.compra.web.model;

public class DatosPorDefecto {

    private String nombre, pais, ciudad, tarjetaCredito, mes, ano;

    public String getAno() {
        return ano;
    }

    public String getMes() {
        return mes;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    public String getNombre() {
        return nombre;
    }


    public static class Builder{
        private String nombre, pais, ciudad, tarjetaCredito, mes, ano;

        public Builder(){
            this.nombre= "Prueba Qa";
            this.pais="Colombia";
            this.ciudad="Medellin" ;
            this.tarjetaCredito = "012345698";
            this.mes="03";
            this.ano = "2020";
        }

        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setPais(String pais) {
            this.pais = pais;
            return this;
        }

        public Builder setCiudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }


        public Builder setAno(String ano) {
            this.ano = ano;
            return this;
        }

        public Builder setTarjetaCredito(String tarjetaCredito) {
            this.tarjetaCredito = tarjetaCredito;
            return this;
        }

        public Builder setMes(String mes) {
            this.mes = mes;
            return this;
        }

        public static DatosPorDefecto porDefecto(){
            return new DatosPorDefecto.Builder().build();
        }
        public DatosPorDefecto build() {
            return new DatosPorDefecto(this);
        }
    }

    private DatosPorDefecto(Builder builder){
        this.nombre= builder.nombre;
        this.pais= builder.pais;
        this.ciudad=builder.ciudad ;
        this.tarjetaCredito = builder.tarjetaCredito;
        this.mes=builder.mes;
        this.ano = builder.ano;
    }
    ///-------------------------------------------------------------------------
}
