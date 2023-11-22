import java.util.Scanner;

/**
 * Explica tu codigo aqui
 * 
 * @author José Molina Meléndez
 */
public class EjercicioExamen01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int iva = 0;
    double precioProducto = 0;
    String nombreProducto = "";
    double total = 0;
    double calculoIVA = 0;
    double totalConIva = 0;
    int codigoPromocion = 0;
    double descuento = 0;
    String codigoDeLaPromocion = "";
    double totalConDescuento = 0;
    double totalCalculoIVASinDescuento = 0;
    double totalConIVASinDescuento = 0;
    
    System.out.println("1. Alimentacion");
    System.out.println("2. Farmacia");
    System.out.println("3. Electrónica");
    System.out.println("4. Moda");
    System.out.println("Introduzca el tipo de producto: ");
    String producto = sc.nextLine();

    switch (producto) {
      case "1":
      System.out.println("Elija el producto alimentacion que desea comprar");
      System.out.println("1.Huevos (4% IVA) 2.Pan (4% IVA) 3.leche (4% IVA) 4.Fruta (4% IVA) 5.Carne (10% IVA) 6.Agua (10% IVA) 7.Verdura (4% IVA) 8.Otros (10% IVA)");
      String alimentacion = sc.nextLine();
        switch (alimentacion) {
          case "1","2","3","4","7":
            iva = 4;
            break;
          case "5","6","8":
            iva = 10;
            break;
          default:
            break;
        }
        break;
      case "2":
        iva = 4;
        break;
      case "3":
        iva = 21;
        break;
      case "4":
        iva = 21;
        break;
    
      default:
      System.out.println("Introduzca un producto válido.");
        break;
    }

    System.out.print("Introduzca el nombre del producto: ");
    nombreProducto = sc.nextLine();
    System.out.print("Introduzca la cantidad: ");
    int cantidadProducto = sc.nextInt();
    System.out.print("Introduzca el precio por unidad del producto: ");
    precioProducto = sc.nextDouble();


    System.out.print("¿Dispone de algún código promocional? (si / no)");
    String codigoPromocional = sc.next();

      System.out.println("Introduzca sú codigo promocional (1.SINIVA 2.PROMO50 3.PROMO 3x2 4.NO)");
      String eleccionCodigo = sc.next();
      switch (eleccionCodigo) {
        case "1":
          codigoDeLaPromocion = "SINIVA";
          descuento = total - iva;
          break;
        case "2":
          codigoDeLaPromocion = "50DTO";
          descuento = precioProducto / 2;
          break;
        case "3":
          codigoDeLaPromocion = "3X2";
          descuento = precioProducto - (precioProducto / 3);
          break;
        case "4":
        codigoDeLaPromocion = "SINDESCUENTO";
        descuento = 1;
          break;
      }
    total = (precioProducto*cantidadProducto);
    calculoIVA = ((totalConDescuento * iva) /100);
    totalConIva = (total - totalConDescuento);
    totalConDescuento = total - descuento;
    totalCalculoIVASinDescuento = (total * iva) / 100;
    totalConIVASinDescuento = (totalCalculoIVASinDescuento + total);

    if (codigoPromocional.equals("si")) {
      System.out.println("FACTURA");
    System.out.println("-----------------------------------------");
    System.out.printf("Artículo             %10s\n", nombreProducto);
    System.out.printf("Precio        %8.2f €  %6s\n", precioProducto, "/unidad");
    System.out.printf("Cantidad               %8d €\n", cantidadProducto);
    System.out.printf("Total                  %8.2f €\n", total);
    System.out.printf("Descuento (%2s)       -%8.2f €\n",codigoDeLaPromocion, descuento);
    System.out.printf("Total con descuento    %8.2f €\n", totalConDescuento);
    System.out.printf("IVA al (%2d %%)          %8.2f €\n",iva, calculoIVA);
    System.out.println("-----------------------------------------");
    System.out.printf("Total con IVA          %8.2f €\n", totalConIva);
    }
    if (codigoPromocional.equalsIgnoreCase("no")) {
      System.out.println("FACTURA");
    System.out.println("-----------------------------------------");
    System.out.printf("Artículo             %10s\n", nombreProducto);
    System.out.printf("Precio        %8.2f €  %6s\n", precioProducto, "/unidad");
    System.out.printf("Cantidad               %8d €\n", cantidadProducto);
    System.out.printf("Total                  %8.2f €\n", total);
    System.out.printf("Total con descuento    %8.2f €\n", totalConDescuento);
    System.out.printf("IVA al (%2d %%)          %8.2f €\n",iva, totalCalculoIVASinDescuento);
    System.out.println("-----------------------------------------");
    System.out.printf("Total con IVA          %8.2f €\n", totalConIVASinDescuento);
    }
  }
}
