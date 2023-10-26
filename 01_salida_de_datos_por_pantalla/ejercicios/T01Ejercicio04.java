/**
 * Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
 * correspondiente traducción al castellano. Las palabras deben estar distribuidas en dos columnas y alineadas a la izquierda.
 * @author Jose Molina Melendez
 */
public class T01Ejercicio04 {
  public static void main(String[] args){
  System.out.println("-----------------------------------------------------------------------------------------------------"); 
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
  System.out.printf("-----------------------------------------------------------------------------------------------------\n");
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "FOL", "BD", "ET", "BD", "PROG");
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "FOL", "BD", "ET", "BD", "PROG");
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "FOL", "LM", "BD", "LM", "ET");
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "SI", "LM", "BD", "LM", "SI");
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "SI", "PROG", "PROG", "PROG", "SI");
  System.out.printf("%-10s    %-10s     %-10s     %-10s    %-10s   \n", "SI", "PROG", "PROG", "PROG", "SI");

  }
  
}