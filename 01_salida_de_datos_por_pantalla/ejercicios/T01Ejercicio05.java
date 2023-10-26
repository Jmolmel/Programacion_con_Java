/**
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
 * correspondiente traducción al castellano. Las palabras deben estar distribuidas en dos columnas y alineadas a la izquierda.
 * @author Jose Molina Melendez
 */
import Colorines.ConsoleColores;
public class T01Ejercicio05 {
  public static void main(String[] args){
  System.out.println("-----------------------------------------------------------------------------------------------------"); 
  System.out.printf("%-8s    %-8s     %-8s     %-8s    %-8s   \n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
  System.out.println("-----------------------------------------------------------------------------------------------------");
  System.out.printf("\033[33m%-13s \033[31m%-13s \033[92m%-13s \033[95m%-13s \033[31m%-13s\n", "Fol", "PROG", "ET", "BD", "PROG" );
  System.out.printf("\033[33m%-13s \033[31m%-13s \033[92m%-13s \033[95m%-13s \033[31m%-13s\n", "Fol", "PROG", "ET", "BD", "PROG" );
  System.out.printf("\033[33m%-13s \033[95m%-13s \033[95m%-13s \033[37m%-13s \033[92m%-13s\n", "Fol", "BD", "BD", "LM", "ET" );
  System.out.printf("\033[30m%-13s \033[95m%-13s \033[95m%-13s \033[37m%-13s \033[30m%-13s\n", "SI", "BD", "BD", "LM", "SI" );
  System.out.printf("%-13s \033[37m%-13s \033[31m%-13s \033[31m%-13s \033[30m%-13s\n", "SI", "LM", "PROG", "PROG", "SI" );
  System.out.printf("\033[30m%-13s \033[37m%-13s \033[31m%-13s \033[31m%-13s \033[30m%-13s\n", "SI", "LM", "PROG", "PROG", "SI" );
  }
  
}