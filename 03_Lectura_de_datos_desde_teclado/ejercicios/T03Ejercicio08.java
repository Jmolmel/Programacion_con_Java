import java.util.Scanner;

/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca la horas trabajadas por semana: ");
    int hora = sc.nextInt();
    int salarioSemanal = (int) (hora * 12);
    System.out.println("Su salario de 1 semana será de : " + salarioSemanal);
  }
  
}
