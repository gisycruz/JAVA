package com.company;

public class Artista {
    private String nombre;
    private int edad;
    private Nacionalidad nacionalidad;

    public Artista(){};
    public Artista(String nombre , int edad , Nacionalidad nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "\n...................Artista........................." +
                "\n nombre                  :" + nombre +
                "\n edad                  :" + edad +
                "\n nacionalidad          :" + nacionalidad ;
    }
}
