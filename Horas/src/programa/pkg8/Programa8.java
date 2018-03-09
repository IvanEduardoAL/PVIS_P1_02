/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.pkg8;

/**
 *
 * @author aivan
 */import java.util.Scanner;
import javax.swing.JOptionPane;
        
public class Programa8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("ingresa los dias que trabajo");
         int diaz= teclado.nextInt();
         
         int Ahoras[] = new int[diaz];
         int Amin[] = new int[diaz];
         int Aseg[] = new int[diaz];
        
         for(int i=0;i<diaz;i++){
            System.out.println("Las horas se ingresan en formato 24 horas\nIngresa  la hora  entrada min, seg");
         int horae= teclado. nextInt();
         int mine= teclado.nextInt();
         int sege= teclado.nextInt();
         System.out.println("hora de entada: "+horae+":"+mine+":"+sege);
         System.out.println("Ingresa  la hora   de salida min, seg");
         int horas= teclado. nextInt();
         int mins= teclado.nextInt();
         int segs= teclado.nextInt();
         System.out.println("hora de salida: "+horas+":"+mins+":"+segs);
         if (sege>segs){
         segs+=60;
         mins--;
         }
         if (mine>mins){
        mins+=60;
         horas--;
         }
         int segt=segs-sege;
         int mint=mins-mine;
         
         int horat= horas-horae;
         
         System.out.println("tiempo total:"+horat+":"+mint+":"+segt);
         Ahoras[i] = horat;
         Amin[i]= mint;
         Aseg[i] = segt;
        
        }
        int h = 0, m = 0, s = 0; 
        for(int j=0; j<diaz; j++)
        {
            System.out.println(Ahoras[j] + ":" + Amin[j] + ":" + Aseg[j]);
            h += Ahoras[j];
            m += Amin[j];
            s += Aseg[j];
            if(s>=60){
            s-=60;
            m++;
            }
            if(m>=60){
            m -=60;
            h++;
            }
            if(s<10 && m <10)
            {System.out.println("Horas totales trabajadas: \n" + h + ":0" + m + ":0" + s);}
            else if(m<10)
            {System.out.println("Horas totales trabajadas: \n" + h + ":0" + m + ":" + s);}
            else if(s<10)
            {System.out.println("Horas totales trabajadas: \n" + h + ":" + m + ":0" + s);}
            else{
            System.out.println("Horas totales trabajadas: \n" + h + ":" + m + ":" + s);}
        }
         
          
     
     /**int dias,hentrada, hsalida;
     
     int menu = Integer.parseInt(JOptionPane.showInputDialog("1 Ingresar horas\n 2 Salir")); 
     
     switch(menu){
         case 1:  hentrada = Integer.parseInt(JOptionPane.showInputDialog("Hora de entrada"));
                  hsalida = Integer.parseInt(JOptionPane.showInputDialog("Hora de salida"));
         break;
         
         case 2: JOptionPane.showMessageDialog(null, "adios");
         break;
     }**/
      
    }
    
}
