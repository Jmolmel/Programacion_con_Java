/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author Jose Molina Melendez
 */
public class T02Ejercicio01 {
  public static void main(String[] args){
  
  int x = 144;
  int y = 999;

  System.out.println(x);
  System.out.println(y);

  System.out.println("La suma de " + x + " el numero " + y + " es igual a " + (x+y));
  System.out.println("La resta de " + y + " el numero " + x + " es igual a " + (y-x));
  System.out.println("La division de " + y + " el numero " + x + " es igual a " + (y/x) + " con un resto de " + (y%x));
  System.out.println("La multiplicación de " + x + " el numero " + y + " es igual a " + (x * y));


  
  }
  
}
