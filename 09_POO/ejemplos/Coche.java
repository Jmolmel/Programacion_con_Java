/**
 * POO
 * 
 * @author José Molina Meléndez
 */
public class Coche {

  ///////////////////Atributos
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private int kilometraje; //Kilometraje un coche en particular
  private static int kilometrajeTotal = 0;



  public Coche(String matricula, String marca, String modelo, String color) {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.kilometraje = 0;
  }

  public int getKilometraje() {
    return kilometraje;
  }

  public void recorre(int cantidad){
    this.kilometraje += cantidad;
    kilometrajeTotal += cantidad;
  }
  
}