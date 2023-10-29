import java.util.Scanner;

/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 *de su multiplicación.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un numero: \n");
    int num1 = sc.nextInt();

    System.out.print("Introduzca otro numero: \n");
    int num2 = sc.nextInt();

    System.out.println("La numa de los numeros es: " + (num1+num2));
    sc.close();
  }
}
