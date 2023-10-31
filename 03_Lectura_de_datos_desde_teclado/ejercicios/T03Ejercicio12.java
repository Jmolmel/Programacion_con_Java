import java.util.Scanner;

/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 * @author Jose Molina Melendez
 */
public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la nota del primer examen: ");
    double nota40 = sc.nextDouble();
    System.out.println("¿Qué nota quieres sacar en el trimestre?: ");
    double notaDeseada = sc.nextDouble();

    double notaFinal = (notaDeseada - (nota40*0.40)/0.6);

    System.out.printf("Para tener un %.1f en el trimestre necesitas sacar un %.1f en el segundo examen.", nota40, notaFinal);
    sc.close();
  } 
}
