import java.util.Scanner;

/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double nota1;
    Double nota2;
    Double nota3;
    Double media;

    System.out.println("Introduzca 3 notas para calcular su media.");    
    System.out.print("Introduzca la primera nota: ");
    nota1 = sc.nextDouble();
    System.out.print("Introduzca la segunda nota: ");
    nota2 = sc.nextDouble();
    System.out.print("Introduzca la tercera nota: ");
    nota3 = sc.nextDouble();

    media = ((nota1+nota2+nota3)/3);

    if (media <5) {
      System.out.printf("INSUFICIENTE tu nota media es:  %.2f", media);  
    } 
    if (media == 5) {
      System.out.printf("SUFICIENTE tu nota media es:   %.2f", media);
    }
    if ((media >5) && (media <=6)) {
      System.out.printf("BIEN tu nota media es:   %.2f", media);
    }
    if ((media >6) && (media <=7.5)) {
      System.out.printf("NOTABLE! tu nota media es:   %.2f", media);
    }
    if ((media >7.5) && (media <= 10)) {
      System.out.printf("SOBRESALIENTE! tu nota media es:   %.2f", media);
    }
    sc.close();
  }
}
