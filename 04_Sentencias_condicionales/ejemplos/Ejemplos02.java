import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * 
 * @author Jose Molina Melendez
 */
public class Ejemplos02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int numero;

    System.out.print("Introduzca un numero que este entre el 1 y 100: ");
    numero = sc.nextInt();
    
    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("Estas entre el 1 y el 100");
    } else {
      System.out.println("El numero no es correcto");
    }
    sc.close();
  }
}
