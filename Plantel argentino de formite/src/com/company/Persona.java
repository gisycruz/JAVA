package com.company;

public abstract class Persona {
    protected static int i=0;
    private int id;
    private String nombre;
    private String apellido;
    private  int edad;
    private String localidad;

    public Persona(){};
    public Persona(String nombre, String apellido,int edad,String localidad){
        this.nombre= nombre;
        this.apellido=apellido;
        this.edad= edad;
        this.localidad = localidad;
        this.id=i++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public abstract void viajamos();
    @Override
    public String toString() {
        return "\n id            " + id +
                "\n nombre       " + nombre +
                "\n apellido     " + apellido +
                " \n edad        " + edad+
                "\n localidad    " + localidad ;
    }
}
