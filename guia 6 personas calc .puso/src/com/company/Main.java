package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
       /*CargaDePersona cargaDePersona1= new CargaDePersona();
       cargaDePersona1.cargaPersona();
       CargaDePersona cargaDePersona2 = new CargaDePersona("gisela",34,'M');
       CargaDePersona cargaDePersona3 = new CargaDePersona();
       cargaDePersona3.setNombre("lucia");
       cargaDePersona3.setEdad(23);
       cargaDePersona3.setDni(23567890);
       cargaDePersona3.setSexo('e');
       cargaDePersona3.setPeso(56);
       cargaDePersona3.setAltura(1.5);

     HashMap<Integer,CargaDePersona> listaDepersonas = new HashMap<>();
     listaDepersonas.put(cargaDePersona1.getDni(),cargaDePersona1);
     listaDepersonas.put(cargaDePersona2.getDni(),cargaDePersona2);
     listaDepersonas.put(cargaDePersona3.getDni(),cargaDePersona3);
        for (Map.Entry<Integer,CargaDePersona> persona: listaDepersonas.entrySet()) {
            CargaDePersona value = persona.getValue();
            System.out.println(value.toString());
            System.out.println(value.calcularIMC());
        }
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE DIMENCION DEL ARREGLO");
        int dimecion =teclado.nextInt();
      int i =0;
        HashMap<Integer,Password> claves = new HashMap<>();
        HashMap<Integer,Boolean> fuerte = new HashMap<Integer,Boolean>();
       while (i< dimecion){
           System.out.println("indique la longitud de la contrasenia");
        int longCon= teclado.nextInt();
           Password password1 = new Password(longCon);
           claves.put(password1.hashCode(),password1);
           fuerte.put(password1.hashCode(),password1.esFuerte());
           i++;
       }
        System.out.println(claves.values());
        System.out.println(fuerte.values());

      Password password2 = new Password(8);
      Password password3 = new Password();
      System.out.println(password2);
      System.out.println(password3);
      int resul =password2.compareTo(password3);
      System.out.println(resul);
      if (resul == 0)
       System.out.println("las contrasenias son iguales ");
      else
          System.out.println("las contrasenias son distintas ");

        */
        LinkedHashMap<Integer, Serie> serieLinkedHashMap = new LinkedHashMap<>();


        Serie serie1 = new Serie("vis & vis", Genero.ACCION, 4, "Jons Misy");
        Serie serie2 = new Serie();
        Serie serie3 = new Serie("a lo largo del mundo", "Hasmit Robin");
        Serie serie4 = new Serie("el altar", Genero.PELIGRO, 6, "Fernandes danil");
        Serie serie5 = new Serie("el altar", "gren Millon");
        Serie serie6 = new Serie();

        serieLinkedHashMap.put(serie1.hashCode(), serie1);
        serieLinkedHashMap.put(serie2.hashCode(), serie2);
        serieLinkedHashMap.put(serie3.hashCode(), serie3);
        serieLinkedHashMap.put(serie4.hashCode(), serie4);
        serieLinkedHashMap.put(serie6.hashCode(), serie6);
        boolean existeSerie = false;
        for (Map.Entry<Integer,Serie> Entry: serieLinkedHashMap.entrySet()) {
            Serie serieCompa =(Serie) Entry.getValue();
           if (serieCompa.equals(serie5)) {
             System.out.println("la serie "+serie5.getTitulo()+ "ya existe " );
             existeSerie = true;
           }
        }
        if (existeSerie == false){
          serieLinkedHashMap.put(serie5.hashCode(),serie5);
        }
        for (Map.Entry<Integer,Serie> serieEntry: serieLinkedHashMap.entrySet()) {
            System.out.println(serieEntry.getValue());

        }
        HashMap<Integer, VideoJuego> videoJuegoHashMap = new HashMap<>();

        VideoJuego videoJuego1 = new VideoJuego("Mario ", Genero.ACCION, 4, "Mario BROS");
        VideoJuego videoJuego2 = new VideoJuego();
        VideoJuego videoJuego3 = new VideoJuego("circus", 1);
        VideoJuego videoJuego4 = new VideoJuego();
        VideoJuego videoJuego5 = new VideoJuego("MORTAL COMBAL", Genero.TERROR, 3, "los campeones");
        VideoJuego videoJuego6 = new VideoJuego("circus", 2);

        videoJuegoHashMap.put(videoJuego1.hashCode(), videoJuego1);
        videoJuegoHashMap.put(videoJuego2.hashCode(), videoJuego2);
        videoJuegoHashMap.put(videoJuego3.hashCode(), videoJuego3);
        videoJuegoHashMap.put(videoJuego4.hashCode(), videoJuego4);
        videoJuegoHashMap.put(videoJuego5.hashCode(), videoJuego5);

        boolean existe = false;
        for (Map.Entry<Integer, VideoJuego> integerVideoJuegoHashMap : videoJuegoHashMap.entrySet()) {
            VideoJuego videoJuegoComparaValue = (VideoJuego) integerVideoJuegoHashMap.getValue();
            if (videoJuegoComparaValue.equals(videoJuego6)) {
                existe = true;
                System.out.println("el videojuego " + videoJuego6.getTitulo() + "ya existe");
            }
        }
        if (existe == false) {
            videoJuegoHashMap.put(videoJuego6.hashCode(), videoJuego6);
        }
        for (Map.Entry<Integer,VideoJuego> Entry :videoJuegoHashMap.entrySet()) {
            System.out.println(Entry.getValue());
        }

        TreeMap<Integer,Entretenimiento> entretenimientoTreeMap = new TreeMap<>();
        entretenimientoTreeMap.put(serie1.hashCode(),serie1);
        entretenimientoTreeMap.put(serie2.hashCode(),serie2);
        entretenimientoTreeMap.put(serie3.hashCode(),serie3);
        entretenimientoTreeMap.put(serie4.hashCode(),serie4);
        entretenimientoTreeMap.put(serie5.hashCode(),serie5);
        entretenimientoTreeMap.put(serie6.hashCode(),serie6);
        entretenimientoTreeMap.put(videoJuego1.hashCode(),videoJuego1);
        entretenimientoTreeMap.put(videoJuego2.hashCode(),videoJuego2);
        entretenimientoTreeMap.put(videoJuego4.hashCode(),videoJuego4);
        entretenimientoTreeMap.put(videoJuego5.hashCode(),videoJuego5);
        entretenimientoTreeMap.put(videoJuego6.hashCode(),videoJuego6);

       serie1.entregar();
        serie2.entregar();
        serie6.entregar();
        videoJuego1.entregar();
        videoJuego4.entregar();


        int cuenteEntregadosVideosJuegos = 0;
        int cuentaEntregadosSerie = 0 ;
        for (Map.Entry<Integer,Entretenimiento> entretenimientoEntry : entretenimientoTreeMap.entrySet()) {
             if (entretenimientoEntry.getValue() instanceof  Serie){
                 Serie serieConvierte = (Serie) entretenimientoEntry.getValue();
                 if (serieConvierte.isEntregado() == true){
                   cuentaEntregadosSerie ++;
                   serieConvierte.devolver();
                 }
             }
             if (entretenimientoEntry.getValue() instanceof  VideoJuego){
                 VideoJuego videoJuegoComvierte = (VideoJuego) entretenimientoEntry.getValue();
                 if ( videoJuegoComvierte.isEntregado() == true){
                     cuenteEntregadosVideosJuegos++;
                     videoJuegoComvierte.devolver();
                 }
             }
        }
        int maryorTemporada =0;
        int mayorHoras =0;
        int keySerie = 0;
        int keyVideoJuego =0;
        System.out.println("se entregron de serie  "+ cuentaEntregadosSerie + " se entregaron de VIDEOS JUEGOS "+cuenteEntregadosVideosJuegos );
        for (Map.Entry<Integer,Entretenimiento> integerEntretenimientoEntry: entretenimientoTreeMap.entrySet()) {
            if ( integerEntretenimientoEntry.getValue() instanceof Serie) {
                Serie serieConvierte = (Serie) integerEntretenimientoEntry.getValue();
                if (serieConvierte.getNumeroDetemporada() > maryorTemporada) {
                    maryorTemporada = serieConvierte.getNumeroDetemporada();
                    keySerie = integerEntretenimientoEntry.getKey();
                }
            }
                if(integerEntretenimientoEntry.getValue() instanceof  VideoJuego){
                    VideoJuego videoJuegoconvierte = (VideoJuego) integerEntretenimientoEntry.getValue();
                    if (videoJuegoconvierte.getHorasEstimadas() > mayorHoras){
                      mayorHoras = videoJuegoconvierte.getHorasEstimadas();
                      keyVideoJuego = integerEntretenimientoEntry.getKey();
                    }
                }
            }
        System.out.println(" el video Juego con mayor horas es "+ entretenimientoTreeMap.get(keyVideoJuego).toString()+ "\n la serie con mas numero de temporadas es :"+entretenimientoTreeMap.get(keySerie).toString());

        }
    }


