import java.util.Scanner;

/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num1;
    int num2;
    
    System.out.print("Introduzca el primer número: ");
    num1 = sc.nextInt();
    System.out.print("Introduzca el segundo número: ");
    num2 = sc.nextInt();
    
    if (num1 != num2) {
      if (num1 > num2) {
        for (int i = num2; i < num1; i += 7) {
          System.out.println(i);
        }
      }
      if (num1 < num2) {
        for (int f = num1; f < num2; f += 7) {
          System.out.println(f);
        }
      }
  } else {
    System.out.println("Introduzca dos números diferentes.");
  }
}
}
