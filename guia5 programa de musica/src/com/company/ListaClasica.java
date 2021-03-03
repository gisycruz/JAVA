package com.company;

import java.io.CharArrayReader;
import java.util.List;
import java.util.Stack;

public class ListaClasica implements Reproduccion {
    private  String nombre;
    private Stack<Cancion> milista;

    public ListaClasica(){
        this.milista = new Stack<>();
    };
    public ListaClasica(String nombre){
        this.milista = new Stack<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDeCancion(){
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
    @Override
    public void reproducir() {
        Stack<Cancion> pasoTodoEleme = new Stack<>();
        Stack<Cancion> elemento1 = new Stack<>();
     System.out.println(this.milista.peek());
     elemento1.push(this.milista.pop());
      while (! this.milista.empty()){
        pasoTodoEleme.push(this.milista.pop());
      }
      this.milista.push(elemento1.pop());
      while (!pasoTodoEleme.empty()){
          this.milista.push(pasoTodoEleme.pop());
      }
    }

    @Override
    public void agregarCacion(Cancion cancion) {
        this.milista.push(cancion);
    }

    @Override
    public void eliminarCacion() {
        this.verLista();
     System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }

    @Override
    public void verLista() {
        Stack<Cancion> aux= new Stack<>();
      while (!this.milista.empty()){
          System.out.println(this.milista.peek());
         aux.push(this.milista.pop());
      }
      while (!aux.empty()){
          this.milista.push(aux.pop());
      }
    }

    @Override
    public String toString() {
        return "\n.............ListaClasica................" +
                "\n nombre             :" + nombre +
                "\n " + milista ;
    }
}
