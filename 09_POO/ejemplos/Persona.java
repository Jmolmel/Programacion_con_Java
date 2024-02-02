/**
 * Clase persona que nos permitira reutilizarla
 * 
 * @author José Molina Meléndez
 */
public class Persona {

  //ATRIBUTOS
  private String nombre;
  private int edad;
  private String dni;

  //CONSTRUCTORES
  /**
   * Este es el constructor
   * @param nombre
   * @param edad
   * @param dni
   */
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  //METODOS
  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public String getDni() {
    return dni;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad: " + edad +  "\tDni: " + dni;
  }

  // public void mostrarDatos(){
  //   System.out.println("Nombre: " + nombre + "\tEdad: " + edad +  "\tDni: " + dni);
  // }
    

}
