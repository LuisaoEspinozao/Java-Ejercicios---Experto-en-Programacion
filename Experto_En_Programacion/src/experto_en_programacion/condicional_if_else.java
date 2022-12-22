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
public class condicional_if_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //CONDICIONAL IF - ELSE
        //Clave de Cajero Automatico
        int num2 = 0;
        
        System.out.println("CONDICIONAL IF - ELSE");
        System.out.println("\nIngrese la clave de su tarjeta: ");
        
        num2 = entrada.nextInt();
        
        if(num2 < 2525){
            System.out.println("Contraseña Correcta");
        }
        else{
            System.out.println("Contraseña Erronea, Intente Nuevamente");
        }
    }
    
}
