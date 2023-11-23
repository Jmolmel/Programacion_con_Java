/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio22 {
  public static void main(String[] args) {
    boolean esPrimo = true;

    for (int n = 2; n <= 100; n++) {

      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.println(n + " ");
      }
    }
  }
}