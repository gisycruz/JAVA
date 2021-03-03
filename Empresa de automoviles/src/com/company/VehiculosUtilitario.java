package com.company;

public class VehiculosUtilitario extends Vehiculo{
    private double cantidadKilogramosMaximoSoparta ;
    private  double alturaDeVeiculo ;

  public VehiculosUtilitario(String nombreModelo, double precioMercado){
      super(nombreModelo,precioMercado);
      this.cantidadKilogramosMaximoSoparta = 1000;
      this.alturaDeVeiculo = 3.5;
  }

    public double getCantidadKilogramosMaximoSoparta() {
        return cantidadKilogramosMaximoSoparta;
    }

    public void setCantidadKilogramosMaximoSoparta(double cantidadKilogramosMaximoSoparta) {
        this.cantidadKilogramosMaximoSoparta = cantidadKilogramosMaximoSoparta;
    }

    public double getAlturaDeVeiculo() {
        return alturaDeVeiculo;
    }

    public void setAlturaDeVeiculo(double alturaDeVeiculo) {
        this.alturaDeVeiculo = alturaDeVeiculo;
    }

    @Override
    public String toString() {
        return   ""+ super.toString()+
                "\n             VehiculosUtilitario                               " +
                "\n cantidadKilogramosMaximoSoparta :" + cantidadKilogramosMaximoSoparta +
                " \n alturaDeVeiculo                :" + alturaDeVeiculo;
    }
}
