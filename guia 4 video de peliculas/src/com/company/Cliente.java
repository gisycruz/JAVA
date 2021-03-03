package com.company;

import java.util.Enumeration;

//Por otro lado, nuestro cliente nos cuenta que
// le interesa saber acerca de quienes alquilan sus películas, su nombre, teléfono y dirección.
public class Cliente {
    private  String nombre;
    private String telefono;
    private String direccion;

    public Cliente(){};
    public Cliente(String nombre, String telefono,String direccion){
        this.validacionTelefono(telefono);
        this.nombre = nombre;
        this.direccion = direccion;
    }
    private void validacionTelefono(String telefono){
        try {
            Integer.parseInt(telefono);
           this.telefono = telefono;
        } catch (NumberFormatException nfe){
            System.out.println("No es un número");
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "\n<<<<<<<<<<<<<<<<<<<Cliente><<<<<<<<<<<<<<<<<<<<<<<<<<<" +
                "\n nombre              :" + nombre +
                "\n telefono             :" + telefono +
                "\n direccion            :" + direccion ;
    }
}
