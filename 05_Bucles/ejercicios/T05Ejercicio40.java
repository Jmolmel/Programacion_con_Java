import java.util.Scanner;

/**
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio40 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int altura = 1;
        int espaciosPorDentro = 0;
        System.out.println("Introduzca la altura de su rombo: ");
        int alturaIntroducida = sc.nextInt();

        int espaciosPorDelante = alturaIntroducida / 2;

        if (alturaIntroducida % 2 != 0 && alturaIntroducida >= 3) {

            // parte superior
            while (altura <= alturaIntroducida / 2 + 1) {

                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                for (int i = 1; i < espaciosPorDentro; i++) {
                    System.out.print(" ");
                }
                if (altura > 1) {
                    System.out.print("*");
                }
                System.out.println();

                altura++;
                espaciosPorDelante--;
                espaciosPorDentro += 2;
            }

            espaciosPorDentro = alturaIntroducida - 3;
            espaciosPorDelante = 1;
            altura = 0;

            while (altura < alturaIntroducida / 2) {

                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int i = 1; i < espaciosPorDentro; i++) {
                    System.out.print(" ");
                }

                if (altura < alturaIntroducida / 2 - 1) {
                    System.out.print("*");
                }

                System.out.println();
                altura++;
                espaciosPorDelante++;
                espaciosPorDentro -= 2;
            }
        } else {
            System.out.println("Error");
        }
    }
}
