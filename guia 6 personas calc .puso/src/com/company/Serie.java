package com.company;
// Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
/* Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El
resto de atributos serán valores por defecto según el tipo del atributo.
 Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y creador. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
*/
public class Serie extends Entretenimiento{
    private int numeroDetemporada;
    private String creador;

    public Serie(){
        super();
        this.numeroDetemporada =3;
    }

    public Serie(String titulo, String creador) {
        super();
        super.setTitulo(titulo);
        this.creador = creador;
        this.numeroDetemporada=3;
    }

    public Serie(String titulo, Genero genero, int numeroDetemporada, String creador) {
        super(titulo, genero);
        this.numeroDetemporada = numeroDetemporada;
        this.creador = creador;
    }

    public int getNumeroDetemporada() {
        return numeroDetemporada;
    }

    public void setNumeroDetemporada(int numeroDetemporada) {
        this.numeroDetemporada = numeroDetemporada;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public void entregar() {
        super.entregar();
    }

    @Override
    public void devolver() {
        super.devolver();
    }

    @Override
    public boolean isEntregado() {
        return super.isEntregado();
    }

    @Override
    public boolean comparate(Object object) {
        boolean resul = false;
        if(object instanceof Serie){
            Serie serieObj =(Serie)object;
            if(serieObj.getNumeroDetemporada() == this.numeroDetemporada){
                resul = true;
            }
        }
        return resul;
    }

    @Override
    public String toString() {
        return   ""+super.toString()+
                "\n <<<<<<<<<<<<<<<<<<<<<<<<<<Serie<<<<<<<<<<<<<<<<<<<<<<<<" +
                "\n numeroDetemporada      :" + numeroDetemporada +
                "'\n creador              :" + creador ;
    }
}
