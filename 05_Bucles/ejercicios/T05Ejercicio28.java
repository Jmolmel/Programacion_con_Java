import java.util.Scanner;

/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int calculoFactorial = 1;
        System.out.print("Introduzca un número entero para calcular su número factorial: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            calculoFactorial *= i;
        }
        System.out.println("Su número factorial es: " + calculoFactorial);
    }
}
