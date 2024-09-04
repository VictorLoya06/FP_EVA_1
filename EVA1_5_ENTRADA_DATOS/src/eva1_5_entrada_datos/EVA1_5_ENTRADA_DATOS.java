/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAMOS VARIABLES
         String marca;
        String modelo;
        int year;
        double precio;
        //¿como se captura?
        //SCANNER
        //Herramienta --> Clase: nos proporcionan muchas herremientas
        Scanner captu;//declaramos la herramienta,previamente
        //hay que importala (hacer un impor)
        captu = new Scanner(System.in);//creamos la herramienta
        
        //Hat que indicarle al usuario que capturar
        System.out.println("introduce la marca del vehiculo");
        //capturamos -->una asignacion
        marca = captu.nextLine();// les regresa todo el texto hasta cuando
                                 //se presion la tecla "enter" 
         System.out.println("introduce el modelo");
        modelo = captu.nextLine();
        System.out.println("introduce el año");
        year =captu.nextInt();
        System.out.println("introduce el precio");
        precio =captu.nextDouble();
        
        System.out.println("Datos capturados --------------------");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
        
        
                
    }
    
}
