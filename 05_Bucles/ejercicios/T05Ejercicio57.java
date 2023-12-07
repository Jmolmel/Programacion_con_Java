import java.util.Scanner;

/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel = 1;
        int espacios = 1;

        System.out.print("Introduzca la altura: ");
        int altura = sc.nextInt();

        int espaciosDentro = altura - 3;

        for (int i = 1; i <= altura; i++) {
            System.out.print("*");
        }
        System.out.println();

        while (nivel <= altura - 2) {

            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int i = 1; i <= espaciosDentro; i++) {
                System.out.print(" ");
            }
            System.out.println("*");

            espacios++;
            espaciosDentro--;
            nivel++;
        }
        // ULTIMO ASTERISCO
        for (int i = 1; i < altura; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
