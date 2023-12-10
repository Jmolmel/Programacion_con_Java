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
        long numeroVolteado = 0;
        int digitoPar = 0;
        int digitoImpar = 0;
        int contador = 0;
        int digito;

        System.out.print("Introduzca un número entero positivo : ");
        long numeroIntroducido = sc.nextLong();

        long copiaNumero = numeroIntroducido;

        while (copiaNumero > 0) {
            numeroVolteado = (numeroVolteado * 10) + (copiaNumero % 10);
            copiaNumero /= 10;
            contador++;
        }

        for (int i = 1; i <= contador; i++) {
            digito = (int) numeroVolteado % 10;
            if (digito % 2 == 0) {
                digitoPar++;
            }
            if (digito % 2 != 0) {
                digitoImpar++;
            }
            numeroVolteado /= 10;
        }

        System.out.println("El número " + numeroIntroducido + " tiene " + digitoPar + " números pares y " + digitoImpar
                + " números impares.");
    }
}
