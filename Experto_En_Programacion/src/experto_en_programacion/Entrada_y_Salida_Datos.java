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
public class Entrada_y_Salida_Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ENTRADA DE DATOS
        
        Scanner entrada = new Scanner(System.in);
        
        int num1 = 0;
        
        System.out.println("Ingrese un numero: ");
        num1 = entrada.nextInt();
               
        
        System.out.println("Su numero ingresado es el: "+ num1);
        
    }
    
}
