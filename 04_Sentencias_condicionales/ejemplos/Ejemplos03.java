import java.util.Scanner;

/**
 * Uso de la sentencia SWITCH
 * Escribe programa que solicite dia para demostrar si es lectivo o fin de semana.
 * 
 * @author Jose Molina Melendez
 */
public class Ejemplos03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dia;
    System.out.println("Introduzca un dia de la semana para comprobar si es lectivo o fin de semana: ");
    dia = sc.nextInt();

  switch (dia) {
    case 1:          //tambien puedo añadir case 1,2,3,4,5 porque todas replican lo mismo.
      System.out.println("Es un día entre semana");
      break;
    case 2:
      System.out.println("Es un día entre semana");
      break;
    case 3:
      System.out.println("Es un día entre semana");
      break;
    case 4:
      System.out.println("Es un día entre semana");
      break;
    case 5:
      System.out.println("Es un día entre semana");
      break;
    case 6:           //tambien se podria agrupar poniendo case 6,7
      System.out.println("ES FIN DE SEMANA");
      break;
    case 7:
      System.out.println("ES FIN DE SEMANA");
      break;
    
    default:
      System.out.println("**  Error: no se corresponde con ningun dia de la semana");
      break;
    }
    sc.close();
  }
}
