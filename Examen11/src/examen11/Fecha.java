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
public class Fecha {
    private Integer d;
    private Integer m;
    private Integer a;

    public Fecha(Integer d, Integer m, Integer a) {
      this.d = d;
      this.m= m;
     this.a = a;
    }
    private Integer diaM(){
       switch(this.m){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               return 31;
           case 4:
           case 6:
           case 9:
           case 11:
               return 30;
           case 2:
               if(this.a % 4 == 0){
                 return 29;
               }else{
                return 28;
               }
           default: return 0;
       }
    }
    public void aumentar(){
     this.d++;
     if(this.d > this.diaM()){
   this.d = 1;
     this.m++;
    if(this.m > 12){
   this.m = 1;
     this.a++;
    }}
    }
    public String toString(){
     return " Hora es: " + d + " : " + m+ " : " + a;
    }
    public Integer getDia() {
     return d;
    }}