/**
 * Ejemplo primera lectura de datos (Clase 27/10/2023)
 * 
 * @author Jose Molina Melendez
 */

 public class Ejemplo01{
  public static void main(String[] args) {
   // String nombre;
   //  System.out.println("Dime como te llamas: ");
    //nombre = System.console().readLine();

    //System.out.println("¡Hola " + nombre + "! Bienvenid@ a programación");

    String num1;
    String num2;
    System.out.println("Introduce un nuevo número: ");
    num1 = System.console().readLine();

    System.out.println("Introduce un nuevo número: ");
    num2 = System.console().readLine();

    System.out.println("El resultado = " + (num1+ num2));

  }
 }