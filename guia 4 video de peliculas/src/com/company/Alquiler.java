package com.company;

import java.time.LocalDate;

public class Alquiler {
    public static int i = 1;
    private int id;
    private Cliente cliente;
    private Film film;
    private LocalDate fechaDeRetiro;
    private LocalDate FechaDeDevulucion;

    public Alquiler(){};
    public Alquiler(Cliente cliente,Film film ){
        this.id = i++;
        this.cliente = cliente;
        this.film = film;
        this.fechaDeRetiro = LocalDate.now();
        this.FechaDeDevulucion= this.fechaDeRetiro.plusDays(3);
    }

    @Override
    public String toString() {
        return "\n................Alquiler...................................." +
                "\n id                      :" + id +
                "\n cliente                 :" + cliente +
                "\n film                    :" + film +
                "\n fechaDeRetiro           :" + fechaDeRetiro +
                "\n FechaDeDevulucion       :" + FechaDeDevulucion ;
    }
}
