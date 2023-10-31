import java.util.Scanner;

/**
 * Uso de la sentencia SWITCH con BISBIS (es otra manera de acumular case y ahorrar codigo separandolos con el break)
 * Escribe programa que solicite dia para demostrar si es lectivo o fin de semana.
 * 
 * @author Jose Molina Melendez
 */
public class Ejemplos03bisbis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dia;
    System.out.println("Introduzca un dia de la semana para comprobar si es lectivo o fin de semana: ");
    dia = sc.nextInt();

  switch (dia) {
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    System.out.println("Es un dia entre semana");
      break;


    case 6:           //tambien se podria agrupar poniendo case 6,7
    case 7:
      System.out.println("ES FIN DE SEMANA");
      break;
    
    default:
      System.out.println("**  Error: no se corresponde con ningun dia de la semana");
      break;
    }
  }
}
