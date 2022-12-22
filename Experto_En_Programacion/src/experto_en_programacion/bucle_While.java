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
public class bucle_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
   
        //BUCLE WHILE
        System.out.println("Bucle WHILE");
        int num1 = 0;
        
        while(num1 != 2525){
            System.out.println("Ingrese la contraseña de su tarjeta: ");
            num1 = entrada.nextInt();
        }
   
        int nu1 = 1, nu2=0, nu3=0;
        
        
        
        if(((nu1>nu2)&&(nu1>nu3))){
            
        }
        else if(((nu2>nu1)&&(nu2>nu3))){
            
        }
        else{
            System.out.println("El mayor de todos es NU3");
        }
        
        
        
    }
    
}
