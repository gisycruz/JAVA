package com.company;


public abstract class Vehiculo {
    private String nombreModelo;
    private double precioMercado;

    public Vehiculo(){};

    public Vehiculo(String nombreModelo, double precioMercado) {
        this.nombreModelo = nombreModelo;
        this.precioMercado = precioMercado;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public double getPrecioMercado() {
        return precioMercado;
    }

    public void setPrecioMercado(double precioMercado) {
        this.precioMercado = precioMercado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombreModelo='" + nombreModelo + '\'' +
                ", precioMercado=" + precioMercado +
                '}';
    }
}
