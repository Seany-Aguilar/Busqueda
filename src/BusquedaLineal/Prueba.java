
package BusquedaLineal;

import java.util.Scanner;

/* @author betterlee
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int enteroB;
        int posicion;
        
        ArregloLineal arregloBusqueda = new ArregloLineal(10);
        System.out.println(arregloBusqueda);
        System.out.println("Ingresa un valor entero: ");
        enteroB = entrada.nextInt();
        
        while (enteroB != -1){
           posicion = arregloBusqueda.busquedaLineal( enteroB ); 
           if ( posicion == -1 ){
              System.out.println( "El entero " + enteroB +
                 " no se encontro.\n" ); 
           }else{
               System.out.println( "El entero " + enteroB +
                " se encontro en la posicion " + posicion + ".\n" );
           }
           System.out.println( "\nEscriba un valor entero (-1 para terminar): " );
           enteroB= entrada.nextInt();
        }
    }
}
