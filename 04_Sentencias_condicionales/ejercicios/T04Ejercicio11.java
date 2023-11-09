import java.util.Scanner;

/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hora;
    int minuto;

    System.out.println("A continuacion deberá escribir la hora y los minutos: ");

    System.out.print("Introduzca la hora: ");
    hora = sc.nextInt();
    System.out.print("Introduzca minutos: ");
    minuto = sc.nextInt();

    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;

    System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.\n", hora, minuto, segundosHastaMedianoche);
  }
}
