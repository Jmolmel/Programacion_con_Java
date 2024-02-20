/**
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 * control de los artículos de un almacén. De cada artículo se debe saber el código,
 * la descripción, el precio de compra, el precio de venta y el stock (número de
 * unidades). El menú del programa debe tener, al menos, las siguientes opciones:
 * 
 * @author José Molina Meléndez
 */
package Ejercicio005;

public class Almacen {

  // Atributos
  private int codigo = 0;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  // Constructores
  Almacen() {
    codigo++; // Cada producto creado tendra un codigo diferente.
  }

  public Almacen(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }

  // Getters y Setters
  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  /**
   * Si coincide el código reestablecerá valores a 0 / null.
   * @param darBaja
   */
  public void darBaja(int codigo) { 
    if (this.codigo == codigo) {
      this.codigo = 0;
      this.descripcion = null;
      this.precioCompra = 0.0;
      this.precioVenta = 0.0;
      this.stock = 0;
    } else {
      System.out.println("El código no existe.");
    }
  }

  public void entradaMercancia(int stock){  //Sumamos mercancia
    this.stock += stock;
  }
  public void salidaMercancia(int stock){   //Restamos mercancia controlando que no sea menor que la que tenemos
    if (this.stock < stock) {
      System.out.println("No dispone de tanta mercancia.");
    } else {
      this.stock -= stock;
    }
  }

  // ToString
  @Override
  public String toString() {
    String cadena = "\n==================";
    cadena += "\nALMACEN";
    cadena += "\nCódigo " + codigo;
    cadena += "\nDescripción: " + descripcion;
    cadena += "\nPrecio de compra: " + precioCompra;
    cadena += "\nPrecio de venta: " + precioVenta;
    cadena += "\nStock actual: " + stock;
    cadena += " \n==================";
    return cadena;
  }

}
