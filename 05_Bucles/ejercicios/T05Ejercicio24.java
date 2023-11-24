import java.util.Scanner;

/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 1;
        System.out.println("Este programa creara una piramide hecha con números. ");

        System.out.print("Introduzca cuantas filas quiere en su piramide: ");
        int alturaIntroducida = sc.nextInt();

        int espacios = alturaIntroducida - 1;

        while (altura <= alturaIntroducida) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < altura; i++) {
                System.out.print(i);
            }

            for (int i = altura; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            altura++;
            espacios--;
        }
    }
}
