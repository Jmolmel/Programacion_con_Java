import java.util.Scanner;

/**
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double a;
    Double b;
    Double x;

    System.out.println("Este programa resuelve ecuaciones de primer grado ax + b = 0. Por favor introduzca el valor de a: ");
    a = sc.nextDouble();
    System.out.println("Por favor introduzca el valor de b: ");
    b = sc.nextDouble();

    if ((a>= 0.1) || (a < 0)) {
      x = (b*(-1)/a);
      System.out.printf("x=  %.2f", x);
    } else{
      System.out.printf("Esta ecuación no tiene solución.");
    }
    sc.close();
  }
}
