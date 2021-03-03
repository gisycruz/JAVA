package com.company.ejercicio3;
import java.util.UUID;
/* Por otro lado tenemos el tipo Cuenta que también posee un identificador, 
 un balance y un Cliente que es el dueño de la cuenta. La Cuenta debe exponer los  métodos depositar
  y extraer que modifican el balance de la misma. Algo a tener en  cuenta es que el método extraer
 no puede extraer dinero si el balance total no lo  permite, si esto sucede se debe imprimir un
 mensaje por pantalla que indique que  la cuenta no posee saldo suficiente. 
d. Es necesario agregar una variante de Cuenta que permita un saldo deudor,  de máximo 2000 pesos.
 Esto significa que la cuenta puede aceptar un  balance negativo con un máximo de - 2000.
 Realice los cambios y pruebas  necesarias.
 e. Analice cómo implementaría con las herramientas conocidas hasta el  momento, llevar un
 registro de como máximo 10 operaciones de depósito y  extracción que se realizaron en la cuenta.
 En donde se almacene en  memoria de alguna forma la siguiente cadena de texto: 
 i. Depósito: ​"El {NombreCliente}, depositó {MontoDepositado}"
 ii. Extracción: ​"El {NombreCliente}, retiró {MontoRetirado}" */

public class CuentaCliente {

    private static final int max = 10;
    private UUID ID;
    private double Balance;
    private double SaldoDeudor;
    private PersonaCliente cliente;
    private int ContadorOperaciones ;
    private String[] Operaciones;

    //constructor
    public CuentaCliente (PersonaCliente cliente){
        this.ID = UUID.randomUUID();
        this.cliente = cliente;
        this.ContadorOperaciones =0;
        this.Operaciones = new String[max];
    }
    //getter

    public double getBalance() {
        return Balance;
    }
    public UUID getID() {
        return ID;
    }
    public double getSaldoDeudor(){
        return SaldoDeudor;
    }
    public void getterCuentaCliente(){
        System.out.println("Cunta bancaria N°:"+ this.ID+"\n ID de cliente: "+cliente.getId()+" \n Nombre : "+cliente.getNombre()+"\n Genero "+cliente.getGenero()+"\n Balances del cliente "+this.Balance);
    }
    public void GetterDeDepositos(double dinero) {
        System.out.println("Tengo en mi cuenta " + this.getBalance() + " deposito "+dinero+ " me quedan " +this.Deposito(dinero) + " Saldo deudor  " + this.getSaldoDeudor());
    }
    public void GetterDeExtraccion(double dinero){
        System.out.println("Tengo en mi cuenta " + this.getBalance() + " extraccion "+dinero+ " me quedan " +this.Extraer(dinero)+" Saldo deudor  " + this.getSaldoDeudor());
    }
    //setter

    public void setBalance(double balance) {
        Balance = balance;
    }
    //FUNCIONES
    public double Deposito(double dinero){
        this.getoperacionesdeposito(dinero);
        this.Balance = this.Balance + dinero;
        if(this.Balance >-2000 && this.Balance < 0){
            this.SaldoDeudor=this.Balance;
        }
        if(this.Balance >= 0){
            this.SaldoDeudor = 0;
        }
        this.ContadorOperaciones++;

        return Balance;
    }
    public double Extraer (double dinero){
        double aux = this.Balance;
        this.Balance = this.Balance - dinero;
        if (this.Balance > -2000) {
            this.getoperacionesextraccion(dinero);
            this.ContadorOperaciones++;
            if (this.Balance <= 0)
                this.SaldoDeudor = this.Balance;

        } else {
            System.out.println("FONDOS INSUFICIENTES");
            this.Balance = aux;
        }
        return Balance;
    }
    public void getoperacionesdeposito (double dinero)
    {
        this.Operaciones[this.ContadorOperaciones] ="El cliente "+cliente.getNombre()+" deposito "+dinero;
    }
    public void getoperacionesextraccion (double dinero)
    {
        this.Operaciones[this.ContadorOperaciones] ="El cliente "+cliente.getNombre()+" retiro "+dinero;
    }

    public void mostrarArreglo (){
        for (int i =0 ; i< this.ContadorOperaciones;i++) {
            System.out.println(this.Operaciones[i]);
        }
    }

}
