/**
 * Clase Perro
 * 
 * @author José Molina Meléndez
 */
package clases;

public class Perro extends Mascota{
  //Atributos
  private String raza;
  private static int totalPerros = 0;

  //Constructores
  public Perro(String chip, String nombre) {
    super(chip, nombre);
    totalPerros++;
  }

  public Perro(String chip) {
    super(chip);
    totalPerros++;
  }

  //Metodos
  public String getRaza() {
    return raza;
  }

  //setRaza
  public void setRaza(String raza) {
    this.raza = raza;
  }

  //ladrar
  public void ladrar(){
    System.out.println("¡Guau! ¡Guau!");
  }

  //getTotalPerros
  public static int getTotalPerros() {
    return totalPerros;
  }

  //grunir
  public void grunir(){
    System.out.println("Grrrrrr");
  }

  //pasear
  @Override
  public void pasear(){
    if (!isVacunada()) {
      System.out.println(getNombre() + " no puede pasear hasta no estar vacunado/a.");
    } else {
      ladrar();
      super.pasear();
    }
  }

  //vacunar
  @Override
  public void vacunar(){
    if (isVacunada() == true) {
      System.out.println(getNombre() + " se encuentra vacunado/a.");
    } else {
      super.vacunar(); //setVacunada(true);
      grunir();
    }
  }

  //TOSTRING
  @Override
  public String toString() {
    return super.toString();
  }
}
