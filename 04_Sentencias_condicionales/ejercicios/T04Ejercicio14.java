import java.util.Scanner;

/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduzca un número para comprobar si es par y divisible entre 5: ");
        numero = sc.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("El número introducido es par.");
        } else {
            System.out.println("El número introducido no es par.");
        }

        if ((numero % 5) == 0) {
            System.out.println("El número es divisible entre 5.");
        } else {
            System.out.println("El número no es divisible entre 5.");
        }
        sc.close();
    }

}
