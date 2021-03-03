package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Film film1 = new Film("EL HIJO",Genero.ACCION, LocalDate.of(2001, 3, 12),20,ClasificacionDeAudicion.G​,SiglaDelPais.ARG,3);
        System.out.println(film1.toString());
	Cliente cliente = new Cliente("Gisela","56685666","benito lynch 1978");
	System.out.println(cliente.toString());
    }
}
