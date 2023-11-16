import java.util.Scanner;

/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int clave = 1234;
    int numeroIntentos = 4; // contador de intentos
    int numeroIntroducido;
    Boolean acertado = false;

    do {
      System.out.print("Introduzca la clave para abrir la caja fuerte: ");
      numeroIntroducido = sc.nextInt();
      numeroIntentos--;
      if (clave == numeroIntroducido) {
        acertado = true;
      } else {
        System.out.println("Lo siento, esa no es la combinación, te quedan: " + numeroIntentos);
      }
    } while ((numeroIntentos > 0) && (!acertado)); // !acertado es lo mismo que acertado = false ... Ambas son
                                                   // verdaderas hasta que pase lo contrario y salga del bucle.
    sc.close();

    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, no le quedan mas intentos.");
    }
  }
}
