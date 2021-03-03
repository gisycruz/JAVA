package com.company;

public class Cancion {
    private  String nombre;
    private String duracion;
    private Genero genero;
    private Album album;
    private Artista invitado;

    public Cancion(){};
    public Cancion(String nombre,String duracion,Genero genero,Album album){
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;

    }
    public Cancion(String nombre,String duracion,Genero genero,Album album,Artista invitado){

        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
        this.album = album;
        this.invitado = invitado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "/n__________________Cancion_____________________________________" +
                "\n nombre                 :" + nombre +
                "\n duracion               :" + duracion +
                "\n genero                 :" + genero +
                "\n invitado                :" + invitado ;
    }
}
