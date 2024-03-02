/**
 * Clase Mascota
 * 
 * @author José Molina Meléndez
 */
package clases;

public abstract class Mascota { //implements MascotaInterface
  //Atributos
  private String chip;
  private String nombre;
  private int edad;
  private boolean vacunada = false;
  private static int totalMascotas = 0;

  
  //Constructor CHIP Y NOMBRE
  public Mascota(String chip, String nombre) {
    this.chip = chip;
    this.nombre = nombre;
    totalMascotas++;
  }


  //Constructor CHIP
  public Mascota(String chip) {
    this.chip = chip;
    totalMascotas++;
  }


  //Metodos
  public void pasear(){
    System.out.println("Estoy paseado.");
  }


  //vacunar
  public void vacunar(){
    this.vacunada = true;
  }

  //getVacunada
  public boolean isVacunada() {
    return vacunada;
  }

  //getChip
  public String getChip() {
    return chip;
  }

  //getNombre
  public String getNombre() {
    return nombre;
  }

  //getEdad
  public int getEdad() {
    return edad;
  }

  //setEdad
  public void setEdad(int edad) {
    this.edad = edad;
  }

  //setVacunada
  public void setVacunada(boolean vacunada) {
    this.vacunada = vacunada;
  }

  //totalMascotas
  public static int getTotalMascotas() {
    return totalMascotas;
  }

  //TOSTRING
  @Override
  public String toString() {
    return "Mascota [" + chip + "]: " + nombre + ", " + edad + " años";
  }
  
}
