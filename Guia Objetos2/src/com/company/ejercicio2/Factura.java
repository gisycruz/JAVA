package com.company.ejercicio2;
import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Factura  {

    private  UUID id;
    private LocalDateTime myfechahora;
    private DateTimeFormatter myfor ;
    private String FormaFecayHora;
    private Cliente cliente;
    private ItemVenta[] ArrayProducto ;//e
    //constructor
    public Factura(Cliente cliente, ItemVenta[] nue){
        this.cliente =cliente;
        this.id = UUID.randomUUID();
        this.myfechahora = LocalDateTime.now();
        this.myfor=DateTimeFormatter.ofPattern("dd-MM-yyyy  hh:mm:ss");
        this.FormaFecayHora = myfechahora.format(myfor);
        this.ArrayProducto =nue ;//e

    }

    //setter
    public void setId(UUID id) { this.id = id; }
    //getter
    public UUID getId() {
        return id;
    }
    public Cliente getCliente() { return cliente; }
    public String getFormaFecayHora() { return FormaFecayHora; }

    public void getArrayProducto( ){
        for(int i =0 ;i< ArrayProducto.length;i++){
            System.out.println("PRODUCTO N° "+i+"\n ID producto: "+ArrayProducto[i].gettId()+"\n Nombre "+ArrayProducto[i].gettNombre()+"\n Descripcion : "+ArrayProducto[i].getDescripcion()+"\n valor $ "+ArrayProducto[i].getPrecioUnitario());
        }
    }//e
    public double sumaProductos(){
        double suma =0;
        for(int i=0 ; i< ArrayProducto.length;++i)
        {
            suma =suma + ArrayProducto[i].getPrecioUnitario() ;
        }
        return suma;
    }//e

    public double montoTotalDeTodosProducAplicandoDesClient(){
        double total = this.sumaProductos()-(this.sumaProductos()*cliente.getDescuento()/100);
        return  total;
    }

    /*d. Cree un método que facilite la impresión del objeto de tipo Factura y que  siga el siguiente formato.
    Factura[id=?, fecha=?, monto=?, montoDesc=?,  Cliente[id=?, nombre=?,  email=?, descuento=?]] */
    public void getterFactura (){
        System.out.println(" \n FATURA: \n ID factura: "+this.getId()+"\n Fecha y Hora Emitida : "+this.getFormaFecayHora()+" \n Cliente: "+cliente.getNombre()+"\n ID de cliente: "+cliente.getID()+"\n Email cliente : "+cliente.getEmail());
        this.getArrayProducto();
        System.out.println("\n Descuento del cliete % "+cliente.getDescuento()+" \n monto de su compra $ "+this.sumaProductos()+ "\n Monto Total Con Descuento es $ "+this.montoTotalDeTodosProducAplicandoDesClient());

    }



}
