/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonomioP;

/**
 *
 * @author aivan
 */
public class Monomio {
  private  Integer  coeficiente;
  private Integer exponente;
   
 
   public Monomio (Integer c, Integer e){
       this.coeficiente= c;
       this. exponente= e;
       
   }
   
      public void setcoe (Integer c){
          this.coeficiente =c;
          }
      public void setexp (Integer e){
           this. exponente= e;
 
      }
      public  Integer getcoe(){
          return coeficiente;
      }
      public  Integer getexp(){
          return exponente;
      }
  
      public String toString(){
          if (coeficiente>0){
              return String.format(+coeficiente+"x"+"^"+exponente+"  ");
          }     else{
              return String.format(+coeficiente+"x"+"^"+exponente+"  ");
         }
      
      }
}       
  
      
      
   

    
    
    

