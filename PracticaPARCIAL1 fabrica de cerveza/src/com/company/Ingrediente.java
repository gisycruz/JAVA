package com.company;

public class Ingrediente {
    private static int i =0;
    private int id;
    private String nombre;
    private String descripcion;
    private float cantidad;
    private float precioUnidad;

    public Ingrediente(){};
    public Ingrediente(String nombre, String descripcion, float cantidad, float precioUnidad){
        this.id = i++;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
    }
    public double costosDeIngredientes(){
        double precio = this.cantidad * this.precioUnidad;
        return  precio;
    }

    @Override
    public String toString() {
        return "\n,,,,,,,,,,,,,,,,,,,,,,Ingrediente,,,,,,,,,,,,,,,,,,,,,,,,,,,,,," +
                "\n id                    :" + id +
                "\n nombre                :" + nombre +
                "\n descripcion           :" + descripcion +
                "\n cantidad              :" + cantidad +
                "\n precioUnidad          :" + precioUnidad ;
    }
}
