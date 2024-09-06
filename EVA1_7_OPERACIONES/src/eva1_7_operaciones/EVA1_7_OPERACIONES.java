/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPRRACIONES ARITMETICAS
        int x = 10;//declaracion y asignacion
        int y = 5;
        //declaracion de multiples variables del mismo tipo
        int suma,resta,divi,multi,pot,raiz;
        
        suma = x + y; //operador de suma +
        System.out.println("suma de x + y :");
        System.out.println(suma);
        
        resta = x - y; // operador de difereciar -
        System.out.println("resta de x - y:");
        System.out.println(resta);
        
        multi = x * y; //operador de multiplicacion *
        System.out.println("multiplicacion de x * y");   
        System.out.println(multi);
        
        divi = x/y;
        System.out.println("division de x * y");   
        System.out.println(divi);
        
        //cambio de valores
        x = 11;
        y = 3;
        System.out.println("division de x(11) * y(3)");   
        System.out.println(divi); 
        
        double val =11;
        double va2 =3;
        double divid;
        divid= val / va2;
        System.out.println("division entre decimales");   
        System.out.println(divid);
        
                
    }
    
}
