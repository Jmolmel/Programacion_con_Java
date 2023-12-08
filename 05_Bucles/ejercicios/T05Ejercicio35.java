import java.util.Scanner;

/**
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio35 { // SIN TERMINAR
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de su X: ");
        int alturaIntroducida = sc.nextInt();
        int altura = 1;
        int espaciosPorDentro = alturaIntroducida - 2;
        int espaciosPorFuera = 0;
        int asteriscoFuera = 1;

        if ((alturaIntroducida % 2 == 0) || (alturaIntroducida < 3)) {
            System.out.println("Introduzca altura impar mayor o igual a 3.");

        } else {
            while (altura < alturaIntroducida / 2 + 1) {

                for (int i = 1; i <= espaciosPorFuera; i++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= altura; i++) {
                    System.out.print("*");

                    for (int j = 1; j <= espaciosPorDentro; j++) {
                        System.out.print(" ");
                    }
                }
                for (int i = 1; i < asteriscoFuera; i++) {
                    System.out.print("*");
                }
                System.out.println();
                asteriscoFuera--;
                espaciosPorDentro--;
                espaciosPorFuera++;
                altura++;

            }
        }

    }
}
