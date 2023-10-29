import java.util.Scanner;
/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca Pesetas para convertir a Euros: ");
    int pesetas = sc.nextInt();

    pesetas = (int) (pesetas / 166.386);

    System.out.printf("%d\n", pesetas);

  }
  
}
