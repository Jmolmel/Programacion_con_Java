import java.util.Scanner;

/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debepedir por teclado.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca el caracter para pintar su pirámide: ");
    String caracter = sc.nextLine();

    System.out.print("Introduzca la altura de su pirámide: ");
    int alturaIntroducida = sc.nextInt();

    int nivel = 1;
    int linea = 1;
    int espacio = alturaIntroducida - 1;

    while (nivel <= alturaIntroducida) {
      for (int i = 1; i <= espacio; i++) {
        System.out.print(" ");
      }
      for (int i = 1; i <= linea; i++) {
        System.out.print(caracter);
      }
      System.out.println();

      nivel++;
      espacio--;
      linea += 2;
    }
  }
}
