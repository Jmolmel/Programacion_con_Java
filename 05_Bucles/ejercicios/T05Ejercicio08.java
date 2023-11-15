import java.util.Scanner;

/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca un numero para saber su tabla de multiplicar: ");
    int numero = sc.nextInt();
    for (int i = 0; i <= 10; i++) {
      System.out.println(i*numero);
    }
  }
}
