package com.company.ejecicio1;

/*1. Es necesario modelar el objeto de tipo Libro con las siguientes caracteristicas, titulo,  precio, stock y Autor,
 este último posee las características de nombre, apellido,  email y genero ( ‘M’ o ‘F’ ). Para este ejercicio vamos
  a asumir que un libro tiene un  único autor. Ejecute las siguientes instrucciones: 
h. Modificar la clase Libro, para que acepte más de 1 Autor. Y realizar los
 cambios necesarios en el método del punto g, para imprimir un nuevo  mensaje que liste los autores
  que contribuyeron a ese libro.  
 */
public class Libro  {

    private String titulo;
    private double Precio;
    private int Stock;
    private Autor[] arrayAtor;


    //constructor
    public Libro (String titulo,double precio,int stock,Autor[] nuevo ){

        this.titulo = titulo;
        this.Precio = precio;
        this.Stock = stock;
        this.arrayAtor = nuevo;
    }
    //getter
    public String getTitulo() {
        return titulo;
    }
    public double getPrecio() {
        return Precio;
    }
    public int getStock() {
        return Stock;
    }
    public void getArregloAtor(){
        for(int i = 0; i< arrayAtor.length; i++){
            System.out.println(" Autores "+i+"  Nonmbre "+this.arrayAtor[i].getNombre()+" Apellido "+this.arrayAtor[i].getApellido()+" Mail "+this.arrayAtor[i].getMail()+" Genero "+this.arrayAtor[i].getGenero());
        }
    }
    //setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }
    public void setStock(int stock) {
        Stock = stock;
    }

   /* g. Agregue un método a la clase Libro que posibilite imprimir en pantalla el  siguiente mensaje: 
 “El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.” */
 public  void getMesajeDelLibro(){
     System.out.println("\n El Libro "+this.getTitulo()+" Se vende a $"+this.getPrecio()+" pesos .");
     this.getArregloAtor();
 }

}
