import java.util.Scanner;

/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido = 0;
        int numeroPositivo = 0;
        int numeroNegativo = 0;
        do {
            System.out.print("Introduzca 10 números para determinar cuantos son positivos y cuantos negativos: ");
            int numero = sc.nextInt();
            numeroIntroducido++;
            if (numero > 0) {
                numeroPositivo++;
            }
            if (numero < 0) {
                numeroNegativo++;
            }
        } while (numeroIntroducido < 10);
        System.out.println("Usted ha introducido " + numeroPositivo + " números positivos y " + numeroNegativo
                + " números negativos.");
    }
}
