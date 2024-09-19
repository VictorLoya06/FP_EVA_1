/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_aguila_sol;

/**
 *
 * @author noziv
 */
public class EVA1_13_AGUILA_SOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALEATORIO
        //GENERAR NÚMEROS ALEATORIAS
        double valor = Math.random();
        //random genera valores >= 0 y < a1
        //entre 0 y .99999999999
        if (valor < 0.5)
        {System.out.println("AGUILA");}
        else
        {System.out.println("SOL");}       
    }
    
}
