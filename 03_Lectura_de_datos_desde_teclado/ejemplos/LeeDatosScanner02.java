import java.util.Scanner;

/**
 * Lectura de datos por teclado usando Scanner y usando .next()
 * 
 * @author Jose Molina Melendez
 */
public class LeeDatosScanner02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      //creamos un objeto clase Scanner que se llama sc

    System.out.print("Introduce tu nombre, primer apellido y tu edad (separados por un espacio): ");
    String nombre = sc.next();
    String apellido = sc.next();
    int edad = sc.nextInt();
    
    System.out.println("Tu nombre es " + nombre + " " + apellido + " y tienes " + edad + " años"); // se puede hacer por separado con mas println
    sc.close();


    
    
  }
  
}
