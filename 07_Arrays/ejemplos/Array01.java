
/**
 * Ejemplo primero del Tema 7 - Arrays
 * 
 * @author José Molina Meléndez
 */
public class Array01 {
  public static void main(String[] args) {
    int[] n;      //Creando un array de enteros
    n = new int[4];   //Definimos n de tamaño 4   

    n[0] = 26;        // Se cuenta el array -1 es decir 0,1,2,3.
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;

    System.out.println("Los valores del arrays son los siguientes: ");
    System.out.println(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
    int suma = n[0] + n[3];
    System.out.println(suma);
  }
}
