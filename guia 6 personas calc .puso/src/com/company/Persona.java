package com.company;
/*1) Haz una clase llamada Persona que siga las siguientes condiciones:  Sus atributos son: nombre, edad, DNI, sexo
(H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso
 es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
  Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String,
  etc.). Sexo sera hombre por defecto, usa una constante para ello.
 Se implantaran varios constructores:  Un constructor por defecto. 
 Un constructor con el nombre, edad y sexo, el resto por defecto.  Un constructor con todos los atributos como parámetro.
*/

import java.util.Objects;

public class Persona {
    private static char HOMBRE = 'H';
    private static char MUJER = 'M';
    private static int PESOIDEAL=-1;
    private static int DEBAJODEPESO=0;
    private static int SOBREPESO =1;
    private static int ERRROR =0;
    private static int TRUE =1;
    private String nombre;
    private int edad;
    private char sexo;
    private int dni;
    private double peso;
    private double altura;

    public Persona() {
        this.generaDNI();
        this.nombre = "";
        this.edad = 0;
        this.sexo = HOMBRE;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo =sexo;
        this.generaDNI();
        this.altura = 0.0;
        this.peso = 0.0;

    }

    public Persona(String nombre, int edad, char sexo, int dni, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = this.setDni(dni);
        this.altura = altura;
        this.peso = peso;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setEdad ( int edad){
        this.edad = edad;
    }

    public void setAltura ( double altura){
        this.altura = altura;
    }
    public void setPeso ( double peso){
        this.peso = peso;
    }

    public void setSexo(char sexo) {
       this.comprobarSexo(sexo);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int calcularIMC() {
        double peso = 0.0;
        peso = this.peso / (this.altura * this.altura);
        System.out.println("resultado :"+peso);
        if (peso < 20) {
            System.out.println("ESTA BIEN ");
           return PESOIDEAL;
        }
            if (peso >= 20 && peso <= 25) {
                System.out.println("esta por DE bAJO DE SU PESO ");
                return DEBAJODEPESO;
            }
            if (peso > 25) {
                System.out.println("SOBRE PESO ");
                return SOBREPESO;
            }

            return 2 ;
        }
        public boolean esMayorEdad ( int edad){
            boolean mayor;
            if (this.edad > 18) {
                mayor = true;
            } else {
                mayor = false;
            }
            return mayor;
        }
        private void comprobarSexo(char sexo) {
            if (sexo == MUJER) {
                this.sexo = sexo;
            }
        }
        private void generaDNI () {
            // De esta manera generamos un numero entre 1 a 50000000.
            this.dni = (int) (Math.random() * 50000000 + 1);
        }

        public int setDni ( int dni){
            if (dni < 99999999 && dni > 9999999) {
                this.dni = dni;
            } else {
                System.out.println(" EL DNI NO ES CORRECTO ");
                this.generaDNI();
            }
            return this.dni;
        }




        @Override
        public String toString () {
            return "\n____________Persona__________________________" +
                    "\n  nombre       :" + nombre +
                    "\n edad          :" + edad +
                    "\n sexo          :" + sexo +
                    "\n dni           :" + dni +
                    "\n peso          :" + peso +
                    "\n altura        :" + altura;
        }
    }

