import java.util.Scanner;

/**
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int total = 0;

        System.out.print("Introduzca un numero para sumar los 100 siguientes: ");
        numero = sc.nextInt();
        if (numero > 0) {
            for (int i = numero; i <= numero + 100; i++) {
                total += i;
                System.out.println(total);
            }
        } else {
            System.out.println("Introduzca un número positivo.");
        }
    }
}
