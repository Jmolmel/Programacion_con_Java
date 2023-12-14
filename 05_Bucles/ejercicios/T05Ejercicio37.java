import java.util.Scanner;

/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroVolteado = 0;
        int contador = 0;

        System.out.print("Introduzca un número entero positivo: ");
        int numero = sc.nextInt();

        int copiaNumero = numero;
        while (numero > 0) {
            numeroVolteado = numeroVolteado * 10 + numero % 10;
            numero /= 10;
            contador++;
        }

        System.out.print("El " + copiaNumero + " en decimal es el ");
        while (numeroVolteado > 0) {
            int digito = numeroVolteado % 10;

            for (int i = 1; i <= digito; i++) {
                System.out.print(" |");
            }
            System.out.print(" - ");

            numeroVolteado /= 10;
        }
        System.out.print(" en el sistema de palotes");
    }
}
