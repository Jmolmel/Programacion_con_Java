import java.util.Scanner;

/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su número: ");
        int num = sc.nextInt();
        if (num >= 0) {
            int ultimoNumero = num % 10;
            System.out.println(ultimoNumero);
        }
    }
}
