package com.company;

public class AutoUrbano  extends Automovil{
    private int cantidadMaximaDeOcupantes ;

    public AutoUrbano(String nombreModelo, double precioMercado) {
        super(nombreModelo,precioMercado);
        this.cantidadMaximaDeOcupantes = 5;
    }

    public int getCantidadMaximaDeOcupantes() {
        return cantidadMaximaDeOcupantes;
    }

    public void setCantidadMaximaDeOcupantes(int cantidadMaximaDeOcupantes) {
        this.cantidadMaximaDeOcupantes = cantidadMaximaDeOcupantes;
    }

    @Override
    public String toString() {
        return  "\n " +super.toString()+
                "\n                    AutoUrbano                       " +
                "cantidadMaximaDeOcupantes=" + cantidadMaximaDeOcupantes ;
    }
}

