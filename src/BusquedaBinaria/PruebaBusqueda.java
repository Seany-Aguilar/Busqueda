package BusquedaBinaria;

import java.util.Scanner;

/* @author Betterlee
 */
public class PruebaBusqueda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int enteroABuscar; 
        int posicion; 

        BusquedaBinaria bb = new BusquedaBinaria(15);
        System.out.println(bb);
        System.out.print("Escriba un valor entero (-1 para salir): ");
        enteroABuscar = entrada.nextInt(); 
        System.out.println();

        while (enteroABuscar != -1) {

            posicion = bb.busquedaBinaria(enteroABuscar);
            if (posicion == -1) {
                System.out.println("El entero " + enteroABuscar
                        + " no se encontro.\n");
            } else {
                System.out.println("El entero " + enteroABuscar
                        + " se encontro en la posicion " + posicion + ".\n");

                System.out.print("Escriba un valor entero (-1 para salir): ");
                enteroABuscar = entrada.nextInt(); 
                System.out.println();

            }
        }
    }
}
