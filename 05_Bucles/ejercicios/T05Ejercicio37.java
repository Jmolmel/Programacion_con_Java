import java.util.Scanner;

/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido;

        do {
            System.out.print("Introduzca un número entero positivo: ");
            numeroIntroducido = sc.nextInt();
        } while (numeroIntroducido < 1);
        System.out.print(numeroIntroducido + " = ");

        // Contar números y calcular

        int numeroDigitos = 0;
        int numeroVolteado = 0;

        while (numeroIntroducido > 0) {
            numeroVolteado = ((numeroVolteado * 10) + (numeroIntroducido % 10));
            numeroIntroducido /= 10;
            numeroDigitos++;
        }
        int digito = 0;

        // separar cifra y escribir palos

        for (int i = 0; i < numeroDigitos; i++) {
            digito = numeroVolteado % 10;
            numeroVolteado /= 10;
            for (int j = 0; j < digito; j++) {
                System.out.print("|");
            }
            if (i < numeroDigitos - 1) {
                System.out.print("-");
            }
        }

    }

}
