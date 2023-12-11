import java.util.Scanner;

/**
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario
 * debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco.
 * Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel = 2;

        System.out.print("Por favor, introduzca la altura del arbol: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura / 2 + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < altura / 2 + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("^");

        int espaciosFuera = altura / 2;
        int espaciosDentro = altura / 2 - 2;

        while (nivel < altura - 2) {
            for (int i = 1; i <= espaciosFuera; i++) {
                System.out.print(" ");

            }
            System.out.print("^");
            for (int i = 1; i <= espaciosDentro; i++) {
                System.out.print(" ");

            }
            System.out.println("^");
            espaciosFuera--;
            espaciosDentro += 2;
            nivel++;
        }
        for (int i = 1; i < (altura - 2) * 2; i++) {
            System.out.print("^");
        }
        System.out.println();
        for (int i = 1; i <= altura / 2 + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("Y");

    }
}