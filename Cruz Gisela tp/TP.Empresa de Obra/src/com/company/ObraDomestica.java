package com.company;

import java.util.List;

public class ObraDomestica extends Obra {
    private int cantidadDeHabitaciones;
    //constructor
    public ObraDomestica(){};
    public ObraDomestica(int cantidadDeHabitaciones,String direccion, double cantidadM2 , double costoxMetro, int timpoEstimado, Arquitecto arquitecto,List<Obrero>obreros,List<MaestroObra>maestroObras){
        super(direccion,cantidadM2,costoxMetro,timpoEstimado,arquitecto,obreros,maestroObras);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }
    //getters y setter
    public int getCantidadDeHabitaciones() { return cantidadDeHabitaciones; }
    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) { this.cantidadDeHabitaciones = cantidadDeHabitaciones; }


    @Override
    public void mostrarLosEmpleados() {
        System.out.println("\n____________________ ObraDomestica _____________________\n");
        System.out.println("Arquitecto :"+super.getArquitecto()+"\n Maestro Mayor de Obra :"+super.getMaestroObras()+"\n Obreros :"+super.getObrero());
        System.out.println(" \n______________________________________________________ \n ");
    }
    @Override
    public String toString() {
        return "\n------------------------- ObraDomestica ----------------------------\n" +
                "\n CantidadDeHabitaciones  : " + cantidadDeHabitaciones+
                super.toString();
    }
}
