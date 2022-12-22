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
public class condicionalSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        //CONDICIONAL SWITCH
        
        int num3 = 0;
        System.out.println("\nCONDICIONAL SWITCH");
        System.out.println("Ingrese un numero del 1 al 3: ");
        num3 = entrada.nextInt();
        switch(num3){
            case 1: System.out.println("El numero es igual a 1");
            break;
            
            case 2: System.out.println("El numero es igual a 2");
            break;
            
            case 3: System.out.println("El numero es igual a 3");
            break;
            
            default: System.out.println("Numero distinto");
            break;
        }
    }
    
}
