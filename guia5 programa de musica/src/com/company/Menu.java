package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Cancion> cancionList;
    private ListaClasica listaClasica ;
    private ListaPremium listaPremium;
    private Scanner miScanner  = new Scanner(System.in);

    public Menu(){
        this.cancionList = new ArrayList<>();
        this.listaClasica = new ListaClasica();
        this.listaPremium = new ListaPremium();
        this.TraerlistaDeCaciones();
    };


    public void menuCancionesListaBasica() {

        int respuesta;

        do {
            System.out.println("-----------------------------------");
            System.out.println("Elija una opcion (0 para volver)");

            System.out.println("1-Añadir Canción");
            System.out.println("2- Ver mi lista");
            System.out.println("3- Reproducir lista");
            System.out.println("4- Eliminar Canción");

            respuesta = miScanner.nextInt();

            switch (respuesta) {
                case 1:
                    this.elegirCancionListaClasica();
                    break;
                case 2:
                    listaClasica.verLista();
                    break;
                case 3:
                    this.reproducir();

                    break;
                case 4:
                    this.eliminarCancionListaClasica();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Parametro no valido, Reintente...");
                    break;
            }
        } while (respuesta != 0);
    }
    public void menuListaPremium() {

        int respuesta;

        do {
            System.out.println("-----------------------------------");
            System.out.println("Elija una opcion (0 para volver)");

            System.out.println("1-  Añadir Canción");
            System.out.println("2- Ver mi lista");
            System.out.println("3-Reproducir lista ");
            System.out.println("4- Eliminar Canción");

            respuesta = miScanner.nextInt();

            switch (respuesta) {
                case 1:
                    this.elegirCancionListaPremium();
                    break;
                case 2:
                    listaPremium.verLista();
                    break;
                case 3:
                    listaPremium.reproducir();

                    break;
                case 4:
                    listaPremium.eliminarCacion();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Parametro no valido, Reintente...");
                    break;
            }
        } while (respuesta != 0);
    }

private void reproducir(){
      System.out.println(listaClasica.getNombre());
      listaClasica.reproducir();
      listaClasica.verLista();
}
private void elegirCancionListaClasica(){
        this.mostrarListaOriginal();
    System.out.println("escriba el titulo de  la cacion que quiere agredar a la lista de reproduccion ");
    Cancion cancion = buscarCacionListaOriginal(miScanner.next());
    this.listaClasica.agregarCacion(cancion);
    cancion.getNombre();
}
private void eliminarCancionListaClasica(){
        this.listaClasica.eliminarCacion();
        System.out.println(" \n quiere pagar por una lista Premium ");
        String si = miScanner.nextLine();
        if (si.equalsIgnoreCase("si")){
            this.menuListaPremium();
        }else {
          this.menuCancionesListaBasica();
        }
}
   private void elegirCancionListaPremium(){
       System.out.println(" \n ingrese el nombre de su lista de reproducicon Premium ");
       this.listaPremium.setNombre(miScanner.nextLine());
       this.TraerlistaDeCaciones();
       this.mostrarListaOriginal();
       System.out.println("escriba el titulo de  la cacion que quiere agredar a la lista de reproduccion premium ");
       Cancion cancion = buscarCacionListaOriginal(miScanner.next());
       this.listaPremium.agregarCacion(cancion);
   }
    public void TraerlistaDeCaciones() {
        Artista disturbed = new Artista("Disturbed", 25, Nacionalidad.ESTADOUNIDENSE);
        Album theSickness = new Album("The Sickness", 2000, disturbed);
        Cancion downWithTheSickness = new Cancion("Down With The Sickness", "4:38", Genero.METAL, theSickness);
         this.cancionList.add(downWithTheSickness);

        Artista gunsNRoses = new Artista("Guns 'n Roses", 34, Nacionalidad.ESTADOUNIDENSE);
        Album appetiteForDestruction = new Album("Appetite for Destruction", 1987, gunsNRoses);
        Cancion sweetChildOMine = new Cancion("Sweet Child o' Mine", "5:38", Genero.ROCK, appetiteForDestruction);
         this.cancionList.add(sweetChildOMine);

        Artista billieEilish = new Artista("Billie Eilish", 18, Nacionalidad.ESTADOUNIDENSE);
        Album whenWeAllFallAsleep = new Album("When We All Fall Asleep, Where Do We Go?", 2019, billieEilish);
        Cancion badGuy = new Cancion("Bad Guy", "3:33", Genero.POP, whenWeAllFallAsleep);

        this.cancionList.add(badGuy);

        Artista queen = new Artista("Queen", 45, Nacionalidad.INGLES);
        Artista davidBowie = new Artista("David Bowie", 69, Nacionalidad.ESTADOUNIDENSE);
        Album hotSpace = new Album("Hot Space", 1982, queen);
        Cancion underPressure = new Cancion("Under Pressure", "5:33", Genero.ROCK, hotSpace, davidBowie);

        this.cancionList.add(underPressure);

        Album newsOfTheWorld = new Album("News Of The World", 1977, queen);
        Cancion weWillRockYou = new Cancion("We Will Rock You", "5:21", Genero.ROCK, newsOfTheWorld);

        this.cancionList.add(weWillRockYou);

        Artista gorillaz = new Artista("Gorillaz", 21, Nacionalidad.INGLES);
        Album demonDays = new Album("Demon Days", 2005, gorillaz);
        Cancion feelGoodInc = new Cancion("Feel Good Inc", "4:25", Genero.ROCK, demonDays);


        Artista michaelJackson = new Artista("Michael Jackson", 50, Nacionalidad.ESTADOUNIDENSE);
        Album bad = new Album("Bad", 1987, michaelJackson);
        Cancion smoothCriminal = new Cancion("Smooth Criminal", "5:33", Genero.POP, bad);

        this.cancionList.add(smoothCriminal);

        Artista theWeeknd = new Artista("The Weeknd", 30, Nacionalidad.CANADIENSE);
        Artista daftPunk = new Artista("Daft Punk", 26, Nacionalidad.FRANCES);
        Album starboy = new Album("Starboy", 2016, theWeeknd);
        Cancion iFeelItComing = new Cancion("I Feel It Coming", "4:33", Genero.POP, starboy, daftPunk);

        this.cancionList.add(iFeelItComing);

        Artista theStrokes = new Artista("The Strokes", 21, Nacionalidad.ESTADOUNIDENSE);
        Album roomOnFire = new Album("Room On Fire", 2003, theStrokes);
        Cancion reptilia = new Cancion("Reptilia", "4:15", Genero.POP, roomOnFire);

         this.cancionList.add(reptilia);

        Album randomAccessMemories = new Album("Random Access Memories", 2013, daftPunk);
        Cancion instantCrush = new Cancion("Instant Crush ", "4:15", Genero.POP, randomAccessMemories, theStrokes);

         this.cancionList.add(instantCrush);
    }
    private  void mostrarListaOriginal(){
        for (int i =0; i< this.cancionList.size();i++){
            System.out.println(this.cancionList.get(i).getNombre());
        }
    }
    private Cancion buscarCacionListaOriginal(String titulo){
        int i =0;
         Cancion cancion =null;
        while (i< this.cancionList.size()){
            if(this.cancionList.get(i).getNombre().equalsIgnoreCase(titulo)){
               cancion = this.cancionList.get(i);
               System.out.println(cancion);
            }
            i++;
        }
        if (cancion == null){
            System.out.println("ingreso mal el nombre");

        }
        return cancion;
    }

}
