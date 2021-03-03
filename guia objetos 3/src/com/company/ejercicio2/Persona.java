package com.company.ejercicio2;

public abstract class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    //constructor
    public Persona(int dni,String nombre,String apellido ,String email,String direccion) {
        this.dni =dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
    }
    //getter

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getDni() {
        return dni;
    }
    //setter

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   public abstract double ingresos();

    @Override
    public String toString() {
        return "Persona :" +
                "dni = " + dni +
                ", nombre = '" + nombre + '\'' +
                ", apellido = '" + apellido + '\'' +
                ", email = '" + email + '\'' +
                ", direccion = '" + direccion + '\'' ;
    }
}
