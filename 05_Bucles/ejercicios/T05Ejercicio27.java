import java.util.Scanner;

/**
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 * 
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido;
        int contadorSuma = 0;

        System.out.print("Introduzca un número para ver los múltiplos que hay desde 1 hasta su número: ");
        numeroIntroducido = sc.nextInt();

        for (int i = 1; i <= numeroIntroducido; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                contadorSuma += i;
            }
        }
        System.out.println("La suma hace un total de: " + contadorSuma);
    }
}
