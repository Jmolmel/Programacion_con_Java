import java.util.Scanner;

public class T05PruebaTryCatch {
  public static void main(String[] args) {
    double numero1;
    double numero2;
    Scanner sc = new Scanner(System.in);

    try {
      System.out.println("Introduzca el primer número: ");
      numero1 = sc.nextInt();
      System.out.println("Introduzca el primer número: ");
      numero2 = sc.nextInt();
      System.out.println("La media es " + (numero1 + numero2) / 2);
    } catch (Exception e) {
      System.out.println("No se puede calcular la media.");
      System.out.println("Los datos introducidos no son correcto.");
    } finally {
      System.out.println("Gracias por usar este programa.");
    }


  }
}
