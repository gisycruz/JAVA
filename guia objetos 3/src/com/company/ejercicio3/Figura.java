package com.company.ejercicio3;

public abstract class Figura {
    private String color;
    //construtor

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double CalculoArea();
    public abstract double CalculaPerimetro();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
