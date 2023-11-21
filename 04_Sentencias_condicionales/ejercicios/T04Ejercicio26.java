import java.util.Scanner;

/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros.
 * Los jueves son el día de la pareja, por lo que la entrada para dos cuesta 11
 * euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8)
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio26 { // HAY FALLOS, HACER DE MANERA MAS SIMPLIFICADA.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradas;
        String dia;
        String tarjeta;
        int precioBase = 0;
        double descuento = 0.00;

        System.out.print("Número de personas que quieren entrada: ");
        entradas = sc.nextInt();
        System.out.print("Día de la semana: ");
        dia = sc.next();

        System.out.print("Tiene tarjeta CineCampa? (s/n): ");
        tarjeta = sc.next();

        switch (dia) {
            case "lunes", "martes", "viernes", "sabado", "domingo":
                precioBase = 8;
                break;
            case "miercoles":
                precioBase = 5;
                break;
            case "jueves":
                precioBase = 11;
                break;

            default:
                System.out.println("Introduzca un dia de la semana correcto, o en minusculas por favor.");
                break;
        }

        switch (tarjeta) {
            case "s":
                descuento = 0.10;
                break;
            case "n":
                descuento = 1.00;
                break;
        }

        double descuentoTotal = ((precioBase * entradas) * descuento);
        double totalAPagar = ((precioBase * entradas) - descuentoTotal);
        double total = (precioBase * entradas);
        int entradaIndiviualpareja = 0;
        if (dia.equals("lunes") || dia.equals("martes") || dia.equals("miercoles") || dia.equals("viernes")
                || dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Aquí tiene sus entradas. Gracias por su compra!");
            System.out.printf("Entradas individuales:             %8d   \n", entradas);
            System.out.printf("Precio por entrada individual:     %8d   \n", precioBase);
            System.out.printf("Total:                             %8.2f \n", total);
            System.out.printf("Descuento:                         %8.2f \n", descuentoTotal);
            System.out.printf("A pagar:                           %8.2f \n", totalAPagar);
        }

        entradaIndiviualpareja = entradas % 2;
        int precioBaseIndividual = 8;
        int entradaPareja = entradas / 2;
        int precioEntradaPareja = entradaPareja * precioBase;
        double precioEntradaInd = entradaIndiviualpareja * precioBaseIndividual;
        double preciTotalPareja = (entradaPareja * precioBase)
                + (precioBaseIndividual * entradaIndiviualpareja);
        double descuentoTotalPareja = (precioEntradaInd + precioEntradaPareja) * descuento;
        double totalAPagarPareja = preciTotalPareja - descuentoTotalPareja;
        double precioTotalPareja1 = entradaPareja * precioBase;
        double descuento1 = precioTotalPareja1 * descuento;
        double totalAPagar1 = precioTotalPareja1 - descuento1;

        if (dia.equals("jueves")) {
            if (entradas % 2 == 0) {
                System.out.println("Aquí tiene sus entradas. Gracias por su compra!");
                System.out.printf("Entradas de pareja:                %8d   \n", entradaPareja);
                System.out.printf("Precio por pareja:                 %8d   \n", precioEntradaPareja);
                System.out.printf("Total:                             %8.2f \n", precioTotalPareja1);
                System.out.printf("Descuento:                         %8.2f \n", descuento1);
                System.out.printf("A pagar:                           %8.2f \n", totalAPagar1);
            } else if (entradas % 2 != 0) {

                System.out.println("Aquí tiene sus entradas. Gracias por su compra!");
                System.out.printf("Entradas de pareja:                %8d   \n", entradaPareja);
                System.out.printf("Precio por pareja:                 %8d   \n", precioBase);
                System.out.printf("Entradas individuales:             %8d   \n", entradaIndiviualpareja);
                System.out.printf("Precio por entrada individual:     %8d   \n", precioBaseIndividual);
                System.out.printf("Total:                             %8.2f \n", preciTotalPareja);
                System.out.printf("Descuento:                         %8.2f \n", descuentoTotalPareja);
                System.out.printf("A pagar:                           %8.2f \n", totalAPagarPareja);
            }
        }

    }
}
