import java.util.Scanner;

/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int dia;

    System.out.println("Introduzca numericamente el día de la semana para saber que asignatura le toca: ");
    dia = sc.nextInt();

    if ((dia >= 1) || (dia <= 7)) {
      switch (dia) {
      case 1:
        System.out.println("El LUNES a primer hora tienes FOL");
        break;
      case 2:
        System.out.println("El MARTES a primer hora tienes PROGRAMACION");
        break;
      case 3:
        System.out.println("El MIERCOLES a primer hora tienes ENTORNOS DE DESARROLLO");
        break;
      case 4:
        System.out.println("El JUEVES a primer hora tienes BASE DE DATOS");
        break;
      case 5:
        System.out.println("El VIERNES a primer hora tienes PROGRAMACION");
        break;
      case 6:
        System.out.println("ES SABADO!!!! NO TIENES CLASE");
        break;
      case 7:
      System.out.println("ES DOMINGO!!!! NO TIENES CLASE");
        break;
    
      default:
      System.out.println("Introduzca un número válido.");
        break;
      }
    }
    sc.close();
  }
  }
  
