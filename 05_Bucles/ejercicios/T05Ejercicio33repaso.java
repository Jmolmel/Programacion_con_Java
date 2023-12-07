import java.util.Scanner;

/**
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
 * El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio33repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de su U: ");
        int altura = sc.nextInt();

        for (int i = 1; i < altura; i++) {
            System.out.print("*");
            for (int j = 1; j <= altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.print(" ");
        for (int i = 1; i <= altura - 2; i++) {
            System.out.print("*");
        }
    }
}
