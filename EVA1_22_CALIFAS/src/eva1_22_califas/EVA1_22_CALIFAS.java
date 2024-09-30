/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_califas;

import java.util.Scanner;

/**
 *
 * @author noziv
 */
public class EVA1_22_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int CAL;
        Scanner captu=new Scanner(System.in);
        System.out.println(" Calificacion correpondiente (0 a 100)");
        CAL=captu.nextInt();
         if ((CAL>=96)&&(CAL<=100)){
       System.out.println("A+");}
        else if ((CAL>=91)&&(CAL<=95)){
       System.out.println("A-");}
         else if ((CAL>=87)&&(CAL<=90)){
       System.out.println("B+");}
         else if ((CAL>=80)&&(CAL<=86)){
       System.out.println("B-");}
         else if ((CAL>=75)&&(CAL<=79)){
       System.out.println("C+");}
         else if ((CAL>=70)&&(CAL<=74)){
       System.out.println("C-");}
         else if ((CAL>=60)&&(CAL<=69)){
       System.out.println("D+");}
        else if ((CAL>=50)&&(CAL<=59)){
       System.out.println("D-");}
         else if ((CAL>=0)&&(CAL<=49)){
       System.out.println("F");}
         else 
       System.out.println("Numero no valida");}
    }
    

