/**
 * Escribe un programa que pinte por pantalla la bandera de Andalucía
 * 
 * @author José Molina Meléndez
 */
public class Ejercicio02Examen {
  public static void main(String[] args) {
    
    System.out.printf("\033[38;5;76m%c%c%c%c%c%c%c%c%c%c\n", 2588, 2588, 2588 , 2588 , 2588 ,2588 , 2588 , 2588, 2588, 2588);
    System.out.printf("\033[38;5;15m%c%c%c%c%c%c%c%c%c%c\n", 2588, 2588, 2588 , 2588 , 2588 ,2588 , 2588 , 2588, 2588, 2588);
    System.out.printf("\033[38;5;76m%c%c%c%c%c%c%c%c%c%c\033[0m\n", 2588, 2588, 2588 , 2588 , 2588 ,2588 , 2588 , 2588, 2588, 2588);
  }
}