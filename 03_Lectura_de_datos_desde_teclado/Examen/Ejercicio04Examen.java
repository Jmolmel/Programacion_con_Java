import java.util.Scanner;

/**
 * Uno de los factores que mide la vita útil de un disco duro SSD es la cantidad de TWB
 * 
 * @author José Molina Meléndez
 */
public class Ejercicio04Examen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double factorTwb;
    Double total;
    Double equivalencia;


    System.out.print("Introduzca la cancidad del factor TWB de tu disco duro SSD:");
    factorTwb = sc.nextDouble();

    total = ((factorTwb/6)/365);  //tambien lo hice dividiendo factorTwb/2190 dias da el mismo resultado.

    System.out.println("VIDA ÚTIL SSD");
    System.out.println("=============");
    System.out.printf("La cantidad maxima de terabytes que puedes escribir por dia en SEIS años es de: %.4f TB al día.\n", total);

    equivalencia = (total*1024);
    System.out.printf("La equivalencia de Terabytes a gigabytes es la siguiente: %.4f GB al día.\n", equivalencia);
    
    sc.close();
  }
}
