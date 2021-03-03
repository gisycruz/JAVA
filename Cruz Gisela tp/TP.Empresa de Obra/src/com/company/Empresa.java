package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombreEmpresa;
    private List<Empleado> empleado;
    private List<Obra> obra;

    //contructor
    public Empresa() {
    }

    ;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleado = new ArrayList<>();
        this.obra = new ArrayList<>();
    }

    //getter y setter
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public List<Empleado> getEmpleados() {
        return empleado;
    }
    public void setEmpleados(List<Empleado> empleados) {
        this.empleado = empleados;
    }
    public List<Obra> getObra() {
        return obra;
    }
    public void setObra(List<Obra> obra) {
        this.obra = obra;
    }
    //funciones

    public void agregarHotel(Hotel hotel) { this.obra.add(hotel); }
    public void agregarObraDomestica(ObraDomestica obraDomestica) { this.obra.add(obraDomestica); }
    public void agrerComercio(Comercio comercio) { this.obra.add(comercio); }


    public void agregarArquitecto(Arquitecto arquitecto) { this.empleado.add(arquitecto); }
    public void agregarObrero(Obrero obreros) { this.empleado.add(obreros); }
    public void agregarMaestro(MaestroObra maestroObra){this.empleado.add(maestroObra);}

    public Obrero buscarObreroEnListaDeEmpleados(int dni){
        Obrero obrero = new Obrero();
        for (Empleado empleado : this.empleado) {
            if (empleado instanceof Obrero) {
                if (empleado.getDni() == dni) {
                    obrero = (Obrero) empleado;
                }
            }
        }
      return obrero;
    }
    public MaestroObra buscarMaestroEnListaEmpleados(int dni){
        MaestroObra maestroObra = new MaestroObra();
        for (Empleado empleado : this.empleado) {
            if (empleado instanceof MaestroObra) {
                if (empleado.getDni() == dni) {
                    maestroObra = (MaestroObra) empleado;
                }
            }
        }
        return maestroObra;
    }
    public Arquitecto buscarArquitecto(int dni){
        Arquitecto arquitecto = new Arquitecto();
        for(Empleado empleado : this.empleado){
            if(empleado instanceof Arquitecto){
                if(empleado.getDni() == dni){
                    arquitecto = (Arquitecto) empleado;
                }
            }
        }
        return arquitecto;
    }
    @Override
    public String toString() {
        return "\n-------------------Empresa -------------------------------------\n" +
                "\nnombreEmpresa   : " + nombreEmpresa +
                "\n empleados      : " + empleado +
                "\n Obra           : " + obra;
    }
}