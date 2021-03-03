package com.company;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    List<Film> Film;
    List<Cliente> clientes;
    List<Alquiler> alquilers;

    public VideoStore() {
    }

    ;

    public VideoStore(List<Film> film, List<Cliente> clientes) {
        this.Film = film;
        this.clientes = clientes;
        this.alquilers = new ArrayList<>();
    }

    public Cliente buscarClienteENlistaDeCliente(String nombre) {
        for (Cliente cliente : this.clientes) {
            if (cliente != null && cliente.getNombre().equalsIgnoreCase(nombre)) {
                return cliente;
            }
        }
        return null;
    }
    public Film buscaEnLaListaUnFilm(String titulo){
        for(Film film : this.Film){
            if(film != null && film.getTitulo().equalsIgnoreCase(titulo)){
                return film;
            }
        }
        return null;
    }
    public void consutaDeAlquileresViGentes(){
        for(Alquiler alquiler : this.alquilers){
            if (alquiler != null)
            System.out.println(alquiler);
        }
    }
}

