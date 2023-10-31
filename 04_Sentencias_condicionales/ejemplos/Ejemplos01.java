/**
 * Explica tu codigo aqui
 * 
 * @author Jose Molina Melendez
 */

import java.util.Scanner;

public class Ejemplos01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Qué nota has sacado en tu último examen?: ");
    int nota = sc.nextInt();             // declarar antes variable y poner despues la variable con sc.nextInt() ?????????

    //if-else
    if (nota >=5) {
      System.out.println("Has aprobado");
    } else {
      System.out.println("Has suspendido");
    }
  }
}