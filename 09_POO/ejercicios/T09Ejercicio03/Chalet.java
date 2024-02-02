package T09Ejercicio03;

public class Chalet extends Vivienda {

  // Atributos
  private int numeroChalet;
  private boolean garaje;
  private boolean piscina;

  public Chalet(String propietario, double precio, Terreno terreno, int numeroChalet, boolean garaje, boolean piscina) {
    super(propietario, precio, terreno);
    this.numeroChalet = numeroChalet;
    this.garaje = garaje;
    this.piscina = piscina;
  }

  public int getNumeroChalet() {
    return numeroChalet;
  }

  public boolean isGaraje() {
    return garaje;
  }

  public boolean isPiscina() {
    return piscina;
  }

  @Override
  public String toString() {
    return super.toString() + "El número del chalet es:  " + numeroChalet;
  }

}
