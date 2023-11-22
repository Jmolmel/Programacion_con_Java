import java.util.Scanner;

/**
 * 
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioComida = 0;
        double precioBebida = 0;
        double precioPostre = 0;
        double precioCompra = 0;
        double precioTotal = 0;
        double calculoDescuento = 0;
        double subtotal;
        int unidades = 0;
        int descuento = 0;

        System.out.println("    LA TIENDA DE APU");
        System.out.println(" ========================");
        System.out.println(" 1.Comida");
        System.out.println(" 2.Bebidas");
        System.out.println(" 3.Postres");
        System.out.print("INTRODUZCA LO QUE DESEA COMPRAR: ");
        String menu = sc.nextLine();

        switch (menu) {
            case "1":
                System.out.println("------COMIDAS------");
                System.out.println("1. Burguer de pollo           (7,00 €)");
                System.out.println("2. Burguer de almendra        (8,00 €)");
                System.out.println("3. Burguer de aceutinas       (9,00 €)");
                String comida = sc.nextLine();
                switch (comida) {
                    case "1":
                        precioComida = 7.00;
                        break;
                    case "2":
                        precioComida = 8.00;
                        break;
                    case "3":
                        precioComida = 9.00;
                        break;

                    default:
                        System.out.println("Introduzca un plato correcto.");
                        break;
                }
                break;
            case "2":
                System.out.println("------BEBIDAS------");
                System.out.println("1. Cola           (2,50 €)");
                System.out.println("2. Fanta          (2,00 €)");
                System.out.println("3. Agua           (1,00 €)");
                String bebida = sc.nextLine();
                switch (bebida) {
                    case "1":
                        precioBebida = 2.50;
                        break;
                    case "2":
                        precioBebida = 2.00;
                        break;
                    case "3":
                        precioBebida = 1.00;
                        break;

                    default:
                        System.out.println("Introduzca una bebida correcta.");
                        break;

                }
                break;
            case "3":
                System.out.println("------POSTRE------");
                System.out.println("1. Natilla           (2,00 €)");
                System.out.println("2. Helado            (1,50 €)");
                System.out.println("3. Fruta             (1,00 €)");
                String postre = sc.nextLine();
                switch (postre) {
                    case "1":
                        precioPostre = 2.00;
                        break;
                    case "2":
                        precioPostre = 1.50;
                        break;
                    case "3":
                        precioPostre = 1.00;
                        break;

                    default:
                        System.out.println("Introduzca un postre correcto.");
                        break;
                }
                break;
            default:
                System.out.println("Introduzca un menú correcto");
                break;
        }
        System.out.println("Introduzca las unidades que desea de este producto: ");
        unidades = sc.nextInt();

        System.out.println("¿Existe alguna promoción en curso? ( si / no)");
        String promocion = sc.next();

        if (promocion.equalsIgnoreCase("si")) {
            System.out.println("Introduzca el descuento a aplicar (%): ");
            descuento = sc.nextInt();

        }
        if (promocion.equalsIgnoreCase("no")) {
            System.out.println("Sin descuento a aplicar.");
        }

        precioCompra = (precioComida + precioBebida + precioPostre);
        subtotal = (unidades * precioCompra);
        calculoDescuento = ((subtotal * descuento) / 100);
        precioTotal = (subtotal - calculoDescuento);

        System.out.println("FACTURA DE COMPRA");
        System.out.println("=========================");
        System.out.printf("%-15s         %5.2f\n", "Precio por unidad", precioCompra);
        System.out.printf("%-10s         %12d\n", "Unidades", unidades);
        System.out.printf("%-10s         %12.2f\n", "Subtotal", subtotal);
        System.out.printf("%-10s  (%%)   %13d\n", "Descuento", descuento);
        System.out.printf("%-10s         %12.2f\n", "TOTAL", precioTotal);
    }
}
