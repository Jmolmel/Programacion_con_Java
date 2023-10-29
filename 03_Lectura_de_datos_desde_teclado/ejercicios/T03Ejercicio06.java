import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un triángulo
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca (separado por un espacio) la base y altura de su triangulo para calcular el area: ");
    int base = sc.nextInt();
    int altura = sc.nextInt();

    int area = (int) ((base * altura)/2);
    System.out.println("El área de su triangulo es : " + area);
    sc.close();
  }
}
