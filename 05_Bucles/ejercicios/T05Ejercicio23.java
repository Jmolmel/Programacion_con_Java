import java.util.Scanner;

/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroIntroducido;
        int contadorSuma = 0;
        int contadorNumeros = 0;

        System.out.println("Introduzca números para sumarlos (MAXIMO SUMA 10.000): ");

        do {
            numeroIntroducido = sc.nextInt();
            contadorSuma += numeroIntroducido;
            contadorNumeros++;
        } while (contadorSuma <= 10000)
        sc.close();
        
        System.out.println("Ha introducido usted un total de: " + contadorNumeros + " numeros.");
        System.out.println("El resultado de su suma es de: " + contadorSuma);
        System.out.println("La media de los números introducidos es: " + (contadorSuma / contadorNumeros));
    }
}
