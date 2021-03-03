package com.company;


public class Album {

    private String titulo;
    private Artista artista;
    private int aniodePublicacion;
    public Album(){};
    public Album(String titulo, int aniodePublicacion,Artista artista){
        this.titulo = titulo;
        this.aniodePublicacion = aniodePublicacion;
        this.artista= artista;
    }

    @Override
    public String toString() {
        return "\n.................Album...................................." +
                "\n titulo            :" + titulo +
                "\n artista           :" + artista +
                "\n aniodePublicacion :" + aniodePublicacion ;
    }
}
