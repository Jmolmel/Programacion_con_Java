import java.util.Scanner;
/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el primer numero: ");
    int num1 = sc.nextInt();
    System.out.println("Introduca el segundo numero: ");
    int num2 = sc.nextInt();

    int suma = (int) (num1+num2);
    int resta = (int) (num1-num2);
    int multi = (int) (num1*num2);
    double div = (double) (num1/num2);

    System.out.println("------------------");
    System.out.println("El resultado de su suma es : " + suma);
    System.out.println("El resultado de su resta es : " + resta);
    System.out.println("El resultado de su multiplicacion es : " + multi);
    System.out.println("El resultado de su division es : " + div);
    System.out.println("-------------------");
    
    sc.close();
  }
}
