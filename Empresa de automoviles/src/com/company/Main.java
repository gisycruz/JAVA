package com.company;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        ArrayList<Vehiculo> vehiculoArrayList = new ArrayList<>();
        vehiculoArrayList.add(new VehiculosUtilitario("parnet",400000));
        vehiculoArrayList.add(new AutoCarrera("PALIO",500000));
        vehiculoArrayList.add(new AutoUrbano("fox",300000));
        vehiculoArrayList.add(new Motocicleta("vespa",20000));

        //
        Motocicleta motocicleta1 = new Motocicleta();
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE NOMBRE DEL MODELO DE LA MOTOCICLETA");
         motocicleta1.setNombreModelo(teclado.next());
         System.out.println("ingrese el valor de mercado ");
         motocicleta1.setPrecioMercado(teclado.nextDouble());
         System.out.println("INGRESE LA CILINGRADA QUE POSSE");
         motocicleta1.setCilindrada(teclado.nextDouble());

         vehiculoArrayList.add(motocicleta1);
         File file = new File ("Vehiculos.json");
         BaseDato baseDato = new BaseDato();
         new ArrayList<>();
         try {
             baseDato.writerEnArchivoJSON(vehiculoArrayList);
             baseDato.leerArchivoJson();



         }catch (IOException e){
             e.getMessage();
         }
    }

}

