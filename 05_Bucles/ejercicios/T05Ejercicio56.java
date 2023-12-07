import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura del triángulo invertido: ");
        int altura = sc.nextInt();

        int anchura = altura;
        int espacios = 1;
        int nivel = 1;

        for (int i = 1; i <= anchura; i++) {
            System.out.print("*");
        }
        System.out.println();

        while (nivel < altura) {
            for (int i = 1; i <= nivel; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < anchura; i++) {
                System.out.print("*");
            }
            System.out.println();
            anchura--;
            nivel++;
        }
    }
}
