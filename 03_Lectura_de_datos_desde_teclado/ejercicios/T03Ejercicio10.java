import java.util.Scanner;

/**
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca sus Mb para convertirlos en Kb: ");
    int megaByte = sc.nextInt();

    int conversion = (int) (megaByte * 1000 );

    System.out.println("El resultado es: " + conversion + " Kilobyte");
    sc.close();
  }
  
}
