/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String empleado;
        empleado = "1";
        double sueldo;
        sueldo = 0;
        double incremento;
        incremento = 0;
        double nuevoSueldo;
        
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        System.out.println("Ingrese que tipo de empleado es: "
                + "1, 2, 3, 4 o 5");
        empleado = entrada.nextLine();
        System.out.println("Ingrese su sueldo inicial");
        sueldo = entrada.nextDouble();
        
        switch(empleado){
            case "1":
                incremento = sueldo * 0.05; 
            break;
            case "2":
                incremento = sueldo * 0.07; 
            break;
            case "3":
                incremento = sueldo * 0.09; 
            break;
            case "4":
                incremento = sueldo * 0.12; 
            break;
            case "5":
                incremento = sueldo * 0.15; 
            break;
        }
        nuevoSueldo = sueldo + incremento;
        System.out.printf("Nombre: %s\n"
                + "Sueldo inicial: %.2f\n"
                + "Incremento de sueldo: %.2f\n"
                + "Nuevo sueldo: %.2f\n",
                nombre,
                sueldo,
                incremento,
                nuevoSueldo);
        
    }
    
}
