package com.company;
/*4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre  y balance.
Considere los getters, setters y constructores necesarios. Tenga en  cuenta los siguientes métodos. 
 a. El método crédito que representa un depósito de dinero en la cuenta. Este  método debe devolver el balance luego de la operación. 
 b. El método débito que representa una sustracción de dinero de la cuenta.  Este método debe devolver el balance luego de la operación.
  Si el dinero en  la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por  pantalla un aviso. 
 c. Un método que imprima por pantalla las características del objeto. 
  Realice las siguientes operaciones: 
  1. Inicialice una cuenta con un monto inicial de 15000.
  2. Realice una operación de crédito de 2500. 
  3. Realice una operación de compra de 1500. 
  4. Realice una operación de compra de 30000. 
 5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea  correcto. 
 */
public class CuentaBancaria {
    private int ID;
    private String Nombre;
    private double Balance;
    //contructores
    public  CuentaBancaria (int ID,String Nombre,double Balance){
        this.ID = ID;
        this.Nombre = Nombre;
        this.Balance = Balance;
    }
    // getter
    public double getBalance() {
        return Balance;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getID() {
        return ID;
    }
    public  void getCuentaBancaria(){
        System.out.println("Cuenta Bancaria de ..:" +Nombre+ ", ID..: "+ID+" , Balance de cuenta ..: "+Balance);
    }

    //metodos para funciones del objejo
    public double Credito(double monto){
        this.Balance =this.Balance + monto;
        return  this.Balance;
    }
    public  double Debito(double monto ){
        if(this.Balance >= monto ) {
           this.Balance = this.Balance - monto;
        }
        return this.Balance;
    }
}
