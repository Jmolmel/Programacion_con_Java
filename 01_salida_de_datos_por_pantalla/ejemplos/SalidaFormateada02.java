/**
 * Salida formateada utilizando flags
 * 
 * @author Jose Molina Melendez
 */

public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100);   //coge 8 espacios a la izquierda
    System.out.printf("%08d\n", 100);  //rellena con 0 hasta el 100
    System.out.printf("%+d\n", 100);   // muestra el simbolo del numero
    System.out.printf("%-8d\n", 100);   // alinea a la izquierda el numero y rellena con espacios

    System.out.println(" Articulo        Precio/caja      Nºcajas");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s    %8.2f       %6d\n", "manzanas", 4.5, 10);
    System.out.printf("%-10s    %8.2f       %6d\n", "peras", 2.75, 120);
    System.out.printf("%-10s    %8.2f       %6d\n", "aguacates", 10.0, 6);
    System.out.println("               Precio Total:");
  } 
}
