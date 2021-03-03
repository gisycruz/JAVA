package com.company;

public class Empleado {
    private int dni;
    private String nombre;
    private String telefono;
    private int edad;
    //contructor
    public Empleado(){};
    public Empleado(int dni,String nombre,String telefono){
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //getter y setter

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    @Override
    public String toString() {
        return "\n D.N.I.   :" + dni +
                "\n Nombre   : " +nombre +
                "\n Telefono : " +telefono;
    }
}
