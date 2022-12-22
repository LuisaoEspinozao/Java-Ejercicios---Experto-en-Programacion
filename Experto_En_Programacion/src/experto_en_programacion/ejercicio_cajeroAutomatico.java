/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experto_en_programacion;

import java.util.Scanner;


public class ejercicio_cajeroAutomatico {

    
    public static void main(String[] args) { 
        Scanner entrada = new Scanner(System.in);
        int clave, opcion, valorDisponible = 0;

        if(ingresoClave(entrada) == 12345){
            System.out.println("Bienvenido Estimado");
            opcion = transacciones(entrada);
            valorDisponible = operaciones(opcion, entrada, valorDisponible);
        }
        else{
            System.out.println("Datos Erroneos");
        }
    }
    
    public static int transacciones(Scanner entrada){
        int opcion;
        
        do{
        
        System.out.println("1. Saldo de Cuenta");
        System.out.println("2. Depositar");
        System.out.println("3. Retirar");
        System.out.println("4. Cancelar");
    
        System.out.println("Ingrese una opcion: ");
        opcion = entrada.nextInt();
        
        }while(((opcion<1)&&(opcion>4)));
        
        return opcion;
    }
    
    public static int ingresoClave(Scanner entrada){
        int clave;
        System.out.println("Ingrese Bienvenido al Banco Pepito");
        System.out.println("Ingrese su clave: ");
        clave = entrada.nextInt();
        
        return clave;
    }
    
    public static int operaciones(int opcion, Scanner entrada, int valorDisponible){
        int opcion2 = 0;
        switch(opcion){
            
            case 1: 
                System.out.println("El saldo actual de su cuenta es $"+valorDisponible);
                System.out.println("Desea realizar otra operacion? 1. SI - 2.NO");
                opcion2 = entrada.nextInt();
                if(opcion2 == 1 ){
                    opcion = transacciones(entrada);
                    operaciones(opcion, entrada, valorDisponible);
                }
                else{
                    System.out.println("Gracias por preferirnos");
                }
                break;
                
            case 2: 
                valorDisponible =  deposito(entrada, valorDisponible);
                
                System.out.println("Desea realizar otra operacion? 1. SI - 2.NO");
                opcion2 = entrada.nextInt();
                if(opcion2 == 1){
                    opcion = transacciones(entrada);
                    operaciones(opcion, entrada, valorDisponible);
                }
                else{
                    System.out.println("Gracias por preferirnos");
                }
                break;
            case 3: 
                valorDisponible = retiro(entrada, valorDisponible);

                System.out.println("Desea realizar otra operacion? 1. SI - 2.NO");
                opcion2 = entrada.nextInt();
                if(opcion2 == 1){
                    opcion = transacciones(entrada);
                    operaciones(opcion, entrada, valorDisponible);
                }
                else{
                    System.out.println("Gracias por preferirnos");
                }
                break;
        }
        return valorDisponible;
    }
    
    public static int deposito(Scanner entrada, int valorDisponible){
        int valorDepositar, opcion;
        
        do{
        System.out.println("Ingrese su valor a depositar: ");
        valorDepositar = entrada.nextInt();
        
        valorDisponible += valorDepositar;
        System.out.println("Deposito realizado Correctamente");
        System.out.println("El saldo actual es de $"+valorDisponible);
        System.out.println("Desea realizar otro deposito? 1. SI - 2. NO");
        opcion = entrada.nextInt();
        }while(opcion == 1);
        return valorDisponible;
    }
    
    public static int retiro(Scanner entrada, int valorDisponible){
        int valorRetirar=0, opcion = 0;
        do{
        System.out.println("Ingrese el valor a retirar: ");
        valorRetirar = entrada.nextInt();
        valorDisponible -= valorRetirar;
        
            System.out.println("Desea realizar otro retiro? 1. SI - 2.NO");
            opcion = entrada.nextInt();
        }while(opcion ==1);
        return valorDisponible;
        }
}
