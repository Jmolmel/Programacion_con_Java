import java.util.Scanner;

/**
 * Hacer un ejercicio que pida por teclado un carácter y, a continuación, una
 * serie de números enteros (de 0 en adelante) hasta que se
 * introduzca un número negativo. A continuación se mostrará una tabla donde en
 * la
 * primera columna aparecerán los números introducidos y en cada fila aparecerá
 * repetido el carácter introducido
 * tantas veces como indique la primera columna.
 * 
 * @author José Molina Meléndez
 */
public class T05Historigrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String caracter = "";
        int numero;

        int numeroCompleto = 0;

        System.out.print("Introduzca un caracter: ");
        caracter = sc.nextLine();

        do {
            System.out.print("Introduzca números: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                numeroCompleto = numeroCompleto * 10 + numero;
            }

        } while (numero >= 0);

        int numeroVolteado = 0;

        while (numeroCompleto > 0) {
            numeroVolteado = numeroVolteado * 10 + numeroCompleto % 10;
            numeroCompleto /= 10;
        }

        while (numeroVolteado > 0) {
            int digito = numeroVolteado % 10;
            System.out.print(digito + "| ");

            for (int i = 1; i <= digito; i++) {
                System.out.print(caracter);
            }
            System.out.println();
            numeroVolteado /= 10;
        }
    }
}
