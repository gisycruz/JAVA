package com.company.ejercicio3;

public  class Rectangulo extends Figura {
    private double Altura;
    private double Ancho;

    public Rectangulo(String color, double altura,double ancho) {
        super(color);
        Altura = altura;
        this.Ancho = ancho;
    }


    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double ancho) {
        Ancho = ancho;
    }

    @Override
    public double CalculaPerimetro() {
        return 2 * this.Altura + 2 * this.Ancho;
    }

    @Override
    public double CalculoArea() {
        return this.Ancho * this.Altura;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Rectangulo{" +
                "Altura=" + Altura +
                ", Ancho=" + Ancho +
                '}';
    }
}
