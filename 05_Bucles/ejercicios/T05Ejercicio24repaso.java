import java.util.Scanner;

/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio24repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nivel = 1;

        System.out.print("Introduzca un número para formar su pirámide: ");
        int numeroIntroducido = sc.nextInt();

        int espaciosPorDelante = numeroIntroducido - 1;

        while (nivel <= numeroIntroducido) {

            for (int i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= nivel; i++) {
                System.out.print(i);
            }

            for (int i = nivel - 1; i >= 1; i--) {
                System.out.print(i);
            }
            System.out.println();
            nivel++;
            espaciosPorDelante--;
        }
    }
}
