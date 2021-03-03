package com.company.ejercicio2;

public class Staff extends Persona {
    private double salario;
    private String turno;

    public Staff(int dni, String nombre, String apellido, String email, String direccion, String turno,double salario) {
        super(dni, nombre, apellido, email, direccion);
        this.turno = turno;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double SalarioAnual(){
        double sa= 12 * this.salario;
        return sa;
    }

    @Override
    public double ingresos() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+
                "STAFF {" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
