/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre; 
        String  Genero; // un caracter
        int Duracion; //En segundos
        String Reparto;
        String Clasificacion;
        
        //iniciar captura
        Scanner captu;
        captu = new Scanner(System.in);
        
        //Nombre
        System.out.println("introduce el nombre de la pelicula");
        Nombre = captu.nextLine();
        
        //Genero
        System.out.println("capture  el genero");
        Genero = captu.nextLine();
        
        
        System.out.println("escriba el tiempo de duracion en segundos");
        Duracion =captu.nextInt();
        
        
        System.out.println("ingrese el Reparto de la pelicula");
        Reparto =captu.nextLine();
        captu.nextLine();
                
        System.out.println("introduce la clasificacion de la pelicula");
        Clasificacion =captu.nextLine();
        
        System.out.println("Datos capturados --------------------");
        System.out.println(Nombre);
        //System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(" RECUERDA 1 m = 60s y 1h = 360S");
        System.out.println(Reparto);
        System.out.println(Clasificacion);
    }
    
}
