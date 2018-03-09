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

public class Hora {
    private Integer s;
    private Integer m;
    private Integer h;
    public Hora(Integer s, Integer m, Integer h){
     this.s = s;
        this.m = m;
        this.h = h;
    }
    public void aumentar(){
      s = s + 1;
      if (s > 59){
      s = 0;
      m = m + 1;
      if(m > 59){
      m = 0;
       h= h + 1;
      if(h > 23){
      h = 0;
     }
     } }}
    public String toString(){
        return "La hora es: " + h + " : " + m + " : " + s;
    }
    public Integer getS() {
        return s;
    }
    public void setS(Integer se) {
        this.s = se;
    }
    public Integer getM() {
        return m;
    }
    public void setM(Integer mi) {
        this.m = mi;
    }
    public Integer getH() {
        return h;
    }
    public void setH(Integer ho) {
        this.h = ho;
    }
    
}
