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
    System.out.print("Introduzca la nota del primer examen(Este contará un 40%): ");
    double nota40 = sc.nextDouble();

    System.out.print("Introduzca la nota del segundo examen(Este contará un 60%): ");
    double nota60 = sc.nextDouble();

    double notaFinal = (nota40*40/100)+(nota60*60/100);

    System.out.println(notaFinal);
    sc.close();
  }
  
}
