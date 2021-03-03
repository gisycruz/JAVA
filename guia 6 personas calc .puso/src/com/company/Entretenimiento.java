package com.company;

import java.util.Objects;

public abstract class Entretenimiento {
    private String titulo;
    private Genero genero;
    private boolean prestado;

    public Entretenimiento(){
        this.prestado =false;
    };

    public Entretenimiento(String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void entregar(){
        this.prestado = true;
    };
    public void  devolver(){
        this.prestado = false;
    };
    public  boolean isEntregado(){
        return this.prestado;
    };
    public abstract boolean comparate(Object object);

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (! (obj instanceof Entretenimiento)) return false;
        Entretenimiento serie = (Entretenimiento) obj;
        return titulo == serie.getTitulo();
    }



    @Override
    public String toString() {
        return "\n__________________Entretenimiento_________________________________" +
                "\n titulo       :" + titulo +
                "\n genero       :" + genero;
    }
}
