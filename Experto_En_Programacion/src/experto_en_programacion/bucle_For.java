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
public class bucle_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //BUCLE FOR
        int num3 = 0, multiplicacion = 2, valorMultiplicacion = 0;
        
        for(int i = 0; i<10; i++){
            
            valorMultiplicacion = i * multiplicacion;
            System.out.println(i + "*"+ multiplicacion + "=" 
                    + valorMultiplicacion);
        }
    }
    
}
