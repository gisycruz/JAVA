package com.company;

public abstract class  Instrumento {
    private String marca;
    private double precio;

    public Instrumento(){};

    public Instrumento(String marca){
        this.marca=marca;
    }
    public Instrumento(String marca,double precio){
        this.marca = marca;
        this.precio = precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public abstract double precioAumentado();
    @Override
    public String toString() {
        return "_______________Instrumento___________________________" +
                "\n marca               :" + marca +
                "\n precio sin aumento   :" + precio +
                "\n precio Aumentado     :"+ this.precioAumentado();
    }
}
