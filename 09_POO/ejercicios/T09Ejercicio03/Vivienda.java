package T09Ejercicio03;

public class Vivienda {

  //Atributos
  private String propietario;
  private double precio;
  private Terreno terreno;

  public enum Terreno {
  URBANO, RURAL, COSTERO;
  }

  //Constructores 
  public Vivienda(String propietario, double precio, Terreno terreno) {
    this.propietario = propietario;
    this.precio = precio;
    this.terreno = terreno;
  }

  //Metodos

  public double getPrecio() {
    return precio;
  }
  public String getPropietario() {
    return propietario;
  }
  public Terreno getTerreno() {
    return terreno;
  }
    
  @Override
  public String toString() {
    return "El propietario es " + propietario + ", la vivienda tiene un precio de " + precio + " y está construido en un terreno tipo  " + terreno + " ";
  }
} 
