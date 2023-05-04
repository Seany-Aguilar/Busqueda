package BusquedaLineal;

import java.util.Random;

/*@author Betterlee
 */
public class ArregloLineal {

    private int[] datos; 
    private static Random generador = new Random();

    public ArregloLineal(int tamanio) {
        datos = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            datos[i] = 10 + generador.nextInt(90);
        }
    } 

    public int busquedaLineal(int claveBusqueda) {
        for (int indice = 0; indice < datos.length; indice++) {
            if (datos[indice] == claveBusqueda) {
                return indice; 
            }
        }
        return -1; 
    }

    public String toString() {
        StringBuilder temporal = new StringBuilder();

        for (int elemento : datos) {
            temporal.append(elemento + " ");
        }

        temporal.append("\n"); 
        return temporal.toString();

    }
}
