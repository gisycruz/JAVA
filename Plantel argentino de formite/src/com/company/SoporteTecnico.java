package com.company;

public class SoporteTecnico extends Persona {
    private  String especializacion;
    public SoporteTecnico(){};
    public SoporteTecnico(String nombre, String apellido,int edad,String localidad,String especializacion){
        super(nombre,apellido,edad,localidad);
        this.especializacion=especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public void viajamos() {

    }

    @Override
    public String toString() {
        return "             SoporteTecnico                 " +
                ""+super.toString()+
                "\nespecializacion   " + especializacion ;
    }
}
