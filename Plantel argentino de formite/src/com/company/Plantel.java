package com.company;

import java.util.ArrayList;
import java.util.List;

public class Plantel {
    Entrenador entrenador;
    List<Jugador>jugadors;
    List<SoporteTecnico>soporteTecnicos;

    public Plantel(){};
    public  Plantel(Entrenador entrenador){
        this.entrenador=entrenador;
        this.jugadors = new ArrayList<>();
        this.soporteTecnicos = new ArrayList<>();
 }
      public  int buscarJugadorNikename(String nikename){
        int rta = -1;
        for(int i=0 ; i< this.jugadors.size(); i++){
            if(this.jugadors.get(i).getNikename().equals(nikename)){
                rta=i;
            }
        }
        return rta;
      }
      public void agregarPlantelJugador(Jugador jugador){
         int i = buscarJugadorNikename(jugador.getNikename());
         if(i == -1)
             this.jugadors.add(jugador);
         else
             System.out.println("el nikename ya existe ");

      }
      public void agregarPlantelSoporteTecnico(SoporteTecnico soporteTecnico){
        this.soporteTecnicos.add(soporteTecnico);
      }
      public void mostrarJugadores(){
          for (Jugador jugador : this.jugadors) {
              System.out.println(jugador.toString());
          }
      }
    public void mostrarSoporteTecnico(){
        for (int i=0;i<this.soporteTecnicos.size();i++){
            System.out.println(this.soporteTecnicos.get(i).toString());
        }
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void mostrarPlantel(){
        System.out.println(this.getEntrenador());
        this.mostrarJugadores();
        this.mostrarSoporteTecnico();
    }

    @Override
    public String toString() {
        return "Plantel{" +
                "entrenador=" + entrenador +
                ", jugadors=" + jugadors +
                ", soporteTecnicos=" + soporteTecnicos +
                '}';
    }
}

