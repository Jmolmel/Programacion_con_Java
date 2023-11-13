import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio22bis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final int MINUTOS_TOTALES_SEMANA_LABORAL = (4 * 24 * 60) + (15 * 60);   //Calculando minutos desde lunes 00 hasta Viernes 15:00
    final int MINUTOS_TOTALES_FIN_DE_SEMANA = (2 * 24 * 60) + ((24-15)*60);
    int diasTranscurridos = 0;

    System.out.println("¿Qué día es hoy?: ");
    String diaFinDeSemana = sc.nextLine();


    System.out.println("Por favor, introduce una hora: ");
    int hora = sc.nextInt();
    System.out.println("Introduce los minutos: ");
    int minutos = sc.nextInt();

    switch (diaFinDeSemana) {
      case "viernes":
        diasTranscurridos = 0;
        break;

      case "sabado":
        diasTranscurridos = 1;
        break;

      case "domingo":
        diasTranscurridos = 2;
        break;
    
      default:
      System.out.println("No es un día válido.");
        break;
    }
    int minutosTranscurridos = ((((diasTranscurridos * 24 * 60) + (hora * 60) + minutos) - 900) + MINUTOS_TOTALES_SEMANA_LABORAL);
    System.out.println(minutosTranscurridos);

  }
  
}
