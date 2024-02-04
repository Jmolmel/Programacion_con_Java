/**
 * El menú del programa debe ser el que se muestra a continuación. Cuando
 * elegimos la opción 2, se nos debe preguntar para qué zona queremos las
 * entradas y cuántas queremos. Lógicamente, el programa debe controlar que
 * no se puedan vender más entradas de la cuenta.
 * 
 * @author José Molina Meléndez
 */
package Ejercicio07;

public class AppEntradas {
  public static void main(String[] args) {
    
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    System.out.println("BIENVENIDO A LA EXPO CAMPANILLAS");
    


    boolean salida = false;
    do {
      System.out.println("ELIJA SU OPCION:");    
      System.out.println("1. Mostrar número de entradas libres\r");
      System.out.println("2. Comprar entradas");
      System.out.println("3. Salir");
      int eleccion = Integer.parseInt(System.console().readLine());
      System.out.println();
      switch (eleccion) {
        case 1:
          System.out.println("Mostrando entradas disponibles:");
          System.out.println("Zona principal" + principal.toString());
          System.out.println("Zona compra-venta" +compraVenta.toString());
          System.out.println("Zona VIP" +vip.toString());
          break;
        case 2:
          System.out.println("¿Qué zona desea elegir?(1. principal | 2. Compra-venta | 3. Vip)");
          int zonaComprar = Integer.parseInt(System.console().readLine());
          int numeroEntradas = 0;
          switch (zonaComprar) {
            case 1:
            System.out.println("Introduzca cuantas desea comprar");
            numeroEntradas = Integer.parseInt(System.console().readLine());
              principal.vender(numeroEntradas);
              break;
            case 2:
              System.out.println("Introduzca cuantas desea comprar");
              numeroEntradas = Integer.parseInt(System.console().readLine());
              compraVenta.vender(numeroEntradas);
              break;
            case 3:
              System.out.println("Introduzca cuantas desea comprar");
              numeroEntradas = Integer.parseInt(System.console().readLine());
              vip.vender(numeroEntradas);
              break;
            default:
            System.out.println("Esa eleccion es incorrecta. Intentelo de nuevo.");
              break;
          }
          break;
        case 3:
          salida = true;
          break;
        default:
        System.out.println("Esa eleccion es incorrecta. Intentelo de nuevo.");
          break;
      }
    } while (!salida);
    System.out.println("GRACIAS POR SU COMPRA");
  }
}
