/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_10_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DISTANCIA
        double Vo,T,A,D;
       
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Velocidad inicial");
        Vo= captu.nextDouble();
        //System.out.println("Velocidad final");
        //Vf= captu.nextDouble();
        System.out.println("Segundos");
        T= captu.nextDouble();
         System.out.println("Aceleracion");
        A= captu.nextDouble();
        
        D = Vo * T + (A * T * T)/ 2;
        System.out.println("Resultado");
        System.out.println("distancia" + D + "m/s");
    }
    
}
