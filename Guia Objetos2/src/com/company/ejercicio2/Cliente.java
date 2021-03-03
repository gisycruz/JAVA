package com.company.ejercicio2;
import java.util.UUID;
/*2. Nos contratan para hacer un programa que lleve el control de las ventas de un  local.
Para esto es necesario modelar la clase Cliente, que posee un atributo id  como identificador del cliente,
el mismo debe ser un valor compuesto por letras y  números aleatorios que se generan automáticamente
al crear un Cliente. El Cliente  también posee un nombre, un email y un porcentaje de descuento.
Por otro lado vamos a tener el objeto Factura que representa una venta del  local, cada Factura posee
un identificador de las mismas características que el  usado en Cliente. A su vez cada factura posee un monto total,
una fecha y el Cliente  que generó la compra. Para la fecha de la venta se le va a asignar
la fecha y hora al  momento de creación del objeto Factura. El tipo Factura debe contar
con un  método que calcule el monto final luego de aplicarle el descuento que posee el  cliente. 
 // a. Investigue la clase UUID y sus métodos estáticos para la generación de los  ids.
 // Investigue la clase LocalDate y sus métodos estáticos para la generación  de la fecha. 

 */

public class Cliente {

     private UUID uuid;
    private String Nombre;
    private String Email;
    private double Descuento;
    //construtor
    public Cliente(String Nombre,String Email,double Descueto){

         this.uuid = UUID.randomUUID();
        this.Nombre = Nombre;
        this.Email = Email;
        this.Descuento = Descueto;
    }

    public Cliente() {

    }

    //getter
    public UUID getID() {
        return uuid;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getEmail() {
        return Email;
    }
    public double getDescuento() {
        return Descuento;
    }
    //setter

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setDescuento(double descuento) {
        Descuento = descuento;
    }


    /*2.bmétodo que facilite la impresión del mismo. Cliente[id=?, nombre=?, email=?, descuento=?]*/
    public  void getclientes(){
        System.out.println("CLIENTE \n  ID Cliente : "+uuid+"\n Nombre : "+Nombre+"\n Email: "+Email+"\n Descueto %: "+Descuento);
    }
}
