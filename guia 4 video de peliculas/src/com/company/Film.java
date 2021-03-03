package com.company;

import java.time.LocalDate;

/* géneros. Acción, Aventura, Comedia, Drama, Horror y Documental. Cada film de su inventario cuenta con un título,
 una fecha de lanzamiento,
una duración en minutos, una clasificación de audiencia, las siglas del país de origen y una descripción de la misma.
 El video store de Roberto, ofrece la posibilidad de alquilar los títulos físicamente, esto significa que
 hay un límite fijo de copias de cada título*/
public class Film {
    private String titulo;
    private Genero genero;
    private LocalDate fechaDeLanzamiento;
    private int duracion;
    private ClasificacionDeAudicion clasificacionDeAudicion ;
    private SiglaDelPais siglaDelPais;
    private int stock;
    public Film(String titulo,Genero genero,LocalDate fechaDeLanzamiento,int duracion,ClasificacionDeAudicion clasificacionDeAudicion ,SiglaDelPais siglaDelPais,int stock){
        this.titulo = titulo;
        this.duracion = duracion;
        this.clasificacionDeAudicion = clasificacionDeAudicion;
        this.genero = genero;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.siglaDelPais = siglaDelPais;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\n_____________Film______________________________________________" +
                "\n titulo                   :" + titulo +
                "\n genero                   :" + genero +
                "\n fechaDeLanzamiento       :" + fechaDeLanzamiento +
                "\n duracion                 :" + duracion +
                "\n clasificacionDeAudicion  :" + clasificacionDeAudicion.getDescripcion()+
                "\n siglaDelPais             :" + siglaDelPais.getPais()+
                "\n stock                    :" + stock ;
    }
}
