package EjercicioCrud;

public class Almacen {
  //Atributos 
  private String codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;


  //Constructor
  public Almacen(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
  }


  //Metodos
  
  public void entradaMercancia(int stock){
    this.stock += stock;
  }

  public String getCodigo() {
    return codigo;
  }


  public void setCodigo(String codigo) {
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


  public void setPrecioCompra(int precioCompra) {
    this.precioCompra = precioCompra;
  }


  public double getPrecioVenta() {
    return precioVenta;
  }


  public void setPrecioVenta(int precioVenta) {
    this.precioVenta = precioVenta;
  }


  public int getStock() {
    return stock;
  }


  public void setStock(int stock) {
    this.stock = stock;
  }


  public void salidaMercancia(int stock){
    this.stock -= stock;
  }

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
