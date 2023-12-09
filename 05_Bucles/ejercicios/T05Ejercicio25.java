import java.util.Scanner;

/**
 * Realiza un programa que pida un número por teclado y que luego muestre ese
 * número al revés.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número para voltearlo: ");
    int numero = sc.nextInt();

    int copiaNumero = numero;
    int numeroVolteado = 0;

    while (copiaNumero > 0) {
      numeroVolteado = (copiaNumero % 10) + (numeroVolteado * 10);
      copiaNumero /= 10;
    }
    System.out.println(numeroVolteado);
  }
}