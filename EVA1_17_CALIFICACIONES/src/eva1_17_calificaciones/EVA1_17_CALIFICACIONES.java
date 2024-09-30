/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_calificaciones;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA1_17_CALIFICACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int CALIFI ;
       Scanner captu=new Scanner(System.in);
       
      System.out.println("CALIFICACIONES");
      CALIFI=captu.nextInt();
      captu.nextLine();
      if((CALIFI>=0)&&(CALIFI<=100)){
        System.out.println("valida");}
       else{System.out.println(" no valida");}   
    
}}
