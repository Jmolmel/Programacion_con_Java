package Ejercicio05_bis;

public class Almacen {

  //Atributos
  private String codigo;
  private String descripcion;
  private int precioCompra;
  private int precioVenta;
  private int stock;

  //Constructores

  public Almacen(String codigo, String descripcion, int precioCompra, int precioVenta, int stock){
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioCompra = precioCompra;
    this.precioVenta = precioVenta;
    this.stock = stock;
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

  public int getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(int precioCompra) {
    this.precioCompra = precioCompra;
  }

  public int getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(int precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return stock;
  }


  public void entradaMercancia(int stock){
    this.stock += stock;
  }
  public void salidaMercancia(int stock){
    this.stock -= stock;
  }

  @Override
  public String toString() {
    String cadena = "=============";
    cadena += codigo;
    cadena += descripcion;
    cadena += precioCompra;
    cadena += precioVenta;
    cadena += stock;
    cadena += "=============";
    return cadena;
  }


  
}
