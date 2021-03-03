package com.company;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import java.util.concurrent.locks.ReadWriteLock;

public class Main {

    public static void main(String[] args) {
	   Ingrediente ingrediente1 = new Ingrediente("MALTA","COLOR ",2, 20);
	   Ingrediente ingrediente2 = new Ingrediente("azucar","gusto",3,30);
	   Ingrediente ingrediente3 = new Ingrediente("sal","gusto",4,30);
	   Ingrediente ingrediente4= new Ingrediente("elevadura","eleva ",3,10);
	   Ingrediente ingrediente5 = new Ingrediente("azucar de maiz","gusto",5,4);

	   Receta receta1 = new Receta("cerveza roja","ARGENTINA");
	   receta1.agregarIngrediente(ingrediente1);
	   receta1.agregarIngrediente(ingrediente4);
	   receta1.agregarIngrediente(ingrediente5);

	   Receta receta2 = new Receta("cerveza negra","Autrualia");
	   receta2.agregarIngrediente(ingrediente1);
	   receta2.agregarIngrediente(ingrediente3);
	   receta2.agregarIngrediente(ingrediente5);

	   Receta receta3 = new Receta("cerveza rubia", "alemania");
	   receta3.agregarIngrediente(ingrediente1);
	   receta3.agregarIngrediente(ingrediente5);
	   receta3.agregarIngrediente(ingrediente2);

	   Roja roja = new Roja("ipa",10,"color roja",receta1,20,true);
	   Rubia rubia = new Rubia("poter",15,"color amarillo",receta3,3,false);
	   Negra negra = new Negra("scko",9,"color negro",receta2,5,false);

	   FabricaDeCerveza fabricaDeCerveza1 = new FabricaDeCerveza("antares","olavarria 2345");
	   fabricaDeCerveza1.agregarCerveza(roja);
	   fabricaDeCerveza1.agregarCerveza(rubia);
	   fabricaDeCerveza1.agregarCerveza(negra);
	   fabricaDeCerveza1.agregarCerveza(rubia);

	   System.out.println(fabricaDeCerveza1.toString());

    }
}
