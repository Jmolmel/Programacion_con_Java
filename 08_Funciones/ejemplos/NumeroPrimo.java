/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class NumeroPrimo {

  public static void main(String[] args) {
    boolean esPrimo = true;

    for (int n = 2; n <= n; n++) {

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