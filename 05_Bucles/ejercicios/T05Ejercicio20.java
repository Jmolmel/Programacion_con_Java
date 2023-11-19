import java.util.Scanner;

/**
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide
 * hueca
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca el caracter para pintar su pirámide: ");
    String caracter = sc.nextLine();

    System.out.print("Introduzca la altura de su pirámide: ");
    int alturaIntroducida = sc.nextInt();

    sc.close();

    int nivel = 1;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorDentro = 0;

    while (nivel < alturaIntroducida) {
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      System.out.print(caracter);

      for (int i = 1; i <= espaciosPorDentro; i++) {
        System.out.print(" ");
      }
      if (nivel > 1) {
        System.out.print(caracter);
      }
      System.out.println();
      nivel++;
      espaciosPorDelante--;
      espaciosPorDentro += 2;

    }
    for (int i = 1; i < alturaIntroducida * 2; i++) {
      System.out.print(caracter);
    }
  }
}
