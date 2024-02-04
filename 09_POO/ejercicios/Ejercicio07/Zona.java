/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas 
 * disponibles y la zona vip.
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.
 * 
 * @author José Molina Meléndez
 */
package Ejercicio07;

public class Zona {

  //Atributos
  private int entradasPorVender;

  public Zona(int entradasPorVender) {
    this.entradasPorVender = entradasPorVender;
  }

  public int getEntradasPorVender() {
    return entradasPorVender;
  }

  /**
   * Vende un número de entradas
   * Comprueba si quedan entradas libres antes de realizar la venta
   * @param n
   */
  public void vender(int n){
    if (this.entradasPorVender == 0) {
      System.out.println("Las entradas están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Solo me quedan " + this.entradasPorVender + " entradas para esa zona.");
    }
    if (this.entradasPorVender >= n) {
      this.entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas.");
    }
  }
  
  @Override
  public String toString() {
    return " entradas disponibles: " + entradasPorVender;
  }
}
