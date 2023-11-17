import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salida = false;

        do {
            System.out.print("Introduzca un numero para comprobar si es primo: ");
            numero = sc.nextInt();
            if ((numero % numero == 0) && (numero % 1 == 0)) {
                System.out.println("Su número es primo.");
                salida = true;
            } else {
                System.out.println("Su número no es primo.");
            }
        } while (!salida);
    }
}
