import java.util.Scanner;

/**
 * Histograma
 * 
 * @author José Molina Meléndez
 */
public class T05Historigramav3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numeroCompleto = 0;
        int numeroVolteado = 0;
        int contador = 0;
        int numeroMayor = 0;

        try {
            System.out
                    .println(
                            "Introduzca números entre 0 y 9 y pulsa INTRO. Introduce un número negativo si deseas parar.");
            do {
                numero = sc.nextInt();
                if (numero >= 0 && numero <= 9) {
                    numeroCompleto = numeroCompleto * 10 + numero;
                    if (numero > numeroMayor) {
                        numeroMayor = numero;
                    }
                }

            } while (numero >= 0);

            while (numeroCompleto > 0) {
                numeroVolteado = numeroVolteado * 10 + numeroCompleto % 10;
                numeroCompleto /= 10;
                contador++;
            }

            int numeroColumnas = numeroMayor + 1;

            for (int i = 1; i <= numeroColumnas; i++) {
                System.out.print(" ---");
            }

            for (int i = 1; i <= contador; i++) {
                System.out.println();
                int digito = numeroVolteado % 10;
                numeroVolteado /= 10;
                System.out.print("| " + digito + " |");

                for (int j = 1; j <= digito; j++) {
                    System.out.print(" * |");
                }

                for (int j = 1; j <= numeroMayor - digito; j++) {
                    System.out.print("   |");
                }
                System.out.println();
                for (int k = 1; k <= numeroColumnas; k++) {
                    System.out.print(" ---");
                }

            }
            sc.close();

        } catch (NumberFormatException nfe) {
            System.out.println("No se puede introducir caracteres.");

        } catch (Exception e) {
            System.out.println("Eror de mensaje." + e.getMessage());
            System.out.println("Clase de excepción." + e.getClass());
        }
    }
}
