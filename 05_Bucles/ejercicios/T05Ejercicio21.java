import java.util.Scanner;

/**
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el
 * cómputo.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int mayorPar = 0;
        int mayorImpar = 0;
        int contadorNumero = 0;
        int pares = 0; // contador pares
        int impares = 0; // contador impares
        int impar = 0;

        do {
            System.out.println(
                    "Introduzca un número para hacer la media de los pares e impares que introduzca. (Si introduce uno negativo, finalizará el programa.)");
            numero = sc.nextInt();
            if (numero > 0) {
                contadorNumero++;
            }
            if (numero % 2 == 0) {
                pares++;
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
            if ((numero % 2 != 0) && (numero > 0)) {
                impar += numero;
                impares++;
            }

        } while (numero > 0);

        double media = impar / impares;
        System.out.println("Ha introducido un total de: " + contadorNumero + " numeros.");
        System.out.println("El numero mayor de los pares es : " + mayorPar);
        System.out.println("La media de los impares es: " + media);

    }
}
