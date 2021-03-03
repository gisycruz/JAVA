package com.company;

public class Bateria extends Instrumento {
    public static final double PRECIOTAMBOR = 3000;
    public static final double PRECIOPLATILLO=2000;
    private int tambores;//minimo3
    private int platillos;//minimo1 hasta 5

    public Bateria(){};
    public Bateria(String marca,double precio,int tambores,int platillos){
        super(marca);
        this.platillos =this.validatePlatillos(platillos);
        this.tambores=this.validateTambores(tambores);
        super.setPrecio(this.precioBateria(precio));
    }

    public void setPlatillos(int platillos) {
        this.platillos = platillos ;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores ;
    }

    public int getPlatillos() {
        return platillos;
    }

    public int getTambores() {
        return tambores;
    }

    private Integer validatePlatillos(Integer cantidadPlatillos) {
        if (cantidadPlatillos > 5 || cantidadPlatillos < 1) {
            System.out.println("Cantidad de platillos no valida");
            cantidadPlatillos = 0;
        }
        return cantidadPlatillos;
    }

    private Integer validateTambores(Integer cantidadTambores) {
        if (cantidadTambores < 3) {
            System.out.println("Cantidad de tambores no valida.");
            cantidadTambores = 3;
        }
        return cantidadTambores;
    }

    public double precioBateria(double precio) {
        double precioPlatillo= this.platillos * PRECIOPLATILLO ;
        double precioTambore=this.tambores * PRECIOTAMBOR;
        double precioBateria= precioPlatillo + precioTambore + precio;
        return precioBateria;
    }

    @Override
    public double precioAumentado() {
        double precio = super.getPrecio() * 0.15 + super.getPrecio();
        return precio;
    }

    @Override
    public String toString() {
        return   "\n"+ super.toString()+
                " \n         Bateria                      " +
                "\n tambores         : " + tambores +
                "\n platillos      : " + platillos ;

    }
}
