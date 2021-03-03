package com.company.ejercicio3;

public class Cuadrado extends Rectangulo {
    public Cuadrado(String color, double altura, double ancho) {
        super(color, altura, ancho);
    }


    @Override
    public String toString() {
        return "Cuadrado{}"+
                super.toString();
    }
}
