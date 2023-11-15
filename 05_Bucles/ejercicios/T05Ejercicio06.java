/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atras utilizando un bucle do-while.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio06 {
  public static void main(String[] args) {
    int i = 320;
    do {
      System.out.println(i);
      i -= 20;
    } while (i >=160);
  }
}
