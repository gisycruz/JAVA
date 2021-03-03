package com.company;

public abstract class Cerveza {
    public static int i =0;
    private int id;
    private String nombre;
    private float precio;
    private float ABV;
    private String descripcion;

    public Cerveza(){};
    public Cerveza(String nombre,float abv,String descripcion){
        this.id = i++;
        this.nombre = nombre;
        this.descripcion= descripcion;
        this.ABV = abv;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setABV(float ABV) {
        this.ABV = ABV;
    }

    public float getABV() {
        return ABV;
    }

    public int getId() {
        return id;
    }

    public abstract void calculaCostoDeFabricacion();
    @Override
    public String toString() {
        return " _____________Cerveza_____________________________" +
                "\n id                     : " + id +
                "\n nombre                 : " + nombre +
                "\n Precio                 : " + precio +
                "\n ABV                    : " + ABV +
                "\n descripcion            :" + descripcion ;
    }
}
