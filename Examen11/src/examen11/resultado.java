/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen11;

/**
 *
 * @author aivan
 */
public class resultado {
    private Hora hora;
    private Fecha fecha;
    public resultado (Hora ho, Fecha fe) {
        this.hora = ho;
        this.fecha = fe;
    }
    public resultado(int s, int m, int h, int d, int mm, int a){
        this.fecha= new Fecha(d, m , a);
        this.hora = new Hora(s, mm, h);
    }
    public void aumentar(){
        this.hora.aumentar();
        if((this.hora.getH() == 0)&&(this.hora.getM()==0)&&(this.hora.getS() == 0)){
            this.fecha.aumentar();
        }
    }
    public String toString(){
        return "fecha es: " + fecha + " , hora es: " + hora; 
    }
    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora ho) {
        this.hora = ho;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fe) {
        this.fecha = fe;
    }   
}
