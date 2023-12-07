import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que
 * comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la anchura de su rectángulo: ");
        int anchura = sc.nextInt();

        System.out.println("Introduzca la altura de su rectángulo: ");
        int altura = sc.nextInt();

        int espaciosCentro = anchura - 2;

        if (altura >= 2 && anchura >= 2) {

            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 1; i <= altura - 2; i++) {
                System.out.print("*");
                for (int j = 1; j <= anchura - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 1; i <= anchura; i++) {
                System.out.print("*");
            }

        } else {
            System.out.println("Error! Los datos introducidos deben ser mayor o igual a 2.");
        }
    }
}
