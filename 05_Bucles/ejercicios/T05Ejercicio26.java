import java.util.Scanner;

/**
 * Realiza un programa que pida primero un número y a continuación un dígito.
 * El programa nos debe dar la posición (o posiciones) contando de izquierda a
 * derecha que ocupa ese dígito en el número introducido.
 * 
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digito;
        int volteado = 0;
        int longitud = 0;
        int posicion = 1;

        System.out.print("Introduzca un número: ");
        int numeroIntroducido = sc.nextInt();
        int numero = numeroIntroducido;
        System.out.println("Introduzca un dígito del número anterior para saber su posicion: ");
        digito = sc.nextInt();

        if (numero == 0) {
            longitud = 1;
        }
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }
        while (volteado > 0) {
            if ((volteado % 10) == digito) {
                System.out.print(posicion + " ");
            }
            volteado /= 10;
            posicion++;
        }
    }
}
