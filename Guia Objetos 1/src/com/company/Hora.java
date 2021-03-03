package com.company;
/*5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
 Tenga en cuenta el rango de valores aceptados para cada uno de estos. 
  a. Hora: 0 … 23  b. Minuto: 0 … 59  c. Segundo: 0 … 59  Considere el siguiente comportamiento:
 1. Un método que imprima la hora bajo el siguiente formato ​hh:mm:ss  usando zero a la izquierda ejemplo 13:04:22 . 
 2. Un método que avance en 1 segundo y devuelva la instancia del objeto. 
 3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto. 
 4. Instanciar el objeto y probar los métodos creados. 
 */
public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    // contrustor;
    public Hora(int hora, int minutos, int segundos) {
        if(hora >=0 && minutos >=0 && segundos >= 0) {
            if (hora <= 23 && minutos <= 59 && segundos <= 59) {
                this.hora = hora;
                this.minutos = minutos;
                this.segundos = segundos;
            } else
                System.out.println("INGRESO MAL LOS DATOS ");
        }
        else
            System.out.println("ingrese numeros mayores de 0 ");
    }
    // setter
    public void setHora(int hora) {
        this.hora = hora;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    //getter
    public String getSegundos() {
        String seg = ""+segundos;
        if(segundos <10) {
            seg = "0" +segundos;
        }
        return seg;
    }
    public String getMinutos() {
        String min = ""+minutos;
        if(minutos <10) {
            min = "0" + minutos;
        }
        return min;
    }

    public String getHora() {
        String ho= ""+hora;
        if(hora <10)
        {
            ho="0"+hora;
        }
        return  ho;
    }
    public void mostrarHora()
    {
        System.out.println("hola soy la hora ->"+ this.getHora()+":"+this.getMinutos()+":"+this.getSegundos());
    }
    //funciones de movimiento

    public void Avancedesegundos()
    {
       ++segundos;
        this.mostrarHora();
    }
    public void RetrosederSegundos(){
       --segundos;
        this.mostrarHora();
    }

}
