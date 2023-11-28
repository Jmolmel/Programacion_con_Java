import java.util.Scanner;

/**
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los números desde el 1 al número introducido junto
 * con su factorial.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calculoFactorial = 1;

        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            for (int i = 1; i <= numero; i++) {
                calculoFactorial *= i;
                System.out.println(i + "!" + " = " + calculoFactorial);
            }
        } else {
            System.out.println("Introduzca un número entero positivo.");
        }
    }
}
