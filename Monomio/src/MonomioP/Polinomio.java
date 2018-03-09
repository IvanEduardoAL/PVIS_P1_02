/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonomioP;

import java.util.ArrayList;

/**
 *
 * @author aivan
 */
 public class Polinomio {
 ArrayList<Monomio> elemento;
    private Object m;
  public Polinomio(){
     elemento= new ArrayList<Monomio>();
}
  public void add (Monomio m){
      this. elemento.add(m);
  }
     public String toString(){
      String acumulador= " "; 
     
       for (int i=0;i<this.elemento.size();i++){
        Monomio m = this.elemento.get(i);
        acumulador= acumulador +m.toString();
       }
     return acumulador;   
    
}  
    
   public ArrayList<Monomio> simplificar(){
       ArrayList<Monomio> temporal =new ArrayList<Monomio>();
        while (this.elemento.size()!=0 ){
           Monomio actual =this.elemento.remove(0);
           int i=0;
           while(i<this.elemento.size()){
               Monomio comparar= this.elemento.get(i);
               if (actual.getexp().compareTo(comparar.getexp())==0){
                     Integer n =(actual.getcoe()+comparar.getcoe());
                     actual.setcoe(n);
                   this.elemento.remove(i);
               }
               else{
                  i++;
               }
               temporal.add(actual);
               
                   
                   
             
           }
      
       }
    elemento= temporal;
     return elemento;
     
      
   }
   /**public  Polinomio agregar(Monomio m){
        this.elemeto.add (m);=this agregar (m);
     
   }
   
    
 
      /**for(int i= 0;i<this.elemento.size();i++){
          Monomio m = this.elemento.get(i);
        for (int j=i+1;j<this.elemento.size();j++){
            Monomio comp= this.elemento.get(j);
            if(m.getexp().compareTo(comp.getcoe())== 0){
                
                
   
        }
        }
         }*/
   
}
