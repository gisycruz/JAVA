package com.company;

public class Obrero extends Empleado implements Trabajo{
    private double costoxDia = 1500;
    public Obrero(){};
    public Obrero(int dni, String nombre,int edad, String telefono) {
        super(dni, nombre, telefono);
       super.setEdad(edad);
    }

    public double getCostoxDia() {
        return costoxDia;
    }
    public void setCostoxDia(double costoxDia) {
        this.costoxDia = costoxDia;
    }

    @Override
    public void trabajar() {
        System.out.println("Soy obrero y construyo");
    }

    @Override
    public String toString() {
        return "\n <<<<<<<<<<<<<<< Obrero <<<<<<<<<<<<<<<<<<<<<\n " +
                "\n edad      :" + getEdad() +
                "\n  D.N.I    :" + getDni() +
                "\n  nombre   :" + getNombre() +
                "\n telefono  :" + getTelefono();

    }
}
