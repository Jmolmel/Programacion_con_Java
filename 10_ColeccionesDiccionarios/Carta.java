public class Carta {

  //////// Atributos
  private double puntuacion; // Los numeros tienen su numero como puntuacion y Sota, Caballo y rey medio
                             // punto.
  private String[] palos = { "Oros", "Copas", "Espadas", "Bastos" }; // Oros, Copas, Espadas y Bastos.
  private String[] valores = { "1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey" }; // 1, 2, 3, 4, 5, 6, 7,
                                                                                              // Sota, Caballo y Rey.
  //////// Constructores

  public Carta() {
    this.palos = [(int)(Math.random()*10)];
    this.valores = p[(int)(Math.random()*4)];
    }

  public double getPuntuacion() {
    return puntuacion;
  }

  public void setPuntuacion(double puntuacion) {
    this.puntuacion = puntuacion;
  }

  public String[] getPalos() {
    return palos;
  }

  public void setPalos(String[] palos) {
    this.palos = palos;
  }

  public String[] getValores() {
    return valores;
  }

  public void setValores(String[] valores) {
    this.valores = valores;
  }

}
