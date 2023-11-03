import java.util.Scanner;

/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    
    System.out.println("Introduzca su importe en EUROS para convertirlo a pesetas: ");
    num1 = sc.nextInt();

    num1 = (int) (num1 * 166.386);
    System.out.println(num1);
    sc.close();
  }
}
