import java.util.Scanner;

/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o long)
 * 
 * @author José Molina Meléndez
 */
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long numeroIntroducido;
    int numeroDeCifras = 1; // En caso de no entrar en el siguiente bucle, entonces es porque el número es de 1 cifra

    System.out.print("Introduzca un número para decirle cuantas cifras tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;
    sc.close();
    
    while (n >= 10) {
      n /= 10;    //  equivale       n /= 10 == n = n / 10
      numeroDeCifras ++;
    }
    if (numeroDeCifras == 1) {
      System.out.println(numeroIntroducido + " tiene 1 cifra.");
    } else{
      System.out.println(numeroIntroducido + " tiene " + numeroDeCifras + " cifras");
    }
  }
}
