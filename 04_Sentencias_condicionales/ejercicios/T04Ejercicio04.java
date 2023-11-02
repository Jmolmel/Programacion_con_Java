import java.util.Scanner;

/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora;
    int total12;
    int total16;

    System.out.println("Introduzca el numero semanal de horas trabajadas: ");
    hora = sc.nextInt();

    if (hora >0 && hora <= 40) {
      total12 = (hora*12);
      System.out.printf("Su hora se paga a 12 euros, el total es: " + total12);
    }
    if (hora >41) {
      total16 = (hora*16);
      System.out.printf("Su hora se paga a 16 euros, el total es: " + total16);
    }
    sc.close();
  }
}
