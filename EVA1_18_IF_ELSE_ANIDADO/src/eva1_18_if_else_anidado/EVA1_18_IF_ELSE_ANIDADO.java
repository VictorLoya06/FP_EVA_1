/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA1_18_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu=new Scanner(System.in);
        System.out.println(" Numero correpondiente al dia (1a7)");
        dia=captu.nextInt();
        if (dia== 1){
       System.out.println("Lunes");}
        else if (dia== 2){
       System.out.println("Martes");}
         else if (dia== 3){
       System.out.println("Miercoles");}
         else if (dia== 4){
       System.out.println("Jueves");}
         else if (dia== 5){
       System.out.println("Vienes");}
         else if (dia== 6){
       System.out.println("Sabado");}
         else if (dia== 7){
       System.out.println("Domingo");}
         else 
       System.out.println("Numero no valida");}
        
    }
    
