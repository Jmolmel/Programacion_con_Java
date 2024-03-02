
public class Perro extends Mascota{
  private int totalPerros = 0;

  public Perro(String chip){
    super(chip);
    totalPerros++;
  }
  public Perro(String chip, String nombre){
    super(chip, nombre);
    totalPerros++;
  }

  @Override
  public boolean isVacunada() {
    return super.isVacunada();
  }

  public void ladrar(){
    System.out.println("Guau Guau");
  }

  public void gruñir(){
    System.out.println("Grrrrr");
  }

  public void pasear(){
    if (isVacunada() == false) {
      System.out.println(getNombre() + ", no puede pasear hasta ser vacunado/a.");
    } else {
      ladrar();
    }
  }

  public void vacunar(){
    if (isVacunada() == true) {
      System.out.println(getNombre() + ", ya ha sido vacunado/a.");
    } else {
      setVacunada(true);
      gruñir();
    }
  }
  public int getTotalPerros() {
    return totalPerros;
  }
  public void setTotalPerros(int totalPerros) {
    this.totalPerros = totalPerros;
  }
}
