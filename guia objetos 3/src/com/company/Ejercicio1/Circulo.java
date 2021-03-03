package com.company.Ejercicio1;
/*1. Para comenzar esta guía, vamos a empezar con un ejemplo sencillo, que nos  permita
 entender el concepto de herencia, superclase y subclase. Para esto vamos
 a  definir el tipo Círculo, que posee un radio cuyo valor por defecto al ser inicializado 
  sin valores es 1.0. Además el tipo Círculo posee un atributo color, por defecto rojo,  un método
  para calcular el área y otro para imprimir sus características. Puede  reutilizar la clase Circulo
  de las guías anteriores. */

public class Circulo {
    private double Radio;
    private String Color;

    public Circulo(){
        this.Radio = 1.0;
        this.Color = "Rojo";
    }

    //getter

    public double getRadio() {
        return Radio;
    }

    public String getColor() {
        return Color;
    }
    //setter

    public void setColor(String color) {
        Color = color;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }
    public double CalculaArea(){
        return Math.sqrt(this.Radio)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Radio=" + Radio +
                ", Color='" + Color + '\'' +
                '}';
    }
}
