/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema001;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Problema001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    double num1;
    double num2;
    double resultado;
    resultado = 0;
    String operacion;
    
    System.out.println("Ingrese el primer valor");
    num1 = entrada.nextDouble();
    System.out.println("Ingrese el segundo valor");
    num2 = entrada.nextDouble();
    System.out.println("Ingrese la operacion a realizar");
    entrada.nextLine();
    operacion = entrada.nextLine();
    
    if (num1 > num2){
        switch(operacion){
            case "suma":
                resultado = num1 + num2;
            break;
            case "resta":
                resultado = num1 - num2;
            break;
            case "multiplicacion":
                resultado = num1 * num2;
            break;
            case "division":
                resultado = num1 / num2;
            break;
            case "modulo":
                resultado = num1 % num2;
            break;
            case "potencia":
                resultado = Math.pow(num1, num2);
            break;  
        }
        System.out.printf("El resultado es: %.2f\n",resultado); 
    }else{            
        System.out.println("Los valores ingresados son incorrectos\n");  
    }
        
    }
    
}
