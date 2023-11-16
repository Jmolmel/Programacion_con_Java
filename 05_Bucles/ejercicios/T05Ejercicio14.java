import java.util.Scanner;

/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;

        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("Introduzca el exponente: ");
        exponente = sc.nextInt();

        for (int i = 0; i <= exponente; i++) {
            int resultado = i * base;
            System.out.println(resultado);
        }
    }
}
