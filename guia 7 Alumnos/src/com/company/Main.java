package com.company;

public class Main {

    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("gisela",Nacionalidad.ARGENTINO);
        Alumno alumno2 = new Alumno("damian ",Nacionalidad.BRASILERO);
        Alumno alumno3 = new Alumno("german",Nacionalidad.BRASILERO);
        Alumno alumno4 = new Alumno("brenda",Nacionalidad.ARGENTINO);
        Alumno alumno5 = new Alumno("yamila",Nacionalidad.CHILENO);
        Alumno alumno6 = new Alumno("hernan",Nacionalidad.JAPONES);
        Alumno alumno7 = new Alumno("",Nacionalidad.ESTADOUNIDENSE);
        Alumno alumno8 = new Alumno("brenda",Nacionalidad.BRASILERO);
        Colegio colegio = new Colegio();
        colegio.agregarAlunmo(alumno1);
        colegio.agregarAlunmo(alumno2);
        colegio.agregarAlunmo(alumno3);
        colegio.agregarAlunmo(alumno4);
        colegio.agregarAlunmo(alumno5);
        colegio.agregarAlunmo(alumno6);
        colegio.agregarAlunmo(alumno7);
        colegio.agregarAlunmo(alumno8);
        colegio.verNacionalidad(Nacionalidad.ARGENTINO.toString());
        colegio.borrarAlumno(alumno4);
        colegio.cuantasNacioladidadFiferentes();
        colegio.verTodo();
    }
}
