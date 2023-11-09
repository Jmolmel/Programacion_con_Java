import java.util.Scanner;

/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double h;
    Double total;
    final Double G = 9.81;    //como g es una constante hay que añadir el final . Al nombrar variable siempre va todo en MAYUS


    System.out.println("Introduzca la altura para calcular cuanto tiempo tardará en caer su objeto: ");
    h = sc.nextDouble();

    total = Math.sqrt((2*h)/G);

    if (h >0) {
      System.out.printf("Su objeto tardará:  %.2f  m/s\"", total); 
    } else{
      System.out.println("Introduzca una altura válida.");
    }
    sc.close();
  }
}
