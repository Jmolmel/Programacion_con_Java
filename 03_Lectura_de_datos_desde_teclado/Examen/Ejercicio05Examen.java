import java.util.Scanner;

/**
 * Escribe un programa que convierta una cantidad de días a su equivalente en años, meses y días
 * 
 * @author José Molina Meléndez
 */
public class Ejercicio05Examen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dia;
    int formulaDia;
    int formulaMes;
    int formulaAno;
    int mes = 0;
    int ano = 0;
    
    System.out.println("CALCULADORA DE TIEMPO");
    System.out.println("=======================");
    System.out.print("Introduzca una cantidad de dias: ");
    dia = sc.nextInt();

    formulaDia = (dia/30);
    formulaMes = (formulaDia + mes);
    formulaAno = (dia/365);
    
    System.out.printf("%-4ddías son\033[38;5;9m%2d años\033[0m ,\033[38;5;11m%2d meses\033[0m, y \033[38;5;40m%2d días\033[0m. ", dia , formulaAno, formulaMes, formulaDia);
    sc.close();
  }
}
