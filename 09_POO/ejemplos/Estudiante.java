/**
 * Clase estudiante que hereda de la clase persona.
 * 
 * @author José Molina Meléndez
 */
  public class Estudiante extends Persona {  //usamos extends para llamar a la SUPERCLASE en este caso persona
  
  //ATRIBUTOS
  private int creditos;

    //Constructores
  public Estudiante(String nombre, int edad, String dni){
    super(nombre, edad , dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos){
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int getCreditos() {
    return creditos;
  }

  @Override
  public String toString() {
    return super.toString() + " [Estudiante] Créditos: " + creditos;
  }
  

  
  // @Override
  // public void mostrarDatos(){
  //   super.mostrarDatos(); // Llama mostrarDatos() de la superclase
  // }

}

