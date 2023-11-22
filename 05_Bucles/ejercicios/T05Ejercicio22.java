import java.util.Scanner;

/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * @author José Molina Meléndez
 */
public class T05Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int primo;

    for (int i = 2; i <= 100 ; i++) {
      for (int j = 1; j < i; j++) {
        if (i % j == 0 && j != i) {
        System.out.println(i);
      }
      }
    }
  }
}