package com.company;

public class Main {

    public static void main(String[] args) {
        //ejercicio1
        Rectangulo R1 = new Rectangulo();
        R1.setAncho(4);//a
        R1.setAltura(3);//a
        System.out.println("objeto rectangulo con valores .....altura: " +R1.getAltura()+ "  ancho ..: "+ R1.getAncho());//b
        System.out.println("Area del mismo es : " +R1.areaRectangulo()+" Perimetro...:"+R1.perimetroRectangulo());//C
        R1.setAltura(8);//d
        R1.setAncho(10);//d
        System.out.println("objeto anterior con distintos valoles .. :altura "+R1.getAltura()+" ancho..:  "+R1.getAncho()+" El area es ..: "+R1.areaRectangulo()+" Su perimetro es ...: " +R1.perimetroRectangulo());//e
        Rectangulo R2 = new Rectangulo();//f
        System.out.println("Nuevo objeto rectangulo voleres por defecto es altura de ...: " +R2.getAltura()+ " El ancho es de ...: " +R2.getAncho());//f
        //ejercicio2
        Empleado E1 = new Empleado( 23456345,"Carlos","Gutiérrez",25000);//a
        Empleado E2 = new Empleado(34234123,"Ana"," Sánchez", 27500);//b
        E1.getEmpleado();//C
        E2.getEmpleado();//C
        double aumento = E1.AumentoDeSalario(15);
        System.out.println(" aumenta un 15% el salario de  " +E1.getApellidoEmpleado()+ " "+E1.getNombresEmpleados()+" es de : " +aumento+ " el salario anual con el aumento es de "+((aumento*12)));
        //ejercicio3
        ItemdeVentas item1 = new ItemdeVentas(1,"Azucar",20,34);//a
        item1.getItemdeVentas();//b
        System.out.println("El precio TOTAL de "+item1.getDescripcion()+" es de $ "+item1.CalculaPrecioTotal());//b
        //ejercicio4

        double  balanceNuevo;
        double balance;
        CuentaBancaria c1 = new CuentaBancaria(0, "Gisela Cruz", 15000);

        c1.Credito(2500);
        System.out.println(" Ingreso dinero en su cuenta , dinero disponible es...:$ "+c1.getBalance());

        balance = c1.getBalance();
        System.out.println(" se debitar 15000");
        balanceNuevo = c1.Debito(1500);
        if (balance == balanceNuevo)
            System.out.println("Monto Insuficiente ");
        else
            System.out.println("despues de su compra el  Monto  disponible es de $" + c1.getBalance());

        balance = c1.getBalance();
        System.out.println(" se debitar 30000");
        balanceNuevo = c1.Debito(30000);
        if (balance == balanceNuevo)
            System.out.println("Monto Insuficiente para su compra dispone de $ "+c1.getBalance());
        else
            System.out.println("despues de su compra el  Monto  disponible es de $" + c1.getBalance());

        //ejercicio5
        Hora es = new Hora(23,04,03);
        es.mostrarHora();
        es.Avancedesegundos();
        es.RetrosederSegundos();
    }
    }


