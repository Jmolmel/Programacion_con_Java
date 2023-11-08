import java.util.Scanner;

/**
 * Implementa un programa que calcule el número de vueltas que ha girado el planeta Tierra sobre sí mismo durante una cantidad de años 
 * pedida por teclado al usuario. El programa debe soportar cantidades de años muy elevadas. 
 * No es necesario considerar los años bisiestos, se considera que todos los años tienen 365 días.
 * 
 * @author José Molina Meléndez
 */
public class PracticaExamen2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long total;
    long año;

    System.out.println("Introduzca el numero de años para saber cuantas vueltas ha dado la tierra: ");
    año = sc.nextLong();
    total = (año*365);

    System.out.printf("\u001B[1mLa tierra ha dado un total de %d vueltas en %d años\u001B[0m", total, año);



  }
  
}
