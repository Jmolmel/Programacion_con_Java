import java.util.Scanner;

/**
 * La franquicia de tiendas de ropa VísteT
 * 
 * @author José Molina Meléndez
 */
public class Ejercicio03Examen {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String articulo;
    Double precio;
    int unidades;
    Double descuento;
    Double subTotal;
    Double subTotalcondescuento;
    Double iva;
    Double total;
    

    System.out.print("Introduzca el nombre del artículo: ");
    articulo = sc.nextLine();

    System.out.print("Introduzca su precio: ");
    precio = sc.nextDouble();

    System.out.print("Introduzca la cantidad de unidades que desea: ");
    unidades = sc.nextInt();

    descuento = ((precio*15)/100);
    subTotal = (precio*unidades);
    subTotalcondescuento = (precio-descuento);
    iva = ((subTotalcondescuento*21)/100);
    total = (subTotalcondescuento + iva);

    System.out.println("FACTURA");
    System.out.println("==============================================");
    System.out.printf("Artículo                %10s \n", articulo);
    System.out.printf("Precio                  %8.2f eur/unidad\n", precio);
    System.out.printf("Cantidad                %10d \n", unidades);
    System.out.printf("Subtotal                %8.2f euros\n", precio);
    System.out.printf("Descuento (15%%)        %8.2f euros\n", descuento);
    System.out.printf("Subtotal con descuento  %8.2f euros\n", subTotalcondescuento);
    System.out.printf("IVA                     %+8.2f euros\n", iva);
    System.out.println("==============================================");
    System.out.printf("TOTAL                   %8.2f euros\n", total);
    sc.close();
  }
}
