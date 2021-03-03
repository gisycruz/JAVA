package com.company;

public class GuitarraElectrica extends Cuerda implements Sonido{

    public GuitarraElectrica(){};
    public GuitarraElectrica(String marca,double precio,String nombreModelo){
        super(marca,precio);
        super.setCantidadDeCuerdas(super.cantidadDecuerdasGuitarra());
        super.setNombreModelo(nombreModelo);
    }

    @Override
    public String sonidoAmplificado() {
        return "SONIDO AMPLIFICADO "+ this.getClass();
    }

    @Override
    public double precioAumentado() {
        double precio = super.getPrecio() * 0.05 + super.getPrecio();
        return precio;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+
                " \n     guitarraElectrica        "+
                "\n nobre MODELO    :"+super.getNombreModelo()+
                "\n "+ this.sonidoAmplificado();
    }
}
