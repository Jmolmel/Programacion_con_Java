import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca (separado por espacios) la base y altura de su rectangulo para cancular el area: ");
    int base = sc.nextInt();
    int altura = sc.nextInt();

    int area = (int) (base*altura);

    System.out.println("El area de su rectangulo es : " + area);
    
    sc.close();
  }
  
}
