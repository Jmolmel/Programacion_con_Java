import java.util.Scanner;

public class PracticaExamen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int codigo;
    Double precio;
    int cantidad;
    int descuento;



    System.out.print("Introduzca el código del árticulo que desea comprar:  ");
    codigo = sc.nextInt();
    System.out.print("Introduzca el precio:  ");
    precio = sc.nextDouble();
    System.out.print("Introduzca la cantidad:  ");
    cantidad = sc.nextInt();
    System.out.print("Introduzca el descuento (%):  ");
    descuento = sc.nextInt();

    double porcentajeDescuento = (((precio*cantidad)*descuento)/100);

    System.out.println("------TICKET------");
    System.out.printf("Código %-8d       Precio %.2f\n", codigo, precio);
    System.out.printf("Unidades \u001B[31m %-8d\u001B[0m     Precio %.2f\n", cantidad, (precio*cantidad));
    System.out.printf("Descuento %% %-8d    -%.2f\n", descuento, porcentajeDescuento);

    double total = ((precio * cantidad) - porcentajeDescuento);
    System.out.printf("TOTAL =            %8.2f euros.\n", total);



  }
}
