import java.util.Scanner;

/**
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca sus Kb para convertirlos en Mb: ");
    int kiloByte = sc.nextInt();

    int conversion =  (kiloByte / 1000 );

    System.out.println("El resultado es: " + conversion + " Megabyte");
    sc.close();
  }
  
}
