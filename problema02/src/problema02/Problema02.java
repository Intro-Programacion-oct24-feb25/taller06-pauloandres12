/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        double vehiculo;
        double valor;
        double peaje;
        peaje = 0;
        String tipo;
        String tipoV;
        tipoV = "vehiculo liviano particular";
        
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el costo del vehiculo");
        vehiculo = entrada.nextDouble();
        System.out.println("Ingrese el tipo de vehiculo:\n"
                + "1: Para vehiculo liviano particular\n"
                + "2: Para vehiculo grande particular\n"
                + "3: Para taxis\n"
                + "4: Para buses urbanos\n");
        entrada.nextLine();
        tipo = entrada.nextLine();
        
        switch(tipo){
            case "1":
                peaje = vehiculo * 0.0001 + 2;
                tipoV = "vehiculo liviano particular";
            break;
            case "2":
                peaje = vehiculo * 0.0002 + 2.5;
                tipoV = "vehiculo grande particular";
            break;
            case "3":
                peaje = vehiculo * 0.0004 + 1.5;
                tipoV = "taxi";
            break;
            case "4":
                peaje = vehiculo * 0.0005 + 2.2;
                tipoV = "bus urbano";
            break;
                
                
        } 
        System.out.printf("Peaje Buena via\n\t"
                + "Propietario: %s\n"
                + "Tipo: %s\n\t"
                + "Valor: $%.2f\n\t"
                + "Peaje: $%.2f\n",
                nombre,
                tipoV,
                vehiculo,
                peaje);
    }
    
}
