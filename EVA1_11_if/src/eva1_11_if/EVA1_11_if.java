/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int edad;
        Scanner cap = new Scanner(System.in);
        System.out.println("ingrsa la edad");
        edad = cap.nextInt();
         if (edad >=18)
         
              System.out.println("es adulto");
         else
         
             System.out.println("menor de edad");
        }        
}


    
