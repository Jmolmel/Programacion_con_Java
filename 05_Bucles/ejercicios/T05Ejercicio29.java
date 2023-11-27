import java.util.Scanner;

/**
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Introduzca un número: ");
        numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = sc.nextInt();

        for (int i = numero1; i > 0; i--) {
            if (i % numero2 == 0) {
                System.out.println(i);
            }
        }
    }
}
