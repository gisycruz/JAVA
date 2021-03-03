package com.company;
/* Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
 Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de
atributos serán valores por defecto según el tipo del atributo.
 Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el titulo y horas estimadas. El resto por defecto.
Un constructor con todos los atributos, excepto de entregado.
*/
public class VideoJuego extends Entretenimiento{
    private int horasEstimadas;
    private String compania;

    public VideoJuego(){
        super();
        this.horasEstimadas =10;
    }

    public VideoJuego(String titulo, int horasEstimadas) {
        super();
        super.setTitulo(titulo);
        this.horasEstimadas = horasEstimadas;
    }

    public VideoJuego(String titulo, Genero genero, int horasEstimadas, String compania) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
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
       boolean resul= false;
       if(object instanceof VideoJuego ){
           VideoJuego videoJuegObj = (VideoJuego)object;
           if(videoJuegObj.getHorasEstimadas() == this.horasEstimadas ){
               resul =true;
           }
       }
       return resul;
    }



    @Override
    public String toString() {
        return ""+super.toString()+
                "\n ***************VideoJuego***********************" +
                "\n horasEstimadas       :" + horasEstimadas +
                "\n compania             :" + compania ;
    }
}
