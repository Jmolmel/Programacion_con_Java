/**
 *
 * Escribe un programa que calcule el total de una factura
 *  a partir de la base imponible (precio sin IVA). 
 * La base imponible estará almacenada en una variable
 * 
 * @author Jose Molina Melendez
 * 
 */
public class T02Ejercicio06 {
  public static void main(String[] args){  //snipet main o psvm
    double baseImponible = 22.75;
    //podria haber creado una variable que calcule el iva doubleI mporteIVA = (baseImponible *0.21)
    //y despues sumar en el ultimo prim baseImponible + ImporteIVA
    System.out.printf("Base imponible %8.2f\n", baseImponible);
    System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
    System.out.printf("--------------------\n");
    System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
  } 
  
}
