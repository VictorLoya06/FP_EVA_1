/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char Tipo;
        String F,M;
        Scanner captu=new Scanner(System.in);
         
        System.out.println(" CAPTURA TIPO DE PERSONA F:fisica y M:moral");
        Tipo=captu.nextLine().charAt(0);
    
        if(Tipo=='F') {
            System.out.println("Persona Fisica");} 
        else {
    System.out.println("Persona Moral");
    
         } 
        
    }
    
}
