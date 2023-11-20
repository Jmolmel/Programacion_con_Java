import java.util.Scanner;

/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la
 * tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y
 * la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con
 * un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int precio = 0;
    String chocolate;
    double precioNata = 0;
    double precioNombre = 0;
    System.out.println("Elija el sabor de su tarta(manzana, fresa o chocolate):");
    String sabor = sc.nextLine();

    switch (sabor) {
      case "manzana":
        precio = 18;
        break;
      case "fresa":
        precio = 16;
        break;
      case "chocolate":
        System.out.println("¿De qué tipo de chocolate (blanco o negro)?");
        chocolate = sc.nextLine();
        if (chocolate.equals("blanco")) {
          precio = 14;
        }
        if (chocolate.equals("negro")) {
          precio = 16;
        }
        break;
    }
    System.out.println("¿Desea añadirle nata?(si o no)");
    String nata = sc.next();
    System.out.println("¿Quiere ponerle un nombre?(si o no)");
    String nombre = sc.next();
    if (nata.equals("si")) {
      precioNata = 2.50;
    } else {
      precioNata = 0;
    }
    if (nombre.equals("si")) {
      precioNombre = 2.75;
    } else {
      precioNombre = 0;
    }
    System.out.printf("%8s %2s %2d %2s\n", "Tarta de: ", sabor, precio, "euros");
    if (nata.equals("si")) {
      System.out.printf("%8s %8.2f\n", "Con nata ", precioNata);
    }
    if (nombre.equals("si")) {
      System.out.printf("%8s %6.2f\n ", "Con nombre ", precioNombre);
    }
    double total = precio + precioNata + precioNombre + precioNombre;
    System.out.printf("%8s %8.2f\n", "Total: ", total);
  }
}
