import java.util.Scanner;

public class Problema2examen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int divisoresPropios = 0;
    int sumaNumeros = 0;

    System.out.println("Introduce un número entero positivo: ");
    int numero = sc.nextInt();
    System.out.println();
    System.out.print("Los divisores propios de " + numero + " son: ");
    for (int i = numero; i <= numero; i++) {
      
      for (int j = 2; j < numero; j++) {
        
        if (i % j == 0) {
          System.out.print(j + " ");
          sumaNumeros += j;
        }
        
      }   
    }
    sumaNumeros++;
    System.out.println();
    System.out.println("Suma de los divisores propios y el 1: " + sumaNumeros);
    if (sumaNumeros == numero ) {
      System.out.println("Es un número perfecto.");
    }
  }
}
