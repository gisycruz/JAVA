package com.company;

import java.util.ArrayList;
import java.util.List;

public class FabricaDeCerveza {
    public static int i =0;
    private int id;
    private String nombre;
    private String direccion;
    List<Cerveza> cervezas;

    public FabricaDeCerveza(){};
    public FabricaDeCerveza(String nombre, String direccion){
        this.id = i++;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cervezas = new ArrayList<>();
    }
    public  int existeCerveza(String nombre){
        int existe =-1;
         int i =0;
        while ( i < this.cervezas.size() && existe == -1){
            if (this.cervezas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                existe = 0;
            }
            i++;
        }
        return existe;
    }
    public void agregarCerveza(Cerveza cerveza){
        int i = this.existeCerveza(cerveza.getNombre());
        if( i == -1)
        this.cervezas.add(cerveza);
    }
    public void quitarCerveza(int id){
        for (int i =0;i< this.cervezas.size() ; i++){
           if ( id == this.cervezas.get(i).getId()){
               this.cervezas.remove(i);
           }
        }
    }
    public void mostrarListaDeCerveza(){
        for (int i =0;i< this.cervezas.size() ; i++){
            System.out.println(cervezas.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return " ----------------FabricaDeCerveza----------------------" +
                "\n id               :" + id +
                "\n nombre           :" + nombre +
                "\n direccion        :" + direccion +
                "\n cervezas         :" + cervezas ;
    }
}
