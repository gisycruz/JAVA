package com.company;

public class MaestroObra extends Empleado implements Trabajo {

    private double costoxDia = 1800;
    //constructor
    public MaestroObra (){};
    public MaestroObra(int dni,String nombre, int edad,String telefono){
        super(dni,nombre, telefono);
       super.setEdad(edad);
    }
    // getter y setter
    public double getCostoxDia() {
        return costoxDia;
    }
    public void setCostoxDia(double costoxDia) {
        this.costoxDia = costoxDia;
    }

    @Override
    public void trabajar() {
        System.out.println("Soy maestro y superviso las construcciones");
    }
    @Override
    public String toString() {
        return "\n <<<<<<<<<<<<<<<< MaestroObra <<<<<<<<<<<<<<<<<<<<\n " +
                  super.toString()+
               " \n Edad : " + super.getEdad();
    }
}
