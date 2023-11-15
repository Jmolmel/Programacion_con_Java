import java.util.Scanner;

/**
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numeroIntroducido;
    double i = 0;
    double f = 0;
    

    do {
      System.out.println("Introduzca diferentes números para calcular la media: ");
      numeroIntroducido = sc.nextDouble();
      if (numeroIntroducido > 0) {
      f = numeroIntroducido + f;
      i++;
      }
    } while (numeroIntroducido >= 0);
    System.out.println(f / i);
  }
}
