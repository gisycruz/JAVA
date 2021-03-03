package com.company;
/*2. Modele el objeto Empleado que posee las siguientes características, dni, nombre,  apellido y salario
El mismo debe contar con la posibilidad de calcular el salario  anual. A su vez se requiere otro método que permita aumentar el salario  dependiendo del porcentaje que se le pase por parámetro.
 Considere crear un  método que facilite imprimir por pantalla las características del objeto de la  siguiente forma:
 Empleado[dni=?, nombre=?, apellido=?, salario=?] 
 a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de  25000.
 b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de  27500. 
 c. Imprima ambos objetos por pantalla 
  d. Aumente el salario del empleado Carlos en un 15% e imprima en
    pantalla el  salario anual del mismo. 
 */
public class Empleado {
    private int DNI;
    private String Nombre;
    private String Apellido;
    private  double Salario;
    // metodo constructor
    public Empleado(int DNI , String Nombre ,String Apellido ,double Salario){
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellido= Apellido;
        this.Salario = Salario;
    }
    public  String getNombresEmpleados(){
        return Nombre;
    }
    public String getApellidoEmpleado(){
        return Apellido;
    }
    public void getEmpleado(){
        System.out.println("EMPLEADO ...: DNI : "+DNI+", Nombre : " +Nombre+", Apellido : "+Apellido+" ,Salario : "+Salario);
    }

    //Salario anual
    public  double SalarioAnual(){
        double anual = Salario * 12;
        return  anual;
    }
    //aumento de salario
    public  double AumentoDeSalario(double porcentaje){
        double aumento = Salario * porcentaje /100 + (Salario);
        return  aumento;
    }
}
