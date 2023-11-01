import java.util.Scanner;

/**
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dia;
    System.out.println("Introduzca un número ");
    dia = sc.nextInt();

    if (dia >=0 && dia <=7 ) {
    
      switch (dia) {
        case 1:
          System.out.println("LUNES");
          break;
        case 2:
          System.out.println("MARTES");
          break;
        case 3:
          System.out.println("MIERCOLES");
          break;
        case 4:
          System.out.println("JUEVES");
          break;
        case 5:
          System.out.println("VIERNES");
          break;
        case 6:
          System.out.println("SABADO");
          break;
        case 7:
          System.out.println("DOMINGO");
          break;
      }
      
    }else{
      System.out.println("Introduzca un día valido.");
    }
  }
}
