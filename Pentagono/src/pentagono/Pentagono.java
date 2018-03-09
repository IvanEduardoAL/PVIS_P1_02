/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagono;

import java.util.ArrayList;

/**
 *
 * @author aivan
 */
public class Pentagono {
   private ArrayList<Puntos> puntos;
    public Pentagono(Integer dimesion, Integer di) {
        makePentagono(0, 0, di, 0);
    }
    public Pentagono(Integer x, Integer y, Integer di) {
        makePentagono(x, y, di, 0);
    }
    public Pentagono(Integer x, Integer y, Integer di, Integer g) {
        makePentagono(x, y, di, g);
    }
    private void makePentagono(Integer x, Integer y, Integer di, Integer g) {
        Integer gradoi = g;
        ArrayList<Puntos> punto = new ArrayList<Puntos>();
        for (int i = 0; i < 5; i++) {
    Integer  Y = Math.sin(tuRadianes(gradoi)) * di;
    IntegerX = Math.cos(tuRadianes(gradoi)) * di;
  Puntos p = new Puntos(X.intValue(), Y.intValue());
    gradoi += 72;
            punto.add(p);
        }
    }

    public void puntos() {
   ArrayList <Puntos> puntos = new ArrayList <Puntos>();
      puntos = new ArrayList<Puntos>();
   puntos.add(new Puntos(1, 1));
    Puntos p = new Puntos(5, 5);
     puntos.add(p);
     Puntos k = new Puntos(0,0);
        k.getx();
      k.setx(0);
    }
    public void tuRadianes(Integer g){
        Integer gradoi=g;
    }
    public static void main(String[]args){
        Pentagono p = new Pentagono (3,5,6,4);
        System.out.println(p.puntos);
    }
}

