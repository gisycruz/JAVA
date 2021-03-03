package com.company.Ejercicio1;

public class Cilindro extends Circulo {
    private double Altura = 1.0;

    public Cilindro (){
        super();
    }
    //getter

    public double getAltura() {
        return Altura;
    }

   //setter

    public void setAltura(double altura) {
        Altura = altura;
    }
   /* Modificar el método calcular  volumen en la clase cilindro para que llame al método de la ​SUPER​clase
    que calcula  el área. */
    public double CalculaVolumen(){
       // double v = Math.PI * Math.sqrt(super.getRadio()) * this.Altura;
        double v = super.CalculaArea() * this.Altura;
        return v;
    }
/*● Sobreescribir el método calcular
    area declarado en Círculo, para que nos  permita calcular el área del cilindro.  (2π×radius×height + 2×areaBase)*/

    @Override
    public double CalculaArea() {
        return (2 * Math.PI * super.getRadio() * this.Altura ) + (2 *super.CalculaArea());
    }
/* ● Modificar el método toString() de la clase cilindro para que imprima por
    pantalla lo siguiente  Cilindro: subclase de  + {toString() de Círculo} +altura= {alturaCilindro};*/
    @Override
    public String toString() {
        return "Cilindro:subclase de {" +
                super.toString() +
                "Altura=" + Altura +
                '}';
    }
}
