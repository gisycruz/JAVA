package com.company;

public class Jugador extends Persona {

    private  String posicion;
    private String nikename;
    private int victorias;
    public Jugador(){};
    public Jugador(String nombre, String apellido,int edad,String localidad,String posicion,String nikename){
        super(nombre, apellido,edad,localidad);
        this.nikename =nikename;
        this.posicion = posicion;
        this.victorias=0;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    @Override
    public void viajamos() {

    }

    @Override
    public String toString() {
        return "      Jugador              " +
                "\n "+ super.toString()+
                "\nposicion       " + posicion + '\'' +
                "\nnikename     " + nikename + '\'' +
                "\nvictorias    " + victorias ;
    }
}
