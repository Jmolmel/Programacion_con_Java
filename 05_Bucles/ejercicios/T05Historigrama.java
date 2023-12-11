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
        int numero;
        int numeroCompleto = 0;
        String caracter = "";
        System.out.print("Introduzca un carácter : ");
        caracter = sc.nextLine();
        do {

            System.out.println("Introduzca números para mostrar en el historigrama: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                numeroCompleto = numeroCompleto * 10 + numero;
            }

        } while (numero >= 0);

        int volteado = 0;

        while (numeroCompleto > 0) {
            volteado = volteado * 10 + numeroCompleto % 10;
            numeroCompleto /= 10;
        }

        while (volteado > 0) {
            int digito = volteado % 10;

            System.out.print(digito + " |");
            for (int i = 1; i <= digito; i++) {
                System.out.print(caracter);
            }
            System.out.println();
            volteado /= 10;
        }
    }
}
