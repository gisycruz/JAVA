package com.company;

public class Rubia extends TipoDeCerveza {

    public Rubia(){};
    public Rubia(String nombre,float abv,String descripcion, Receta receta,float porcentajeComplejidad,boolean gluten){
        super(nombre,abv,descripcion,receta,porcentajeComplejidad,gluten);
        this.calculaCostoDeFabricacion();
        super.faricarConOsinGluten();
    }
    @Override
    public void calculaCostoDeFabricacion() {
        double precioIngredientes= super.getReceta().costoDelaListaDeIngredientes();
        double precioConAUMENTO= (precioIngredientes * 0.10) + precioIngredientes;
        super.setPrecio((float) precioConAUMENTO);
    }

    @Override
    public String toString() {
        return  "\n---------------Rubia------------------"+
                  super.toString();
    }
}
