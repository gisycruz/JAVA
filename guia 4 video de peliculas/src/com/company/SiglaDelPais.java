package com.company;

public enum SiglaDelPais {

    ARG ("Argentina"),
    EUN ("Estados Unidos"),
    BRA ("Brasil"),
    ESP ("Espanola");

    private String pais;

    SiglaDelPais(String pais){
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
}
