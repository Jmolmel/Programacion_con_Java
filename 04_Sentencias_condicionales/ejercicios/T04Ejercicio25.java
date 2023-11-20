import java.util.Scanner;

/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas
 * 
 * @author José Molina Meléndez
 */
public class T04Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        int anchura;
        String escudo;
        int centimetrosCuadrados;
        Double precioEscudo = 0.00;
        Double gastosDeEnvio = 3.25;

        System.out.print("Introduzca la altura de la bandera en cm: ");
        altura = sc.nextInt();

        System.out.print("Ahora introduzca la anchura: ");
        anchura = sc.nextInt();

        System.out.print("Quiere escudo bordado? (s/n)");
        escudo = sc.next();
        System.out.println("Gracias, aquí tiene el desglose de su compra.");

        centimetrosCuadrados = altura * anchura;
        Double precioCentimetroCuadrado = 0.01 * centimetrosCuadrados;

        switch (escudo) {
            case "s":
                precioEscudo = 2.50;
                break;
            case "n":
                precioEscudo = 0.00;
                break;
        }
        if (escudo.equals("s")) {
            Double precioTotal = precioCentimetroCuadrado + gastosDeEnvio + precioEscudo;
            System.out.printf("Bandera de %-2d cm2:     %9.2f \n", centimetrosCuadrados, precioCentimetroCuadrado);
            System.out.printf("Con escudo:              %8.2f \n", precioEscudo);
            System.out.printf("Gastos de envío:         %8.2f \n", gastosDeEnvio);
            System.out.printf("Total:                   %8.2f \n", precioTotal);

        }
        if (escudo.equals("n")) {
            Double precioTotal = precioCentimetroCuadrado + gastosDeEnvio + precioEscudo;
            System.out.printf("Bandera de %-2d cm2:     %9.2f \n", centimetrosCuadrados, precioCentimetroCuadrado);
            System.out.printf("Sin escudo:              %8.2f \n", precioEscudo);
            System.out.printf("Gastos de envío:         %8.2f \n", gastosDeEnvio);
            System.out.printf("Total:                   %8.2f \n", precioTotal);
        }
        sc.close();
    }
}
