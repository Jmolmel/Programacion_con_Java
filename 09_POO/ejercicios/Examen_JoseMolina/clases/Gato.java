/**
 * Clase gato
 * 
 * @author José Molina Meléndez
 */
package clases;

public class Gato extends Mascota{
  //Atributo
  private String pelaje;
  private static int totalGatos = 0;


  //Constructores
  public Gato(String chip, String nombre) {
    super(chip, nombre);
    totalGatos++;
  }

  public Gato(String chip) {
    super(chip);
    totalGatos++;
  }


  //Metodos

  public void maullar(){
    System.out.println("¡Miauuuuuuuuuu! Brrrrr....");
  }

  public void bufar(){
    System.out.println("Fuuuuuuuuu...");
  }

  public static int getTotalGatos() {
    return totalGatos;
  }
  
  public String getPelaje() {
    return pelaje;
  }

  public void setPelaje(String pelaje) {
    this.pelaje = pelaje;
  }
  
  //pasear
  @Override
  public void pasear(){
    if (!isVacunada()) {
      System.out.println(getNombre() + " no puede pasear hasta no estar vacunado/a");
    } else {
      maullar();
      super.pasear();
    }
  }
  //vacunar
  @Override
  public void vacunar(){
    if (isVacunada() == true) {
      System.out.println(getNombre() + " se encuentra vacunado/a");
    } else {
      super.vacunar();
      bufar();
    }
  }

  //TOSTRING
  @Override
  public String toString() {
    return super.toString();
  }
  
}
