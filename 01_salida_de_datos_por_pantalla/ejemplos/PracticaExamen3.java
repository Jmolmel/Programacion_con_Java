import java.util.Scanner;

/**
 * Escribe un programa que calcule el volumen de un toroide (dónut) según la fórmula V=2π2Rr2. 
 * AYUDA: El código hexadecimal del carácter Unicode que nos permite indicar el exponente de los cms3 es 00B3.
 * 
 * @author José Molina Meléndez
 */
public class PracticaExamen3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double radioMenor;
    double radioMayor;
    double volumen;

    System.out.print("Introduzca el radio MAYOR para calcular el volumen de un toroide: ");
    radioMayor = sc.nextDouble();

    System.out.print("Introduzca el radio MENOR para calcular el volumen de un toroide: ");
    radioMenor = sc.nextDouble();

    volumen = ((2 * Math.PI) * (2 * radioMayor) * (radioMenor * radioMenor));

    System.out.printf("\u001B[31mEl volumen de un toroide es : %.5f cm\u00B3\u001B[0m", volumen);


  }

}
