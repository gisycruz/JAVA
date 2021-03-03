package com.company;
/*3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,  descripción, cantidad y precio unitario.
Cree los métodos para calcular el precio  total teniendo en cuenta el precio unitario y cantidad.
Un método que permita  imprimir por pantalla los atributos del objeto de la siguiente forma:
  ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
 a. Inicialice el objeto con los atributos necesarios 
  b. Imprima por pantalla el objeto inicializado. 
 */
public class ItemdeVentas {
    private  int ID;
    private  String Descripcion;
    private  int Cantidad;
    private  double PrecioUnitario;
    //constructor
    public  ItemdeVentas(int ID,String Descripcion,int Cantidad , double PrecioUnitario ){
        this.ID=ID;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.PrecioUnitario = PrecioUnitario;
    }
    //getter
    public  void getItemdeVentas(){
        System.out.println("Item De Ventas ....:ID = "+ID+" ,Descripcion = "+Descripcion+ ", Cantidad = "+Cantidad+" unidades , Precio Unitario $ "+PrecioUnitario );
    }
    public  String getDescripcion(){
        return Descripcion;
    }
    //metodos funcion del objeto
    public double CalculaPrecioTotal(){
        double total =this.Cantidad * this.PrecioUnitario;
        return  total;
    }
}
