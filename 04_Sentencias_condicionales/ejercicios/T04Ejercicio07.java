import java.util.Scanner;

/**
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double nota1;
    Double nota2;
    Double nota3;
    Double media;

    System.out.println("Introduzca 3 notas para calcular su media.");   //duda como introducir un 
    System.out.print("Introduzca la primera nota: ");
    nota1 = sc.nextDouble();
    System.out.print("Introduzca la segunda nota: ");
    nota2 = sc.nextDouble();
    System.out.print("Introduzca la tercera nota: ");
    nota3 = sc.nextDouble();

    media = ((nota1+nota2+nota3)/3);

    if (media >= 5) {
      System.out.printf("Estas aprobado tu nota media es:  %.2f", media);  
    } else{
      System.out.printf("Lamentablemente has suspendido, tu nota media es:  %.2f",media);
    }
    sc.close();
  }
}
