/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double Far, Cent,Fa,Ce,Ca,Cen;
    Scanner captu = new Scanner(System.in);
    
    System.out.println("Temperatura en grados F");
    Far = captu.nextDouble();
    Cent=(Far - 32)/1.8;
    System.out.println("c="+ Cent);
    
    System.out.println("Temperatura en grados c");
    Fa = captu.nextDouble();

    Ce= Fa*1.8+32;
    System.out.println("Fº="+ Fa);
    
    // Faltan calvin
    System.out.println("Temperatura en grados c");
    Ce = captu.nextDouble();
    Ca= 273.15 + Ce;
    System.out.println("Kelº="+ Ca);
    }
    
}
