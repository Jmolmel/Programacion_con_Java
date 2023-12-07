import java.util.Scanner;

/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura..
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel = 1;
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();

        while (nivel <= altura) {
            for (int i = 0; i < altura; i++) {
                System.out.print("*");
            }
            System.out.println();
            altura--;
        }
    }
}
