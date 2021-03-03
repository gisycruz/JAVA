package com.company;

public abstract class Cuerda extends Instrumento{
    public static final int CUERDAGUITARRA = 6;
    public static final int CUERDASBAJO= 4;
    private  int cantidadDeCuerdas;
    private String nombreModelo;

    public Cuerda(){};
    public Cuerda(String marca,double precio){
        super(marca,precio);
        this.cantidadDeCuerdas =0;

    }

    public void setCantidadDeCuerdas(int cantidadDeCuerdas) {
        this.cantidadDeCuerdas = cantidadDeCuerdas;
    }

    public int getCantidadDeCuerdas() {
        return cantidadDeCuerdas;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

   public int cantidadDecuerdasGuitarra(){
       return this.cantidadDeCuerdas = CUERDAGUITARRA;
   }

   public int cantidadDecuerdasBajos(){
        return this.cantidadDeCuerdas = CUERDASBAJO;
   }
    @Override
    public String toString() {
        return "\n"+ super.toString()+
                " \n              Cuerda                          " +
                " \n cantidadDeCuerdas             :" + cantidadDeCuerdas ;


    }
}
