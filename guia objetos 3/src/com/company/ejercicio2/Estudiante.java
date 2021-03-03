package com.company.ejercicio2;

public class Estudiante extends Persona {
    private int anioingreso;
    protected double cuotadelmes;
    private String carrera;
    //constructor

    public Estudiante(int dni, String nombre, String apellido, String email, String direccion,int anioingreso,double cuotadelmes,String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioingreso = anioingreso;
        this.carrera = carrera;
        this.cuotadelmes = cuotadelmes;
    }

    public int getAnioingreso() {
        return anioingreso;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getCuotadelmes() {
        return cuotadelmes;
    }

    public void setCuotadelmes(double cuotadelmes) {
        this.cuotadelmes = cuotadelmes;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setAnioingreso(int anioingreso) {
        this.anioingreso = anioingreso;
    }
    public double CuotaAnual(){
        double suma = 12 * this.cuotadelmes;
        return  suma;
    }

    @Override
    public double ingresos() {
        return this.cuotadelmes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ESTUDIANTE {" +
                "anioingreso = " + anioingreso +
                ", cuotadelmes = " + cuotadelmes +
                ", carrera ='" + carrera + '\'' +
                '}';
    }
}
