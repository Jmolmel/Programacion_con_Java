/**
 * Escribe un programa que declare variables de tipo char 
 * y de tipo String. Intenta mostrarlas por pantalla todas juntas 
 * en la misma línea y con una sola sentenciade Java
 *  (con un solo println) ¿es posible?
 * 
 * @author Jose Molina Melendez
 */
public class T02Ejercicio07{
  public static void main(String[] args){

    char letraA = 'a'; //char siempre con comilla simple
    char letraM = 'm';
    char letraL = 'l';
    String comoTeEncuentras = "¿Cómo te encuentras con el resfriado?";

    System.out.println(comoTeEncuentras + " " + ", " + letraM + letraA + letraL);
  }
}