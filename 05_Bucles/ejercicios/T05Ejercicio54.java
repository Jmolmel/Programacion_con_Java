import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel = 1;

        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            System.out.print("*");
        }
        System.out.println();

        int espaciosDentro = altura - 3;

        for (int i = 1; i <= altura - 2; i++) {
            System.out.print("*");
            for (int j = 1; j <= espaciosDentro; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
            espaciosDentro--;
            nivel++;
        }
        System.out.println("*");

    }
}
