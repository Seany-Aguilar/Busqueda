package BusquedaBinaria;

import java.util.Arrays;
import java.util.Random;

/*@author Betterlee
 */
public class BusquedaBinaria {

    private int[] datos;
    private static Random generador = new Random();

    public BusquedaBinaria(int tamanio) {
        datos = new int[tamanio]; // crea espacio para el arreglo

        for (int i = 0; i < tamanio; i++) {
            datos[i] = 10 + generador.nextInt(90);
        }

        Arrays.sort(datos);
    }

    public int busquedaBinaria(int elementoBusqueda) {
        int inferior = 0; // extremo inferior del área de búsqueda
        int superior = datos.length - 1; // extremo superior del área de búsqueda
        int medio = (inferior + superior + 1) / 2; // elemento medio
        int ubicacion = -1;
        do // ciclo para buscar un elemento
        {
            System.out.print(elementosRestantes(inferior, superior));

            for (int i = 0; i < medio; i++) {
                System.out.print(" ");
            }
            System.out.println(" * "); 

            if (elementoBusqueda == datos[medio]) {
                ubicacion = medio; 
            } else if (elementoBusqueda < datos[medio]) {
                superior = medio - 1; 
            } else {
                inferior = medio + 1; 
            }
            medio = (inferior + superior + 1) / 2; 
        } while ((inferior <= superior) && (ubicacion == -1));

        return ubicacion; 
    } 

    public String elementosRestantes(int inferior, int superior) {
        StringBuilder temporal = new StringBuilder();

        for (int i = 0; i < inferior; i++) {
            temporal.append(" ");
        }
        for (int i = inferior; i <= superior; i++) {
            temporal.append(datos[i] + " ");
        }
        temporal.append("\n");
        return temporal.toString();
    }

    @Override
    public String toString() {
        return elementosRestantes(0, datos.length - 1);
    }

}
