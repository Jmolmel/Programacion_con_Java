public abstract class Mascota implements MascotaInterface{
  //Atributos
  private String chip;
  private String nombre;
  private int edad;
  private boolean vacunada = false;
  protected static int totalMascotas = 0;

  

  public Mascota(String chip) {
    this.chip = chip;
    totalMascotas++;
  }
  

  public Mascota(String chip, String nombre) {
    this.chip = chip;
    this.nombre = nombre;
    totalMascotas++;
  }


  public String getChip() {
    return chip;
  }


  public void setChip(String chip) {
    this.chip = chip;
  }


  public String getNombre() {
    return nombre;
  }


  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public int getEdad() {
    return edad;
  }


  public void setEdad(int edad) {
    this.edad = edad;
  }


  public boolean isVacunada() {
    return vacunada;
  }


  public void setVacunada(boolean vacunada) {
    this.vacunada = vacunada;
  }


  //Interface
  public void pasear(){

  }

  //Metodo vacunar
  public void vacunar(String chip){
    if (this.chip.equals(chip)) {
      this.vacunada = true;
    } else {
      System.out.println("El chip introducido no existe.");
    }
  }
}
