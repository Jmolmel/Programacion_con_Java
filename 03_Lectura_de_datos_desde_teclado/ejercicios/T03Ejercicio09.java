import java.util.Scanner;

/**
 * Escribe un programa que calcule el volumen de 
 * un cono según la fórmula V =1/3*π*r^2*h
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Calcule el volumen de esta formula introduciendo (separado por espacios) el radio y altura ");
    double radio = sc.nextDouble();
    double altura = sc.nextDouble();

    Double volumen = (double) ((1.0/3.0)*Math.PI*radio*radio*altura);  // para elevar al cuadrado puedo poner Math.pow(r, 2)
    System.out.printf("El volumen de su cono es: %.2f", volumen);
  }
}
