import java.util.Scanner;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroVolteado = 0;

    System.out.print("Introduzca un numero para que se muestre del reves: ");
    int numero = sc.nextInt();
    sc.close();
    int copiaNumero = Math.abs(numero);

    while (copiaNumero > 0) {
      numeroVolteado = (copiaNumero % 10) + (numeroVolteado * 10);
      copiaNumero /= 10;
    }
    if (numero > 0) {
      System.out.println("El numero " + numero + " volteado es " + numeroVolteado + ".");
    } else {
      System.out.println("El numero " + numero + " volteado es " + numeroVolteado + ".");
    }
  }
}