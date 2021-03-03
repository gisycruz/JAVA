package com.company;

import java.util.List;

public class Comercio extends ObraComercial {
    private String rubro;
    //constructor
    public Comercio(String nombreDeObra,String rubro, String direccion, double cantidadM2, double costoxMetro, int timpoEstimado, Arquitecto arquitecto,List<Obrero>obreros,List<MaestroObra>maestroObras) {
        super(nombreDeObra,direccion,cantidadM2,costoxMetro,timpoEstimado,arquitecto,obreros,maestroObras);
        this.rubro = rubro;
    }
    //getters y setters
    public String getRubro() {
        return rubro;
    }
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public void mostrarLosEmpleados() {
        System.out.println("\n __________________ Comercio ___________________________\n");
        super.mostrarLosEmpleados();
        System.out.println(" \n______________________________________________________ \n ");
    }

    @Override
    public String toString() {
        return "\n -----------------------Comercio -------------------------\n" +
                "\n Rubro   :" + rubro +
                    super.toString();
    }
}
