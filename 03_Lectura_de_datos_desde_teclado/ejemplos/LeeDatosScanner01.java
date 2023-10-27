import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * 
 * @author Jose Molina Melendez
 */
public class LeeDatosScanner01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");   //creamos un objeto de la clase Scanner , llamado sc     / Añadir Windows-1252 y en el terminal chcp 1252 para que muestre las Ñ y vocales con tilde(Es un bug de visual)
    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();                  //Guardamos en la variable nombre lo que introducimos (String)

    System.out.print("Introduce tu edad: ");      
    int edad = sc.nextInt();                      //Guardamos la variable edad que introducimos en (next INT)

    System.out.println("Tu nombre es " + nombre +" y tienes " + edad + " años");
    sc.close();
  }
  
}
