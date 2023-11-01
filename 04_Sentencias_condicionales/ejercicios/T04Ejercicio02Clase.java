import java.util.Scanner;

/**
 * Escribe un programa que solicite por teclado el número de mes y muestre por pantalla el nombre. Así, si introduce el valor
 * 5 se mostrará MAYO. Si el valor introducido no se corresponde con el de un mes, 
 * se mostrará un mensaje de error.                //autor
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio02Clase {
  public static void main(String[] args) {              //main
    Scanner sc = new Scanner(System.in);

    int mes;

    System.out.print("Introduzca el numero de MES que desea comprobar: ");
    mes = sc.nextInt();

    switch (mes) {
      case 1:
        System.out.println("Enero");
          break;
      case 2:
        System.out.println("Febrero");
          break;
      case 3:
        System.out.println("Marzo");
          break;
      case 4:
        System.out.println("Abril");
          break;
      case 5:
        System.out.println("Mayo");
          break;
      case 6:
        System.out.println("Junio");
          break;
      case 7:
        System.out.println("Julio");
          break;
      case 8:
        System.out.println("Agosto");
          break;
      case 9:
        System.out.println("Septiembre");
          break;
      case 10:
        System.out.println("Octubre");
          break;
      case 11:
        System.out.println("Noviembre");
          break;
      case 12:
        System.out.println("Diciembre");
          break;  
      default:
      System.out.println("ERROR");
        break;
    }
  }
}
