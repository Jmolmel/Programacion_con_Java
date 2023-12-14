/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class NumeroPrimoConFuncionJava {

  //Funciones
  public static boolean esPrimo(int x) {

    for (int i = 2; i < x; i++) {
      if (x % i == 0) {
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    System.out.println("Introduce un número entero positivo");
  }
}