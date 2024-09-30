/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_usuario;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA1_15_USUARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final String USUARIO = "Adim1";
       final String PASSWORD = "321";
        String U,PWD,Pass;
        Scanner captu=new Scanner(System.in);
       
        System.out.println(" USUARIO");
        U=captu.nextLine();
        System.out.println(" PASSWORD");
        PWD=captu.nextLine();
        
        if(U.equals(USUARIO) && PWD.equals(PASSWORD))
           System.out.println(" ACCESO CONCEDIDO");

        else
        System.out.println(" ACCESO DENEGADO");
        
    }
    
}
