package Ejercicio05;

public class Pizza {

  //Atributos
  private String tamano;
  private String tipo;
  private String estado = "pedida";
  private static int totalPizzas = 0;
  private static int totalServidas = 0;


  //Constructor
  public Pizza(String tipo, String tamano){
    this.tipo = tipo;
    this.tamano = tamano;
    Pizza.totalPizzas++;
  }
  //Getters
  public String getEstado() {
    return estado;
  }
  public static int getTotalPedidas(){
    return totalPizzas;
  }
  public static int getTotalServidas(){
    return totalServidas;
  }
  //Metodos
  public void sirve(){
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    }
    System.out.println("Esa pizza ya se ha servido");
  }

  //ToString
  @Override
  public String toString() {
    return "Pizza " + tamano + " "  + tipo + " ," + estado;
  }
}
