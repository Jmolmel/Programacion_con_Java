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
        long numero1;
        long numero2;
        long numeroVolteado1 = 0;
        long numeroVolteado2 = 0;
        int longitud = 0;

        System.out.print("Introduzca un número: ");
        numero1 = sc.nextLong();
        System.out.print("Introduzca el segundo número: ");
        numero2 = sc.nextLong();

        while (numero1 > 0) {
            numeroVolteado1 = ((numeroVolteado1 * 10) + (numero1 % 10));
            numero1 /= 10;
            longitud++;
        }

        while (numero2 > 0) {
            numeroVolteado2 = ((numeroVolteado2 * 10) + (numero2 % 10));
            numero2 /= 10;
        }

        long resultadosPares = 0;
        long resultadosImpares = 0;
        int digito;

        for (int i = 0; i < longitud; i++) {

            digito = (int) (numeroVolteado1 % 10);

            if ((digito % 2) == 0) {
                resultadosPares = resultadosPares * 10 + digito;
            } else {
                resultadosImpares = resultadosImpares * 10 + digito;
            }

            digito = (int) (numeroVolteado2 % 10);

            if ((digito % 2) == 0) {
                resultadosPares = resultadosPares * 10 + digito;
            } else {
                resultadosImpares = resultadosImpares * 10 + digito;
            }
            numeroVolteado1 /= 10;
            numeroVolteado2 /= 10;
        }
        System.out.println("El numero formado por los pares es : " + resultadosPares);
        System.out.println("El numero formado por los impares es : " + resultadosImpares);
    }
}
