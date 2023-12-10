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
        System.out.print("Introduzca un número entero positivo: ");
        int numero = sc.nextInt();
        int factorial = 1;

        if (numero > 0) {

            for (int i = 1; i <= numero; i++) {
                factorial *= i;
                System.out.print(i + "!" + " =" + factorial);
                System.out.println();
            }
        }
    }
}
