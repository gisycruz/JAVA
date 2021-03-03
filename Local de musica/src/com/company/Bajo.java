package com.company;

public class Bajo extends Cuerda implements Sonido{

    public Bajo(){};
    public Bajo(String marca,double precio,String nombreModelo){
        super(marca,precio);
        super.setCantidadDeCuerdas(super.cantidadDecuerdasBajos());
        super.setNombreModelo(nombreModelo);
    }

    @Override
    public String sonidoAmplificado() {
        return "\n SONIDO AMPLIFICADO "+ this.getClass();
    }

    @Override
    public double precioAumentado() {
        double precio = (super.getPrecio() *0.20) + (super.getPrecio());
        return precio;
    }

    @Override
    public String toString() {
        return"\n"+super.toString()+
                "\n     BAJO                       "+
                "\n"+super.getNombreModelo()+
                "\n "+ this.sonidoAmplificado();
    }
}
