package com.company.ejercicio2;

import com.company.ejercicio2.Cliente;
import java.util.UUID;
/*e. Analizar de agregar el tipo ItemVenta, que representa un producto que  forma parte de la venta.
El mismo contiene un id, un nombre, descripción y  precio unitario. Considere las modificaciones necesarias
 en el tipo Factura  para que el mismo pueda almacenar múltiples Ítems de venta y a su vez  calcular
 los montos totales con y sin el descuento aplicado.
  */
public class ItemVenta {

    private UUID id;
    private String Nombre;
    private String descripcion;
    private double PrecioUnitario;
    //constructor
    public ItemVenta(String nombre,String descripcion,double precioUnitario){
          this.id = UUID.randomUUID();
          this.Nombre = nombre;
          this.descripcion= descripcion;
          this.PrecioUnitario = precioUnitario;
    }
    //getter

    public UUID gettId() {
        return id;
    }
    public String gettNombre() {
        return Nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecioUnitario() {
        return PrecioUnitario;
    }

    //setter
    public void settNombre(String nombre) {
        this.Nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecioUnitario(double precioUnitario) {
        PrecioUnitario = precioUnitario;
    }
}
