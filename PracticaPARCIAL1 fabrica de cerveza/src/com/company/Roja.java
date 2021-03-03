package com.company;

public class Roja extends TipoDeCerveza {

    //contructor
    public Roja (){};
    public Roja(String nombre,float abv,String descripcion, Receta receta,float porcentajeComplejidad,boolean gluten){
        super(nombre,abv,descripcion,receta,porcentajeComplejidad,gluten);
        this.calculaCostoDeFabricacion();
        super.faricarConOsinGluten();
    }

    @Override
    public void calculaCostoDeFabricacion() {
        double precioIngredientes= super.getReceta().costoDelaListaDeIngredientes();
        double precioConAUMENTO= (precioIngredientes * 0.15) + precioIngredientes;
        super.setPrecio((float) precioConAUMENTO);

    }
    @Override
    public String toString() {
        return "\n-------------- ROJA----------------- " +
                super.toString();
    }


}
