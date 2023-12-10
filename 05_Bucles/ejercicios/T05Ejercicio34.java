import java.util.Scanner;

/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando
 * los
 * dígitos de la siguiente manera: primer dígito del primer número, primer
 * dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
 * int donde sea necesario para admitir números largos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroVolteadoPrimero = 0;
        long numeroVolteadoSegundo = 0;
        int contador = 0;
        long numerosPares = 0;
        long numerosImpares = 0;
        int digito;

        System.out.print("Introduzca el primer número: ");
        long primerNumero = sc.nextLong();
        System.out.print("Introduzca el segundo número: ");
        long segundoNumero = sc.nextLong();

        while (primerNumero > 0) {
            numeroVolteadoPrimero = (numeroVolteadoPrimero * 10) + (primerNumero % 10);
            primerNumero /= 10;
            contador++;
        }

        while (segundoNumero > 0) {
            numeroVolteadoSegundo = (numeroVolteadoSegundo * 10) + (segundoNumero % 10);
            segundoNumero /= 10;
        }

        System.out.println();

        for (int i = 0; i < contador; i++) {

            digito = (int) (numeroVolteadoPrimero % 10);
            if (digito % 2 == 0) {
                numerosPares = ((numerosPares * 10) + digito);
            } else {
                numerosImpares = (numerosImpares * 10) + digito;
            }

            digito = (int) (numeroVolteadoSegundo % 10);

            if (digito % 2 == 0) {
                numerosPares = ((numerosPares * 10) + digito);
            } else {
                numerosImpares = (numerosImpares * 10) + digito;
            }
            numeroVolteadoPrimero /= 10;
            numeroVolteadoSegundo /= 10;
        }
        System.out.println(numerosPares);
        System.out.println(numerosImpares);
    }
}
