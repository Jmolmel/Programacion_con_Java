import java.util.Scanner;
/**
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir números largos.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número entero positivo.");
    long numeroIntroducido = sc.nextLong();
    long numeroVolteado = 0;
    int numeroCifras = 0;
    int digito;
    int sumaPares = 0;

    //Al tener que mostrarlos de izq a der, mejor volvearemos el numero.
    //Y calculamos el número de cifras

    while (numeroIntroducido > 0) {
      numeroVolteado = (numeroIntroducido % 10) + (numeroVolteado * 10);
      numeroIntroducido /= 10;
      numeroCifras++;
    }
    System.out.println("Dígitos pares: ");

    for (int i = 0; i < numeroVolteado; i++) { //Muestra dígitos pares
      digito = (int) (numeroVolteado % 10);
      //Una vez tomada la cifra, vemos si es par haciendo la operacion MOD 2
      if (digito % 2 == 0) {
        System.out.println(digito + " ");
        sumaPares += digito;
      }
      numeroVolteado /= 10;  //Dividimos por 10 para obtener la siguiente cifra del número volteado
    }
    System.out.println("\n La suma de los dígitos pares es " + sumaPares);
  }
}
