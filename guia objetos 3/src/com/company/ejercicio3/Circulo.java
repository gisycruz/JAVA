package com.company.ejercicio3;

public class Circulo extends Figura {
    private double Radio;

    public Circulo(String color, double radio) {
        super(color);
        Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    @Override
    public double CalculaPerimetro() {
        return 2*Math.PI*this.Radio;
    }

    @Override
    public double CalculoArea() {
        return Math.PI * Math.sqrt(this.Radio);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Circulo{" +
                "Radio=" + Radio +
                '}';
    }
}
