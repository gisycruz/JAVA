package com.company;

public class Motocicleta extends Vehiculo {
    private double cilindrada ;

    public Motocicleta() {
    }

    public Motocicleta(String nombreModelo, double precioMercado){
        super(nombreModelo,precioMercado);
        this.cilindrada = 100;
    };

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return   "\n"+ super.toString() +
                "\n           Motocicleta                      " +
                "\n cilindrada              :" + cilindrada;
    }
}
