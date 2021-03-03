package com.company;

import java.util.List;

public class Hotel extends ObraComercial {
    private int cantidadDePiso;
    //constructor
    public Hotel(){};
    public Hotel(String nombreDeObra, String direccion, double cantidadM2, double costoxMetro, int timpoEstimado, Arquitecto arquitecto,int cantidadDePiso,List<Obrero>obreros,List<MaestroObra>maestroObras) {
        super(nombreDeObra,direccion,cantidadM2,costoxMetro,timpoEstimado,arquitecto,obreros,maestroObras);
        this.cantidadDePiso = cantidadDePiso;
    }
    //Getter y setters

    public int getCantidadDePiso() {
        return cantidadDePiso;
    }

    public void setCantidadDePiso(int cantidadDePiso) {
        this.cantidadDePiso = cantidadDePiso;
    }

    @Override
    public void mostrarLosEmpleados() {
        System.out.println("\n___________________ Hotel ____________________________ \n");
        super.mostrarLosEmpleados();
        System.out.println(" \n______________________________________________________ \n ");
    }

    @Override
    public String toString() {
        return "\n -------------------------- Hotel ----------------------------------\n" +
                "cantidadDePiso  :" + cantidadDePiso+
                super.toString();
    }
}
