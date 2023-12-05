import java.util.Scanner;

/**
 * Debes crear un programa que pida una serie de números entre 0 y 9...
 * 
 * @author José Molina Meléndez
 */
public class T05EjercicioEXTRA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido;
        int numeroCompleto = 0;
        int maximo = 0;
        try {
            do {
            System.out
                    .println("Introduzca un número entre el 0 y el 9. Para finalizar, introduzca un número negativo:");
            numeroIntroducido = sc.nextInt();

            if (numeroIntroducido >= 0 && numeroIntroducido <= 9) {
                numeroCompleto = (numeroCompleto * 10) + numeroIntroducido;

                if (numeroIntroducido > maximo) {
                    maximo = numeroIntroducido;
                }
            } else {
                System.out.println("Introduzca un número dentro del rango permitido.");
            }
        } while (numeroIntroducido >= 0);

        System.out.println();
        int numeroVolteado = 0;

        while (numeroCompleto != 0) {
            int digito = numeroCompleto % 10;
            numeroVolteado = numeroVolteado * 10 + digito;
            numeroCompleto /= 10;
        }

        System.out.println("______________________");
        while (numeroVolteado > 0) {
            int digito = numeroVolteado % 10;
            System.out.printf("  %-4d|", digito);

            if (digito > 0) {
                for (int i = 0; i < digito; i++) {
                    System.out.print("*|");
                }

            }
            for (int i = digito; i < maximo; i++) {
                System.out.print(" |");
            }

            System.out.println();
            numeroVolteado /= 10;
        }
        System.out.println("______________________");

        } catch (NumberFormatException nfe) {                        
            System.out.println("No se puede introducir caracteres.");
        } catch (Exception e) {                        
            System.out.println("Eror de mensaje." + e.getMessage());
            System.out.println("Clase de excepción." + e.getClass());
        }
    }
}