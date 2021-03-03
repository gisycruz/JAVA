package com.company;

public class Alumno {
    private String nombre ;
    private Nacionalidad nacionalidad;

    public Alumno (){};

    public Alumno(String nombre, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "\n _______________Alumno_______________________________" +
                "\n nombre         :" + nombre +
                "\n nacionalidad   :" + nacionalidad ;
    }
}
