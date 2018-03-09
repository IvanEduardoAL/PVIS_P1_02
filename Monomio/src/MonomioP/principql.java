/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonomioP;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author aivan
 */
public class principql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Polinomio p= new Polinomio();   
       Monomio mono =new Monomio (3,2);
       p.add(mono);
       p.add (new Monomio (8,5));
       p.add (new Monomio (6,4));
       p.add (new Monomio (1,3));
       p.add (new Monomio (5,3));
        System.out.println(p);
        System.out.println();
     
        
    }
    
}
