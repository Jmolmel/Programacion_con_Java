import java.util.Scanner;

/**
 * Programa que lee número de teclado mientras el número sea par
 * 
 * @author José Molina Meléndez
 */
public class EjemploDoWhile06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;

    do {
      System.out.print("Introduzca un número par: ");
      numero = sc.nextInt();
      if (numero % 2 == 0) {
        System.out.println("Ay que bonito el número par!!!!: " + numero);
      } else{
        System.out.println("No me gustan los impares. Adiós.");
      }
    } while (numero % 2 == 0);
    sc.close();
  }
}
