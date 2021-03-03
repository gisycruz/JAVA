package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bateria bateria1 = new Bateria("FHILP", 300, 3, 2);
        Bateria batera2 = new Bateria("hatr", 400, 2, 2);
        Bajo bajo1 = new Bajo("der", 4000, "greta");
        Bajo bajo2 = new Bajo("no lo", 3000, "campeon");
        GuitarraArcustica guitarraArcustica1 = new GuitarraArcustica("fhilip", 4000, TipoDeMadera.NOGAL);
        GuitarraArcustica guitarraArcustica2 = new GuitarraArcustica("buee", 6000, TipoDeMadera.CAOBA);
        GuitarraElectrica guitarraElectrica1 = new GuitarraElectrica("BREE", 3000, "FASH");
        GuitarraElectrica guitarraElectrica2 = new GuitarraElectrica("gatres", 4000, "nueva");
        List<Instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(bateria1);
        instrumentos.add(batera2);
        instrumentos.add(guitarraArcustica1);
        instrumentos.add(guitarraArcustica2);
        instrumentos.add(guitarraElectrica1);
        instrumentos.add(guitarraElectrica2);
        instrumentos.add(bajo1);
        instrumentos.add(bajo2);

        for (int i = 0; i < instrumentos.size(); i++) {
            System.out.println(instrumentos.get(i).toString());
        }
        for (int i = 0; i < instrumentos.size(); i++) {
            System.out.println(" precio sin aumento "+instrumentos.get(i).getPrecio());
            System.out.println(" precio con aumento "+instrumentos.get(i).precioAumentado());
        }
    }
}