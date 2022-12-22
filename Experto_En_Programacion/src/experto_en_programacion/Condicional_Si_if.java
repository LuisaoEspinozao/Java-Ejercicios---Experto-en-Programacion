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
public class Condicional_Si_if {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //CONDICIONAL IF
        int num1 = 0;
        System.out.println("CONDICIONAL IF");
        System.out.println("Ingrese su clave: ");
        num1 = entrada.nextInt();
        
        if(num1 == 2525){
            System.out.println("Clave Correcta");
        }
    }
    
}
