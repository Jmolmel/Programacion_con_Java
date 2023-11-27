import java.util.Scanner;

/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
 * El programa pedirá la altura. El palo horizontal de la L tendrá una longitud
 * de la mitad (división entera entre 2) de la altura más uno.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.print("Introduzca la altura de su L: ");
        altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            System.out.println("*");
        }
        for (int i = 1; i <= altura / 2 + 1; i++) {
            System.out.print("*");
            System.out.print(" ");
        }
    }
}
