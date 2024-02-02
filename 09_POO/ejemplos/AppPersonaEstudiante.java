/**
 * Clase que contendrá el metodo main para probar la herencia
 * 
 * @author José Molina Meléndez
 */
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    Persona p = new Persona("Pepe Rodriguez", 30, "123456789A");
    Estudiante e = new Estudiante("Paula Gomez", 21, "55554444B");
    Profesor prof = new Profesor("Juan Alberto", 33, "44444444", "Programacion", 10000.25);

    System.out.println(p.toString());
    System.out.println(p);

    System.out.println(e.toString());
    System.out.println(e);

    System.out.println(prof.toString());
    System.out.println(prof);

  }
}
