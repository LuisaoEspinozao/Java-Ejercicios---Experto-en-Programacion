/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experto_en_programacion;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bucle_Do_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //BUCLE DO - WHILE
        System.out.println("\nBucle DO - WHILE");
        
        int num4 = 10;
        do{
            System.out.println("Hola");
        }while(num4 < 1);
        
        //1ero ejecuta y luego lee la condición.
        
        int num2 = 0;
        do{
            System.out.println("\nIngrese la contraseña de su tarjeta: ");
            num2 = entrada.nextInt();
        }while(num2 != 2525);
        
        
        
    }
    
}
