import java.util.Scanner;

/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si
 * se
 * muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalConIva;
        Double iva = 0.21;
        Double descuento = 0.00;

        System.out.println("Introduzca su base imposible: ");
        Double baseImponible = Double.parseDouble(System.console().readLine());
        System.out.println("Introduzca el tipo de IVA (general , reducido o superreducido): ");
        String tipoIva = System.console().readLine().toLowerCase();
        System.out.println("Introduzca el código promocional.(nopro, mitad, 5porc): ");
        String codigoPromocional = System.console().readLine().toLowerCase();
        switch (tipoIva) {
            case "general":
                iva = 0.21;
                break;
            case "reducido":
                iva = 0.10;
                break;
            case "superreducido":
                iva = 0.04;
                break;

        }
        Double porcentajeIva = (baseImponible * iva);
        Double precioConIva = baseImponible + (baseImponible * iva);

        switch (codigoPromocional) {
            case "nopro":
                descuento = 0.00;
                break;
            case "mitad":
                descuento = precioConIva / 2;
                break;
            case "5porc":
                descuento = precioConIva * 0.05;
                break;
        }
        Double total = precioConIva - descuento;
        System.out.println(baseImponible);
        System.out.println(porcentajeIva);
        System.out.println(precioConIva);
        System.out.println(descuento);
        System.out.println(total);
    }

}
