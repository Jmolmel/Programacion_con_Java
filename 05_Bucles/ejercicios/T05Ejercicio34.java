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
        long numeroPrimeroVolteado = 0;
        long numeroSegundoVolteado = 0;
        int numeroDeDigitos = 0;

        System.out.println("Introduzca el primer número: ");
        long primerNumero = sc.nextLong();
        System.out.println("Introduzca el segundo número: ");
        long segundoNumero = sc.nextLong();

        while (primerNumero > 0) {
            numeroPrimeroVolteado = (numeroPrimeroVolteado * 10) + (primerNumero % 10);
            primerNumero /= 10;
            numeroDeDigitos++;
        }
        while (segundoNumero > 0) {
            numeroSegundoVolteado = (numeroSegundoVolteado * 10) + (segundoNumero % 10);
            segundoNumero /= 10;
        }
        System.out.println();

        long resultadoPares = 0;
        long resultadoImpares = 0;
        int digito;

        for (int i = 0; i < numeroDeDigitos; i++) {

            digito = (int) (numeroPrimeroVolteado % 10);

            if (digito % 2 == 0) {
                resultadoPares = resultadoPares * 10 + digito;

            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }

            digito = (int) (numeroSegundoVolteado % 10);

            if (digito % 2 == 0) {
                resultadoPares = resultadoPares * 10 + digito;
            } else {
                resultadoImpares = resultadoImpares * 10 + digito;
            }

            numeroPrimeroVolteado /= 10;
            numeroSegundoVolteado /= 10;
        }
        System.out.println("El número formado por los dígitos pares son : " + resultadoPares);
        System.out.println("El número formado por los dígitos impares son : " + resultadoImpares);
    }
}
