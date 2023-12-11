import java.util.Scanner;

/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito,
 * se
 * queda igual.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio52 {
    public static void main(String[] args) {

        long numIntroducido;
        long ultimoDigito;
        long numVolteado = 0;
        int contador = 0;
        long dePrimeroAUltimo = 0;
        boolean esElPrimero = false;

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Introduzca un número: ");
            numIntroducido = teclado.nextLong();

            // Damos la vuelta y averiguamos cuántos dígitos tiene
            while (numIntroducido > 0) {
                ultimoDigito = numIntroducido % 10;
                numVolteado = numVolteado * 10 + ultimoDigito;
                numIntroducido /= 10;
                contador++;
            }

            // Ya volteado - Le sacamos el primer número y lo guardamos en una variable
            // (PARTE 1)
            while (numVolteado > 0) {
                ultimoDigito = numVolteado % 10;
                numIntroducido = numIntroducido * 10 + ultimoDigito;
                numVolteado /= 10;
                if (!esElPrimero) {
                    dePrimeroAUltimo = ultimoDigito;
                    esElPrimero = true;
                    break;
                }
            }

            // Si el contador es mayor que 1 significa que tiene más de un dígito, y
            // continuará dándole la vuelta al número
            // Esto se hace, porque se inicializa a 0, y si no se hace esto, cuando solo
            // introduces un número, pondrá el cero delante.
            if (contador > 1) {

                numIntroducido = 0;

                for (int i = 0; i < contador - 1; i++) {

                    ultimoDigito = numVolteado % 10;

                    numIntroducido = numIntroducido * 10 + ultimoDigito;

                    numVolteado /= 10;
                }

                System.out.println("El número resultante es: " + numIntroducido + dePrimeroAUltimo);
            } else {
                System.out.println("El número resultante es: " + dePrimeroAUltimo);
            }

            teclado.close();

        } finally {
            System.out.println("");
            System.out.println("Hasta luego");
            System.out.println("");
        }
    }
}