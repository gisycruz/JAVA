package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	  Entrenador entrenador1= new Entrenador("Juna","ramirez",34,"mar del plata",5);
	  Jugador jugador1= new Jugador("lucas","gonzalez",34,"mar del plata","soporte","location");
	  Jugador jugador2= new Jugador("german","sopa",32,"mar del plata","tirador","holat");
	  SoporteTecnico soporteTecnico1= new SoporteTecnico("dario","gonzalez",56,"mar delp lata","mouse");
	  SoporteTecnico soporteTecnico2= new SoporteTecnico("javir","monson",34,"mar del plata","teclado");
      Plantel plantel= new Plantel(entrenador1);
      plantel.agregarPlantelJugador(jugador1);
      plantel.agregarPlantelJugador(jugador2);
      plantel.agregarPlantelSoporteTecnico(soporteTecnico1);
      plantel.agregarPlantelSoporteTecnico(soporteTecnico2);
      plantel.mostrarPlantel();
    }
}
