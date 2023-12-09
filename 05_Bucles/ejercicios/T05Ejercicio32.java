import java.util.Scanner;

/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
 * de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para
 * admitir números largos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numeroVolteado = 0;
    int numeroDigitos = 0;
    long sumaPares = 0;

    System.out.println("Introduzca un número entero positivo: ");
    long numeroIntroducido = sc.nextInt();
    long copiaNumero = numeroIntroducido;

    while (copiaNumero > 0) {
      numeroVolteado = ((copiaNumero % 10) + (numeroVolteado * 10));
      copiaNumero /= 10;
      numeroDigitos++;
    }
    System.out.print("Dígitos pares: ");
    for (int i = 0; i < numeroDigitos; i++) {
      int digito = (int) (numeroVolteado % 10);

      if (digito % 2 == 0) {
        System.out.print(digito + " ");
        sumaPares += digito;
      }
      numeroVolteado /= 10;
    }
    System.out.println();
    System.out.println(sumaPares);
  }
}
