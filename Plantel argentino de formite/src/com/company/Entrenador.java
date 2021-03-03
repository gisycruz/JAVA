package com.company;

public class Entrenador extends Persona {

    private int anioDeExperiencia;
    public Entrenador(){};
    public Entrenador(String nombre, String apellido,int edad,String localidad,int anioDeExperiencia){
        super(nombre,apellido,edad,localidad);
        this.anioDeExperiencia=anioDeExperiencia;
    }

    public int getAnioDeExperiencia() {
        return anioDeExperiencia;
    }

    public void setAnioDeExperiencia(int anioDeExperiencia) {
        this.anioDeExperiencia = anioDeExperiencia;
    }

    @Override
    public void viajamos() {

    }

    @Override
    public String toString() {
        return " \n           Entrenador            " +
                "" +super.toString()+
                "\nanioDeExperiencia " + anioDeExperiencia;
    }
}
