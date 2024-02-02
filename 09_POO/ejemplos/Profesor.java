/**
 * Clase profesor hereda de persona
 * 
 * @author José Molina Meléndez
 */
public class Profesor extends Persona{   //extends de la superclase persona

  //Atributos
  private String departamento;
  private double sueldo;




  //Constructores
  public Profesor(String nombre, int edad, String dni, String departamento, double sueldo) {
    super(nombre, edad, dni);  //Heredados de Persona
    this.departamento = departamento;
    this.sueldo = sueldo;
  }

  //Metodos
  public String getDepartamento() {
    return departamento;
  }
  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + " [Profesor] Departamento: " + departamento;
  }


  
}



