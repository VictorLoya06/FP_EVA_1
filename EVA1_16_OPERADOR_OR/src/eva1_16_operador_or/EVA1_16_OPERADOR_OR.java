/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int MESES,KILOMETROS ;
       Scanner captu=new Scanner(System.in);
       
      System.out.println("kilometraje");
      KILOMETROS=captu.nextInt();
      captu.nextLine();
      System.out.println("meses con el vehiculo");
      MESES=captu.nextInt();
      captu.nextLine();
     if((MESES>=6 )||(KILOMETROS>=5000)){
        System.out.println("cambio de aceite necesario"); 
     }    else   { System.out.println("en buen estado"); 
     }
    }}
    

