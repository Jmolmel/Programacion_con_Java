/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * @author José Molina Meléndez
 */
package Ejercicio04;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<String>();

        System.out.println("Ingrese 10 palabras:");

        for (int i = 0; i < 10; i++) {
            palabras.add(System.console().readLine());
        }

        Collections.sort(palabras);
        System.out.println("Palabras ordenadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
