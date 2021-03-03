package com.company;
/* ● Inicializar un Cilindro y debuguear analizando los constructores a los que va 
  llamando para inicializar la cadena de herencia. Imprimir por pantalla, el  radio del cilindro,
  la altura, el área de la base y el volumen.
 ● Inicializar un segundo CIlindro esta vez especificando la altura y radio. 
 Imprimir por pantalla el radio, la altura, el área de la base y el volumen. 
   Imprimir por pantalla el área y el volumen del cilindro. Vamos a notar que el  cálculo del volumen difiere,
  esto es porque nosotros sobreescribimos el método  calcular area y ahora nos calcula el área de un cilindro.*/
/* 2.●Inicializar 4 estudiantes diferentes.
●Inicializar 4 miembros de staff con características diferentes.
●Crear un array que permita almacenar juntos los tipos anteriores y
almacenar las 8 instancias creadas anteriormente.
●Investigar el uso de la palabra reservada instanceof.
●Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
la cantidad de miembros de staff.
●Recorrer el array y sumar el total de ingresos que percibe la
institución por parte de la cuota de estudiantes. */


import com.company.Ejercicio1.Cilindro;
import com.company.ejercicio2.Estudiante;
import com.company.ejercicio2.Persona;
import com.company.ejercicio2.Staff;
import com.company.ejercicio3.Circulo;
import com.company.ejercicio3.Cuadrado;
import com.company.ejercicio3.Figura;
import com.company.ejercicio3.Rectangulo;

public class Main {

	public static void main(String[] args) {
		//EJERCICIO1
		Cilindro cil1 = new Cilindro();

		System.out.println("radio " + cil1.getRadio() + " Altura " + cil1.getAltura() + " Area de la base " + cil1.CalculaArea() + "  Volumen cilindro " + cil1.CalculaVolumen());

		System.out.println(cil1.toString());
		Cilindro cil2 = new Cilindro();
		cil2.setAltura(5);
		cil2.setRadio(2);
		System.out.println("radio" + cil2.getRadio() + " Altura " + cil2.getAltura() + " Area de la base " + cil2.CalculaArea() + " Volumen " + cil2.CalculaVolumen());
		System.out.println(cil2.toString());
		//EJERCICIO 2
		Estudiante estudiante1 = new Estudiante(32456715, "Hernan", "Morales", "hernanmorales@gmail.com", "Jose Hernandez 2345", 2000, 1200, "Programacion");
		Estudiante estudiante2 = new Estudiante(31456790, "Javier", "Saez", "javiersanz@gmail.com", "Garcia Lorca 1234", 2003, 2200, "Interiorismo");
		Estudiante estudiante3 = new Estudiante(23456978, "Vanesa", "Lombardi", "Vanesalombardi@gmail.com", "Napoles 1289", 2010, 2400, "Administracion");
		Estudiante estudiante4 = new Estudiante(21234567, "Sabrina", "Mira", "mirasabrina@gmail.com", "Puan 3456", 2020, 600, "Idioma Ingles");
		Staff staff1 = new Staff(34564521, "Luis", "Gramacioli", "luisgramacioni@gmail.com", "Bermejo 345", "Tarde", 30000);
		Staff staff2 = new Staff(23659456, "Camila", "Greta", "camilagreta@gmail.com", "La Prida 234", "Mañana", 10000);
		Staff staff3 = new Staff(37123567, "Brenda", "ramirez", "brendaramirez@gmail.com", "Avellaneda2348", "Noche", 20000);
		Staff staff4 = new Staff(24567834, "Lautaro", "Villareal", "lautarovillareal@gmail.com", "Alem 678", "Tarde", 26000);

		Persona[] persona = new Persona[8];
		persona[0] = estudiante1;
		persona[1] = estudiante2;
		persona[2] = estudiante3;
		persona[3] = estudiante4;
		persona[4] = staff1;
		persona[5] = staff2;
		persona[6] = staff3;
		persona[7] = staff4;
		System.out.println(estudiante1 instanceof Persona);
		for (int i = 0; i < persona.length; i++) {
			System.out.println(persona[i].toString());
		}
		double suma = 0;
		double ingresos;
		for (int i = 0; i < persona.length; i++) {
			if (persona[i] instanceof Estudiante) {
				System.out.println("pocicion " + i + "cuota alumno " + persona[i].ingresos());
				suma = suma + persona[i].ingresos();
			}
		}
		System.out.println("el total de ingresos que percibe la institución por parte de la cuota de estudiantes ES :$" + suma);
		//EJERCICIO3

		Circulo circulo1 = new Circulo("violeta", 4);
		Circulo circulo2 = new Circulo("roja", 2);
		System.out.println("" + circulo1.toString() + "Area " + circulo1.CalculoArea() + " Perimetro " + circulo1.CalculaPerimetro());
		System.out.println("" + circulo2.toString() + "Area " + circulo2.CalculoArea() + " Perimetro " + circulo2.CalculaPerimetro());
		Rectangulo rectangulo1 = new Cuadrado("azul", 4, 3);
		Cuadrado cuadrado1 = new Cuadrado("amarillo", 4, 4);
		System.out.println("" + rectangulo1.toString() + " Area " + rectangulo1.CalculoArea() + " Perimetro " + rectangulo1.CalculaPerimetro());
		System.out.println("" + cuadrado1.toString() + " Area " + cuadrado1.CalculoArea() + " Perimetro " + cuadrado1.CalculaPerimetro());
	}
}
