import java.util.Scanner;

/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author Jose Molina Melendez
 */
public class T04Ejercicio02 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int hora;

      System.out.println("Introduzca un tramo horario por sistema: ");
      hora = sc.nextInt();

      if ((hora >=0) && (hora <=24)) {
        
      
        if ((hora >=6) && (hora <=12)) {
          System.out.println("BUENOS DIAS!");
        }
        if ((hora >=13) && (hora <= 20)) {
          System.out.println("BUENAS TARDES!");
        }
        if (((hora >= 21 && hora <=24)) || ((hora >=0  && hora <=5 ))) {
          System.out.println("BUENAS NOCHES!");
        }
      }else{
          System.out.println("Introduzca un horario válido.");
      }
      sc.close();
    }
  }

