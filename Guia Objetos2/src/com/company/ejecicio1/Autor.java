package com.company.ejecicio1;

public class Autor {
  private String Nombre;
  private String Apellido;
  private String Mail ;
  private char Genero;
  // contructor

    public Autor (String nombre,String apellido,String mail , char genero)
    {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Mail = mail;
        this.Genero = genero;
    }
      //getter
      public void getterAutor(){
          System.out.println("AUTOR :\nNombre: "+ Nombre +"\nApellido: "+ Apellido +"\n Mail: "+ Mail +"\n Genero: "+ Genero);
         /* return "Autor{" +
                  "nombre='" + nombre + '\'' +
                  ", apellido='" + apellido + '\'' +
                  ", email='" + email + '\'' +
                  ", genero=" + genero +
                  '}';*/
      }
    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public char getGenero() {
        return Genero;
    }

    public String getMail() {
        return Mail;
    }

    //setter
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public void setGenero(char genero) {
        Genero = genero;
    }

}
