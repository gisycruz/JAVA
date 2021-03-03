package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Obra {
    private String direccion;
    private double cantidadM2;
    private double costoxMetro;
    private int timpoEstimado;
    private Arquitecto arquitecto;
    List<Obrero>obrero;
    List<MaestroObra>maestroObras;

    //contructor
    public Obra(){};
    public Obra(String direccion,double cantidadM2 , double costoxMetro,int timpoEstimado,Arquitecto arquitecto,List<Obrero>obreros,List<MaestroObra>maestroObras){
        this.direccion = direccion;
        this.costoxMetro = costoxMetro;
        this.cantidadM2 = cantidadM2;
        this.timpoEstimado = timpoEstimado;
        this.arquitecto = arquitecto;
        this.obrero = obreros;
        this.maestroObras = maestroObras;
    }
    //getters y setters

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public double getCantidadM2() {
        return cantidadM2;
    }
    public void setCantidadM2(double cantidadM2) {
        this.cantidadM2 = cantidadM2;
    }
    public double getCostoxMetro() {
        return costoxMetro;
    }
    public void setCostoxMetro(double costoxMetro) {
        this.costoxMetro = costoxMetro;
    }
    public Arquitecto getArquitecto() { return arquitecto; }
    public void setArquitecto(Arquitecto arquitecto) {
        this.arquitecto = arquitecto;
    }
    public int getTimpoEstimado() { return timpoEstimado; }
    public void setTimpoEstimado(int timpoEstimado) { this.timpoEstimado = timpoEstimado; }
    public List<MaestroObra> getMaestroObras() { return maestroObras; }
    public void setMaestroObras(List<MaestroObra> maestroObras) { this.maestroObras = maestroObras; }
    public List<Obrero> getObrero() { return obrero; }
    public void setObrero(List<Obrero> obrero) { this.obrero = obrero; }


    // mostrar
    public void agregarObrero(Obrero o){ this.obrero.add(o); }
    public void agregarMaestro(MaestroObra m){ this.maestroObras.add(m); }


    // funciones de obra
    public double sumaDeCostoDeObrero()  {
        double suma = 0;
        for (Obrero obrero : this.obrero) {
            suma = suma + obrero.getCostoxDia();
        }
        return suma;
    }
    public double sumaDeCostoMaestroObra() {
        double suma =0;
        for (MaestroObra maestroObra : this.maestroObras) {
            suma = suma + maestroObra.getCostoxDia();
        }
        return suma;
    }
    public double costoDeEmpleado(){
        return (this.arquitecto.getCostoxDia() + this.sumaDeCostoDeObrero() + this.sumaDeCostoMaestroObra());
    }
    public double calculoDePrecioEstimado() {
        return (this.getCostoxMetro() * this.getCantidadM2() ) +(this.costoDeEmpleado() *this.getTimpoEstimado());
    }
    public abstract void mostrarLosEmpleados();
    @Override
    public String toString() {
        return "\nDireccion       : " + direccion +
                "\nCantidadM2      : " + cantidadM2 +
                "\nCostoxMetro     : " + costoxMetro +
                "\nTimpoEstimado   : " + timpoEstimado +
                "\nCalculo estimado de Obra   : " +this.calculoDePrecioEstimado()+
                " \n________________________________________________________________\n ";
    }
}

