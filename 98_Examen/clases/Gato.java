
public class Gato extends Mascota{

  private String pelaje;
  private int totalGatos = 0;

  public Gato(String chip){
    super(chip);
    totalGatos++;
  }

  public Gato(String chip, String nombre){
    super(chip, nombre);
    totalGatos++;
  }

  public void maulla(){
    System.out.println("Miauuuuuuuuuuuu Brrrrr");
  }

  public void bufar(){
    System.out.println("Fuuuuuuuuuuu");
  }

  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }

  public int getTotalGatos() {
    return totalGatos;
  }

  public void setTotalGatos(int totalGatos) {
    this.totalGatos = totalGatos;
  }

  public void pasear(){
    if (isVacunada() == false) {
      System.out.println(getNombre() + ", no puede pasear hasta ser vacunado/a.");
    } else {
      maulla();
    }
  }

  public void vacunar(){
    if (isVacunada() == true) {
      System.out.println(getNombre() + ", ya ha sido vacunado.");
    } else {
      setVacunada(true);
      bufar();
    }
  }
}
