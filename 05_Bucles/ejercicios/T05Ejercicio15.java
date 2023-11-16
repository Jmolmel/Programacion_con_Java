import java.util.Scanner;

/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
 * 5,
 * se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double base;
        int exponente;

        System.out.print("Introduzca la base: ");
        base = sc.nextDouble();
        System.out.print("Introduzca el exponente: ");
        exponente = sc.nextInt();

        for (int i = 0; i <= exponente; i++) {
            System.out.println(base + "^" + i); // ¿Cómo poner unicodes dentro de un for?
        }

    }

}
