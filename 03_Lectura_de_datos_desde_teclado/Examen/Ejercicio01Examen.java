import java.util.Scanner;

/**
 * Escribe un programa que calcule el volumen de un tronco de cono según la siguiente fórmula: V = (1/3)πh(R2 + r2 + Rr)o aqui
 * 
 * @author José Molina Meléndez
 */
public class Ejercicio01Examen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double baseMayor;
    Double baseMenor;
    Double altura;
    Double volumen;

    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    baseMayor = sc.nextDouble();

    System.out.print("Introduzca el radio de la base menor r (cm): ");
    baseMenor = sc.nextDouble();

    System.out.print("Introduzca el radio de la altura h (cm): ");
    altura = sc.nextDouble();

    volumen = ((Math.PI*altura) * (Math.pow(baseMayor, 2 ) + (Math.pow(baseMenor, 2) + (baseMayor * baseMenor)))/3);

    System.out.printf("El volumen del toroide es de \033[38;5;9m%.4f cm\u00B3.\033[0m \n", volumen);
    sc.close();
  }
}
