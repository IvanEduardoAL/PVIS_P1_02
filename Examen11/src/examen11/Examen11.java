/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen11;

import java.util.Scanner;

/**
 *
 * @author aivan
 */
public class Examen11 {

  
    public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
        
        
    System.out.println("Ingrese el segundo: ");
        Integer s = teclado.nextInt();
    System.out.println("Ingrese el minuto: ");
        Integer m = teclado.nextInt();
   System.out.println("Ingrese la hora: ");
        Integer h = teclado.nextInt();
     Hora ho = new Hora(s, m, h);
     
    System.out.println("Ingrese el dia: ");
        Integer d = teclado.nextInt();
    System.out.println("Ingrese el mes: ");
        Integer ms = teclado.nextInt();
   System.out.println("Ingrese el año: ");
        Integer a = teclado.nextInt();
    Fecha fe = new Fecha(d, ms, a);
       resultado r = new resultado(ho, fe);
        while(true){    
        r.aumentar();
            System.out.println(r);
        }
    }
}
