import java.util.Scanner;

public class Array02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] n = {26, -30, 0, 100, 50};      //Manera diferente de definir el Array.

    System.out.println("Los valores del arrays son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3] + ", " + n[4]);
    int suma = n[0] + n[4];
    System.out.println(suma);

    System.out.println("El Array contiene "+ n.length + " elementos. ¿Cuál deseas ver? (0-4)");  // n.length usado para saber longitud del Array
    int indice = sc.nextInt();
    System.out.println("El elemento que se encuentra en la posición " + indice + " es el " + n[indice]);
    sc.close();
  }
}
