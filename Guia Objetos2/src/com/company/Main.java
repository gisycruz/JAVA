package com.company;


import com.company.ejecicio1.Autor;
import com.company.ejecicio1.Libro;
import com.company.ejercicio2.Cliente;
import com.company.ejercicio2.Factura;
import com.company.ejercicio2.ItemVenta;
import com.company.ejercicio3.CuentaCliente;
import com.company.ejercicio3.PersonaCliente;

public class Main {

    public static void main(String[] args) {
        /*1 a. Inicialice un objeto de tipo Autor, “Joshua”, “Bloch”, “joshua@email.com”, ’M’. */
        // Autor A1 = new Autor( " Joshua", "Bloch", "joshua@email.com", 'M');//a
        /*1 b. Imprima por pantalla al autor previamente instanciado.*/
        // A1.getterAutor();//b
        /*1 c. Inicialice el libro “Effective Java” del Autor “Joshua Bloch” que cuesta 450  pesos con una cantidad de 150 copias.*/
        // Libro L1 = new Libro("Effective Java",450,150,A1.getNombre(),A1.getApellido(),A1.getMail(),A1.getGenero());//c
        /*1 d. Imprima por pantalla el libro instanciado.*/
        //System.out.println("LIBRO:\n Titulo: " +L1.getTitulo()+ "\nPrecio $: " +L1.getPrecio()+ "\n Stock: " +L1.getStock()+ "\n");//d
        // A1.getterAutor();//d
        /*1 e. Modifique el precio del libro “Effective Java” a 500 pesos y aumente la  cantidad en 50 copias.*/
        // L1.setPrecio(500);//e
        // L1.setStock(L1.getStock()+50);//e
        /*1f. Imprima por pantalla los atributos del Autor Joshua, accediendo desde el  Libro “Effective Java”. */
        //L1.getterlibro();//f
        // L1.getMesajeDelLibro();
        //Autor A2 = new Autor("Jorge","Borge","jorgeborge@gmail.com",'M');
        /*2 b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla.*/

        Autor[] misAtores = new Autor[3];//e
        misAtores[0] = new Autor(" Joshua", "Bloch", "joshua@email.com", 'M');//e
        misAtores[1] = new Autor("Tomas", "Raquel", "tomasRaquel@gmail.com", 'M');//e
        misAtores[2] = new Autor("German ", "Martines", "germanmartinez@gmail.com", 'M');//e
        Libro l1 = new Libro("Effective Java", 450, 150, misAtores);
        l1.getMesajeDelLibro();

        /*2. c. Cree un objeto de tipo Factura que posea al Cliente anteriormente creado. 
 Una vez hecho esto, imprima por pantalla el monto total de esta Factura y el  monto total luego de aplicarle el descuento. */
        Cliente cli1 = new Cliente("Gisela Cruz", "giselacruz@gmail.com", 20);
        cli1.getclientes();
        ItemVenta[] miArray = new ItemVenta[3];//e
        miArray[0] = new ItemVenta("Camisa", "camisa cuello mao", 400);//e
        miArray[1] = new ItemVenta("pantalon", "tiro alto", 1000);
        miArray[2] = new ItemVenta("short", "colores", 500);
        Factura fac1 = new Factura(cli1,miArray);
        fac1.getterFactura();//2d

        //3.a. Crear un Cliente e imprimirlo en pantalla. 
        PersonaCliente Per1 = new PersonaCliente("Jazmin Gutierrez", 'F');
        System.out.println(""+Per1.GetterPersonaCliente());
      // b. Crear una Cuenta bancaria para el Cliente anterior con un saldo inicial de  10000. 
        CuentaCliente cuen1 = new CuentaCliente(Per1);
        cuen1.getterCuentaCliente();
        cuen1.GetterDeDepositos(10000);
        cuen1.GetterDeDepositos(550);
        cuen1.GetterDeExtraccion(400);
        cuen1.GetterDeExtraccion(8000);
        cuen1.GetterDeExtraccion(2000);
        cuen1.GetterDeExtraccion(900);
        cuen1.GetterDeDepositos(100);
        cuen1.GetterDeExtraccion(200);
        cuen1.GetterDeExtraccion(2000);
        cuen1.GetterDeDepositos(4000);


        cuen1.mostrarArreglo();



    }
}
