import java.util.Scanner;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base imponible
 * 
 * @author Jose Molina Melendez
 */
public class T03Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca su base imponible: ");
    double baseImponible = sc.nextDouble();

    double ivaBaseImponible = (double) (baseImponible * 0.21);
    double precioTotalConIva = (double) (baseImponible * 1.21);

    System.out.println("    -------FACTURA-------");
    System.out.printf("Base Imponible:      %8.2f\n", baseImponible);
    System.out.printf("IVA 21%%             %8.2f\n", ivaBaseImponible);
    System.out.printf("TOTAL:               %8.2f\n", precioTotalConIva);

    sc.close();
  }
}
