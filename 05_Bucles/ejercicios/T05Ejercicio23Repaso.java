import java.util.Scanner;

/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio23Repaso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaNumero = 0;
        int contadorNumero = 0;

        System.out
                .println("A continuacion debe introducir numeros para que se vayan sumando hasta llegar a los 10.000");
        do {
            System.out.print("Introduzca número: ");
            int numero = sc.nextInt();

            if (numero >= 0) {
                contadorNumero++;
                sumaNumero += numero;
            }
        } while (sumaNumero <= 10000);
        System.out.println("Su suma es de : " + sumaNumero);
        System.out.println("Ha introducido un total de " + contadorNumero + " números y la media es de "
                + sumaNumero / contadorNumero);
    }
}
