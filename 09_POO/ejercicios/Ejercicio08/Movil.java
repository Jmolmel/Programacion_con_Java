package Ejercicio08;

public class Movil extends Terminal{

  //Atributos
  private String tarifa;
  private double totalGastado;

  //Constructores
  public Movil(String numero, String tarifa) {
    super(numero);     //Llamo a la superclase
    this.tarifa = tarifa;
    this.totalGastado = 0;
  }

  //Getters
  public String getTarifa() {
    return tarifa;
  }
  public double getTotalGastado() {
    return totalGastado;
  }

  @Override
  public void llama(Terminal t, int tiempoConversacion){
    super.llama(t, tiempoConversacion);

    double minutos = (double) tiempoConversacion / 60;

    switch (this.tarifa) {
      case "rata":
        totalGastado += minutos * 0.06;
        break;
      case "mono":
      totalGastado += minutos * 0.12;
        break;
      case "bisonte":
      totalGastado += minutos * 0.30;
        break;
      default:
        break;
    }
  }

  @Override
  public String toString() {
    return super.toString() + String.format(" - tarificados %.2f euros", totalGastado);  //USAR String.format para salida formateada en decimal
  }
}
