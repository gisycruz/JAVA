package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Colegio {
    private ArrayList<Alumno> alumnos ;
    private HashSet<String> nacionalidads = new HashSet<String>();
    public Colegio(){
        alumnos = new ArrayList<>();
    };

    public void agregarAlunmo(Alumno alumno){
        try {
            if (alumno.getNombre().isEmpty() || alumno.getNacionalidad().toString().isEmpty()) {
                throw new IllegalArgumentException("el alumno no tiene cargado datos ");
            }else{
                alumnos.add(alumno);
                nacionalidads.add(alumno.getNacionalidad().toString());
            }
        }catch (IllegalArgumentException e){
            e.getMessage();
        }
    }

    public void verNacionalidad(String nacionalidad) {
        int contador = 0;
        for (Alumno a : alumnos) {
           if(a.getNacionalidad().toString().equals(nacionalidad)){
               contador++;
           }
        }
        System.out.println("\n la nacionalidad "+nacionalidad+"la tiene "+contador+"de alumnos");
    }
    public void cuantasNacioladidadFiferentes(){
       System.out.println("\n hay "+nacionalidads.size()+ "en el colegio ");
    }
    public void borrarAlumno(Alumno alumno){
        boolean isAlumno= false;
        try {
            for (Alumno alumno1 : alumnos) {
                if (alumno1.getNombre().equals(alumno.getNombre()) && alumno1.getNacionalidad().toString().equals(alumno.getNacionalidad().toString())) {
                    isAlumno = true;
                }
            }
                if(isAlumno){
                    alumnos.remove(alumno);
                    System.out.println("el alumno fue elinminado ");
                }else{
                    throw new IllegalArgumentException();
                }
        }catch (IllegalArgumentException e){
            e.getStackTrace();
        }
    }
    public void verTodo(){
        for (String n: nacionalidads){
            this.verNacionalidad(n);
        }
    }
}
