import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, introduce un día de la semana (de lunes a viernes)");
    String dia = sc.nextLine();
    final int MINUTOSTOTALES = (4 * 24 * 60) + (15 * 60);   //Calculando minutos desde lunes 00 hasta Viernes 15:00
    int diasTranscurridos = 0;


    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;
      case "martes":
        diasTranscurridos = 1;
        break;
      case "miercoles":
      case "miércoles":
        diasTranscurridos = 2;
        break;
      case "jueves":
        diasTranscurridos = 3;
        break;
      case "viernes":
        diasTranscurridos = 4;
        break;
      
      
      default:
      System.out.println("No has introducido un valor correcto.");
        break;
    }
    System.out.println("Por favor, introduce una hora: ");
    int hora = sc.nextInt();
    System.out.println("Introduce los minutos: ");
    int minutos = sc.nextInt();

    int minutosTranscurridos = (diasTranscurridos * 24 * 60) + (hora * 60 + minutos);

    System.out.println("Faltan " + (MINUTOSTOTALES - minutosTranscurridos) + " minutos para llegar al fin de semana.");

  }
  
}
