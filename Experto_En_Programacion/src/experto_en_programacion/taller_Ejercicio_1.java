/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experto_en_programacion;

/**
 *
 * @author User
 */
public class taller_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 4, num2 = 2, num3 = 3;
        
        if(((num1 > num2) && (num1 > num3))){
            System.out.println("N1 mayor que los demas");
        }
        else if(((num2 > num1) &&(num2 > num3))){
            System.out.println("N2 mayor que los demas");
        }
        else{
            System.out.println("N3 mayor que todos");
        }
    }
    
}
