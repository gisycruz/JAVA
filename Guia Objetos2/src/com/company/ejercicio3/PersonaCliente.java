package com.company.ejercicio3;
import java.util.UUID;
/*3. Necesitamos crear un programa para manejar los datos de una Cuenta bancaria de  un Cliente.
  Para esto identificamos los atributos id, nombre y género (M o F) para el  Cliente.*/


public class PersonaCliente {
    private UUID id;
    private  String nombre ;
    private char Genero;
  // costructor
    public PersonaCliente(String nombre,char genero){
        this.id = UUID.randomUUID() ;
        this.nombre=nombre;
        this.Genero = genero;
    }
  //getter
  public UUID getId() { return id; }
  public String getNombre() { return nombre; }
  public char getGenero() { return Genero; }
    public String GetterPersonaCliente(){ return "CLIENTE : \n ID de cliente " +this.id+ "\n Nombre de cliente: " +this.nombre+ "\n Genero : "+this.Genero; }
    //set

    public void setNombre(String nombre) {this.nombre = nombre; }
    public void setGenero(char genero) { Genero = genero; }

}
