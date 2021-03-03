package com.company;

import javax.print.DocFlavor;

public abstract class TipoDeCerveza extends Cerveza{
    private boolean gluten;
    private Receta receta;
    private float porcentajeComplejidad;

    public TipoDeCerveza(){};
    public TipoDeCerveza(String nombre,float abv,String descripcion, Receta receta,float porcentajeComplejidad,boolean gluten){
        super(nombre,abv,descripcion);
        this.receta = receta;
        this.porcentajeComplejidad=porcentajeComplejidad;
        this.gluten = gluten;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }
    public void faricarConOsinGluten() {
        if (this.isGluten() == false){
            double precio =( super.getPrecio() * 0.02) + super.getPrecio();
            super.setPrecio((float) precio);
        }
    }
    @Override
    public String toString() {
        return  "\n"+ super.toString() +
                "\n<<<<<<<<<<<<<TipoDeCerveza<<<<<<<<<<<<<<<<<<<<<<<<<<<<" +
                "\n gluten                  :" + gluten +
                "\n receta                  :" + receta +
                "\n porcentajeComplejidad   :" + porcentajeComplejidad;
    }
}
