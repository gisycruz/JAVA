package com.company;

import java.util.Scanner;

public class CargaDePersona extends Persona{

    private Scanner teclado = new Scanner(System.in);

    public CargaDePersona() {
        super();
    }
    public CargaDePersona(String nombre, int edad, char sexo){
        super(nombre,edad,sexo);
    }

    public void cargaPersona() {
        System.out.println("ingrese su nombre ");
        super.setNombre(teclado.next());
        System.out.println("INGRESE SU EDAD");
        super.setEdad(teclado.nextInt());
        System.out.println("INGRESE SEXO ");
        super.setSexo(teclado.next().charAt(0));
        System.out.println("ingrese su peso ");
        super.setPeso(teclado.nextDouble());
        System.out.println("ingrese su altura ");
        super.setAltura(teclado.nextDouble());
    }
}
