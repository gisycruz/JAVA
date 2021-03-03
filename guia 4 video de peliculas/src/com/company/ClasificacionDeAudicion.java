package com.company;

public enum ClasificacionDeAudicion {
    G​     ("Apta para todos los públicos"),
    PG​    ("Sugiere la compañía de un adulto para los menores de 10 años"),
    PG_13  ("Sugiere la compañía de un adulto para los menores de 13 años"),
    R​     ("Restringido a menores de 17 años si no es con la compañía de un adulto"),
     NC_17​("Contenido sólo para mayores de 18 años) ● UNRATED​ (Películas que no han pasado el proceso de calificación");
    private String descripcion;

    ClasificacionDeAudicion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
