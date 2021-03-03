package com.company;

import java.util.List;

public class ObraComercial extends Obra {
    private String nombreDeObra;

    //construtor
    public ObraComercial() {
    };
    public ObraComercial(String nombreDeObra, String direccion, double cantidadM2, double costoxMetro, int timpoEstimado, Arquitecto arquitecto,List<Obrero>obreros,List<MaestroObra>maestroObras) {
        super(direccion,cantidadM2,costoxMetro,timpoEstimado,arquitecto,obreros,maestroObras);
        this.nombreDeObra = nombreDeObra;
    }
    //getters y setters

    public String getNombreDeObra() {
        return nombreDeObra;
    }
    public void setNombreDeObra(String nombreDeObra) {
        this.nombreDeObra = nombreDeObra;
    }

    @Override
    public void mostrarLosEmpleados() {
        System.out.println("Arquitecto :"+super.getArquitecto()+"\n Maestro Mayor de Obra :"+super.getMaestroObras()+"\n Obreros :"+super.getObrero());
    }

    @Override
    public String toString() {
        return "\n _____________________ ObraComercial ____________________\n " +
                "\n NombreDeObra    : " + nombreDeObra+
                super.toString();

    }
}