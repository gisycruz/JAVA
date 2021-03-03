package com.company;

public class AutoCarrera extends Automovil{
    private double velocidadMaximaAlcanzada;

    public AutoCarrera(String nombreModelo, double precioMercado) {
        super(nombreModelo,precioMercado);
        this.velocidadMaximaAlcanzada =400 ;
    }

    public double getVelocidadMaximaAlcanzada() {
        return velocidadMaximaAlcanzada;
    }

    public void setVelocidadMaximaAlcanzada(double velocidadMaximaAlcanzada) {
        this.velocidadMaximaAlcanzada = velocidadMaximaAlcanzada;
    }

    @Override
    public String toString() {
        return   "\n "+super.toString()+
                "\n                     AutoCarrera                    " +
                "\n velocidadMaximaAlcanzada     :" + velocidadMaximaAlcanzada ;
    }
}
