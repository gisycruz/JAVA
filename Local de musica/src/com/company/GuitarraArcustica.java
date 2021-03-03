package com.company;

public class GuitarraArcustica extends Cuerda {
      private TipoDeMadera tipoDeMadera;
      public GuitarraArcustica(){};
      public GuitarraArcustica(String marca,double precio,TipoDeMadera tipoDeMadera){
          super(marca,precio);
          super.setCantidadDeCuerdas(super.cantidadDecuerdasGuitarra());
          this.tipoDeMadera = tipoDeMadera;
      }

    @Override
    public double precioAumentado() {
       double precio = super.getPrecio() * 0.10 + super.getPrecio();
       return precio;
    }

    @Override
    public String toString() {
        return
                "\n"+super.toString()+
                        "\n    GuitarraArcustica                 " +
                "\n   tipoDeMadera            :" + tipoDeMadera;
    }
}
