import java.util.Scanner;

/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debepedir por teclado.
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String caracter;
    int altura;
    int espacios;


    System.out.print("Introduzca el caracter para pintar su pirámide: ");
    caracter = sc.nextLine();

    System.out.print("Introduzca la altura de su pirámide: ");
    altura = sc.nextInt();

    do {
      for (int i = 1; i < altura - 1; i++) {
        System.out.println(" ");
        for (int j = 1; j < altura + 2; j++) {
          System.out.println(caracter);
        }

        altura--;
      }
      
    } while (altura == 0);


  }
}
