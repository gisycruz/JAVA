package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaPremium implements Reproduccion {
    Scanner teclado = new Scanner(System.in);
    private String nombre;
    private LinkedList<Cancion> mylista;

    public ListaPremium(){};
    public ListaPremium(String nombre){
        this.nombre= nombre;
        this.mylista = new LinkedList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void reproducir() {
        this.verLista();
        System.out.println("mencione la cancion que quiere escuchar ");
        int i = this.buscarCacionEnLista(teclado.nextLine());
        System.out.println(this.mylista.get(i));
    }

    @Override
    public void agregarCacion(Cancion cancion) {
          this.mylista.add(cancion);
    }

    @Override
    public void eliminarCacion() {

        this.verLista();
        System.out.println("\n elija la cancion a eliminar poner nombre de la cacion");
       int i = buscarCacionEnLista(teclado.nextLine());
       if(i != -1){
           this.mylista.remove(i);
       }
       else {
           System.out.println(" no existe una cancion con ese nombre ");
       }
    }

    public int buscarCacionEnLista(String nombreCacion){
              int indice = -1;
              int i = 0;
       while (i < this.mylista.size() && indice == -1){
           if (!this.mylista.get(i).getNombre().equalsIgnoreCase(nombreCacion)){
               indice = i;
           }
           i++;
       }
       return indice;
    }
    @Override
    public void verLista() {
       for (int i = 0 ; i< this.mylista.size();i++){
          System.out.println( this.mylista.get(i).toString());
       }
    }

    @Override
    public String toString() {
        return "\n.................ListaPremium................................" +
                "\n nombre                 :" + nombre +
                "\n mylista                :" + mylista ;
    }
}
