import java.util.Scanner;

/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 * 
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio21Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contadorNumeros = 0;
        int contadorImpares = 0;
        int impares = 0;
        int aux = 0;

        System.out
                .println("A continuación se comprobara la media de los impares y el mayor de sus pares introducidos.");

        do {
            System.out.print("Introduzca números: ");
            numero = sc.nextInt();
            if (numero > 0) {
                contadorNumeros++;

                if (numero % 2 != 0) {
                    contadorImpares++;
                    impares += numero;
                }
                if (numero % 2 == 0) {
                    if (numero > aux) {
                        aux = numero;
                    }
                }
            }
        } while (numero >= 0);

        System.out.println("Ha introducido " + contadorNumeros + " números");
        System.out.println("La media de los impares es : " + impares / contadorImpares);
        System.out.println("El mayor de los pares introducidos es: " + aux);
    }
}
