import java.util.Scanner;

/**
 * Debes crear un programa que pida una serie de números entre 0 y 9...
 * 
 * @author José Molina Meléndez
 */
public class T05Historigramav2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido;
        int numeroCompleto = 0;
        int maximo = 0;

        do {
            System.out.println("Introduzca números del 0 al 9: ");
            numeroIntroducido = sc.nextInt();

            if (numeroIntroducido >= 0 && numeroIntroducido <= 9) {
                numeroCompleto = (numeroCompleto * 10) + numeroIntroducido;
                if (numeroIntroducido > maximo) {
                    maximo = numeroIntroducido;
                }
            } else {
                System.out.println("Introduzca números dentro del rango permitido.");
            }
        } while (numeroIntroducido >= 0);

        int numeroVolteado = 0;

        while (numeroCompleto != 0) {
            int digito = numeroCompleto % 10;
            numeroVolteado = numeroVolteado * 10 + digito;
            numeroCompleto /= 10;
        }

        while (numeroVolteado > 0) {
            int digito = numeroVolteado % 10;

            for (int i = 1; i <= maximo; i++) {
                System.out.print(" --- ");
            }
            System.out.println();
            System.out.printf("| %-1d |", digito);
            if (digito > 0) {
                for (int i = 0; i < digito; i++) {
                    System.out.print(" * |");
                }
                for (int j = digito; j < maximo; j++) {
                    System.out.print(" |");
                }

            }
            System.out.println();
            for (int i = 1; i <= maximo; i++) {
                System.out.print(" --- ");
            }
            numeroVolteado /= 10;
        }

    }
}