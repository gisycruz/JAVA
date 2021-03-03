package com.company;


import java.util.ArrayList;
import java.util.List;

public class Receta {
    private static int i =0;
    private int id;
    private String nombre;
    private String pais;
    List<Ingrediente> ingredientes ;

    public Receta (){};
    public Receta(String nombre, String pais){
        this.id = i++;
        this.nombre= nombre;
        this.pais = pais;
        this.ingredientes = new ArrayList<>();
    }
    public  void agregarIngrediente (Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
    }
    public void listarIngredientes(){
        for (int i =0; i< this.ingredientes.size();i++){
           System.out.println(ingredientes.get(i).toString());
        }
    }
    public double costoDelaListaDeIngredientes(){
        double precio= 0.0;
        for (int i =0; i< this.ingredientes.size();i++){
            precio = precio + this.ingredientes.get(i).costosDeIngredientes();
        }
        return precio;
    }
    @Override
    public String toString() {
        return "\n.................Receta................................" +
                "\n  id                  :" + id +
                " \n nombre              :" + nombre +
                " \n pais                :" + pais +
                " \n ingredientes        :" + ingredientes;
    }
}
