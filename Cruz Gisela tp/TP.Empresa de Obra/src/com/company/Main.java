package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //ejercicio 2.A
        Arquitecto a1= new Arquitecto(5467,34573423," Martinez Matin","2234567890");
        Arquitecto a2 = new Arquitecto(4578,31986568,"Perez Pedro","2234364568");
        MaestroObra m1 = new MaestroObra(32675849,"Rodriguez Rogrigo",34,"2235475679");
        MaestroObra m2 = new MaestroObra(23674579,"Gonzalez Gonzalo",38,"2236574856");
        Obrero o1 = new Obrero(21564738,"Gutierez Gustavo",45,"2236571234");
        Obrero o2 = new Obrero(28345647,"fernandez Fernando",45,"2234345678");
        Obrero o3 = new Obrero(23456789,"Marquez Marcos",67,"2234321223");
        a1.trabajar();
        m2.trabajar();
        o1.trabajar();

        // ejercicio.2.B
        Empresa empresa1= new Empresa(" CONSTRUMAR ");
        empresa1.agregarArquitecto(a1);
        empresa1.agregarArquitecto(a2);
        empresa1.agregarMaestro(m1);
        empresa1.agregarMaestro(m2);
        empresa1.agregarObrero(o1);
        empresa1.agregarObrero(o2);
        // Ejercicio.2.C
        List<MaestroObra>maestrodeObra1 = new ArrayList<>();
        List<Obrero>obrero1 = new ArrayList<>();
        maestrodeObra1.add(empresa1.buscarMaestroEnListaEmpleados(23674579));
        maestrodeObra1.add(empresa1.buscarMaestroEnListaEmpleados(32675849));
        obrero1.add(empresa1.buscarObreroEnListaDeEmpleados(28345647));
        obrero1.add(empresa1.buscarObreroEnListaDeEmpleados(21564738));

        Hotel hotel1 = new Hotel("Hotel palacio","Bronw 2345",5000,300,264,empresa1.buscarArquitecto(31986568),2,obrero1,maestrodeObra1);
        Comercio comercio1= new Comercio("Black Rosse","Indumentaria","Guemes 2714",3000,200,190,empresa1.buscarArquitecto(34573423),obrero1,maestrodeObra1);
        ObraDomestica obraDomestica = new ObraDomestica(2,"Olavarria 1234",2000,200,190,a1,obrero1,maestrodeObra1);
        System.out.println("Caculo estimado del hotel $ "+hotel1.calculoDePrecioEstimado());
        System.out.println("Caculo estimado del comercio $ "+comercio1.calculoDePrecioEstimado());
        System.out.println("Caculo estimado de obra domestica $ "+obraDomestica.calculoDePrecioEstimado());

         //Ejercicio 2.D

        empresa1.agregarHotel(hotel1);
        empresa1.agregarObraDomestica(obraDomestica);
        empresa1.agrerComercio(comercio1);
        //Ejercio 2.E
        System.out.println("___________EMPLEADOS DE la Empresa "+empresa1.getNombreEmpresa()+"________");

       hotel1.mostrarLosEmpleados();
       comercio1.mostrarLosEmpleados();
       obraDomestica.mostrarLosEmpleados();
       //Ejercicio2.F
        System.out.println("-______________ OBRAS DE la Empresa "+empresa1.getNombreEmpresa()+"____________ ");
        System.out.println(comercio1.toString());
        System.out.println(obraDomestica.toString());
        System.out.println(hotel1.toString());

    }
}
