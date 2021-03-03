package com.company;

public abstract class Automovil extends Vehiculo{
    private int cantidadMaximaDeAirbags;

    public Automovil(String nombreModelo, double precioMercado) {
        super(nombreModelo,precioMercado);
        this.cantidadMaximaDeAirbags = 4;
    }

    public int getCantidadMaximaDeAirbags() {
        return cantidadMaximaDeAirbags;
    }

    public void setCantidadMaximaDeAirbags(int cantidadMaximaDeAirbags) {
        this.cantidadMaximaDeAirbags = cantidadMaximaDeAirbags;
    }

    @Override
    public String toString() {
        return   "\n"+super.toString()+
                "\n            Automovil                                " +
                "\n cantidadMaximaDeAirbags    :" + cantidadMaximaDeAirbags ;
    }
}
