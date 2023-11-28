import java.util.Scanner;

/**
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digitosPares = 0;
        int digitosImpares = 0;
        int digito;

        try {
            System.out.print("Introduzca un número entero positivo: ");
            long numeroIntroducido = sc.nextLong();

            long copiaNumero = numeroIntroducido; // copiamos el número introducido para trabajar con el.

            while (copiaNumero > 0) {
                digito = (int) (copiaNumero % 10); // El resto de dividir por 10.
                if (digito != 0) {
                    if (digito % 2 == 0) {
                        digitosPares++;
                    } else {
                        digitosImpares++;
                    }
                }
                copiaNumero /= 10;
            }
            System.out.println("El número " + numeroIntroducido + " contiene " + digitosPares + " dígitos pares y "
                    + digitosImpares + " impares.");

        } catch (Exception nfe) {
            System.out.println("ERROR!!! No puede introducir carácteres.");

        } finally {
            System.out.println("Gracias por usar nuestro programa.");
        }

    }
}
