import java.util.Scanner;

/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
 * El
 * programa debe pedir la alturaIntroducida. Se debe comprobar que la
 * alturaIntroducida sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 * error.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la alturaIntroducida de su reloj de arena: ");
        int alturaIntroducida = sc.nextInt();
        int altura = 1;
        int asteriscos = alturaIntroducida;
        int espaciosPorDelante = 0;

        if ((alturaIntroducida > 3) || (alturaIntroducida % 2 != 0)) {

            while (altura < alturaIntroducida / 2 + 1) {
                // PARTE DE ARRIBA
                // ESPACIOS
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");

                }
                // ASTERISCOS
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print("*");
                }
                System.out.println();
                altura++;
                espaciosPorDelante++;
                asteriscos -= 2;
            }

            // PARTE DE ABAJO

            espaciosPorDelante = alturaIntroducida / 2;
            altura = 1;
            while (altura <= alturaIntroducida / 2 + 1) {
                for (int i = 1; i <= espaciosPorDelante; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < asteriscos; i++) {
                    System.out.print("*");
                }
                System.out.println();
                altura++;
                espaciosPorDelante--;
                asteriscos += 2;
            }

        } else {
            System.out.println("Introduzca una altura válida. ");
        }
    }
}
