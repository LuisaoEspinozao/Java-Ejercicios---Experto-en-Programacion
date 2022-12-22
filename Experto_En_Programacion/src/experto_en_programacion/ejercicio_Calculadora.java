/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experto_en_programacion;

import java.util.Scanner;

public class ejercicio_Calculadora {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("Ingrese 1er Valor: ");
        num1 = entrada.nextInt();
        
        System.out.println("Ingrese 2do Valor: ");
        num2 = entrada.nextInt();
        
        consultaDeSeguir(entrada, num1, num2);
        
    }
    
    public static void consultaDeSeguir(Scanner entrada, int a, int b){
        int opcion2=1, opcionRetorno;
        
        while(opcion2==1){
        opcionRetorno = menuPrincipal(entrada);
        OperacionesDeOpciones(opcionRetorno, a, b);
            System.out.println("Desea realizar alguna otra operacion?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            opcion2 = entrada.nextInt();
        };
    }
    
    public static int menuPrincipal(Scanner entrada){
        int opcion;
        
        do{
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Todas");
        System.out.println("6. Salir");
        
            System.out.println("Que operacion desea realizar?");
            opcion = entrada.nextInt();
        }while(((opcion<1)&&(opcion>5)));
        
        return opcion;
    }
    
    public static void OperacionesDeOpciones(int opcion, int a, int b){
        switch(opcion){
            case 1:
                suma(a, b);
                break;
            
            case 2: 
                resta(a, b);
                break;
            
            case 3: 
                multiplicacion(a, b);
                break;
                
            case 4: 
                division(a, b);
                break;
               
            case 5: 
                todasOperaciones(a, b);
                break;
        }
    }
    
    public static void suma(int a, int b){
        int suma;
        
        suma = a + b;
        System.out.println("La suma entre: "+a +" y "+ b + " es " +suma);
    }
    
    public static void resta(int a, int b){
        int resta;
        resta = a - b;
        System.out.println("La resta entre: "+ a + " y "+ b + " es " + resta);
    }
    
    public static void multiplicacion(int a, int b){
        int multiplicacion;
        multiplicacion = a * b;
        System.out.println("La multiplicacion es: "+ a + " y "+ b + " es " +multiplicacion);
    }
    
    public static void division(int a, int b){
        float division;
        
        division = a / b;
        System.out.println("La division es: "+ a + " y "+ b + " es " +division);
    }
    
    public static void todasOperaciones(int a, int b){
        int suma, resta, multiplicacion;
        float division;
        suma = a + b;
        System.out.println("La suma es: "+ a + " y "+ b + " es " +suma);
        
        resta = a - b;
        System.out.println("La resta es: "+ a + " y "+ b + " es " +resta);
        
        multiplicacion = a * b;
        System.out.println("La multiplicacion es: "+ a + " y "+ b + " es " +multiplicacion);
        
        division = a / b;
        System.out.println("La division es: "+ a + " y "+ b + " es " + division);
    }
}
