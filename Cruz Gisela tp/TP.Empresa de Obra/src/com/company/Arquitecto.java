package com.company;

public class Arquitecto extends Empleado {
    private int matricula;
    private double costoxDia = 2000;

    //contructor
    public Arquitecto(){};
    public Arquitecto(int matricula, int dni, String nombre, String telefono) {
        super(dni, nombre, telefono);
        this.matricula = matricula;
    }
    //getter y setter
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getCostoxDia() { return costoxDia; }
    public void trabajar() {
        System.out.println(" Creando mi próximo plano ");
    }
    @Override
    public String toString() {
        return "\n <<<<<<<<<<<<<<<Arquitecto<<<<<<<<<<<<<<<<<<<<< \n" +
                super.toString()+
                "\n matricula :" + matricula ;
    }
}