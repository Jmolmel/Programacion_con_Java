/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice
 * 
 * @author José Molina Meléndez
 */

package Ejercicio01;

import java.util.ArrayList;

public class Ejercicio01 {
  public static void main(String[] args) {
    ArrayList<String> alumnos = new ArrayList<String>();

    alumnos.add("Alejandro");
    alumnos.add("Miguel");
    alumnos.add("Nacho");
    alumnos.add("David");
    alumnos.add("Elias");
    alumnos.add("Luis");

    for (String alumno : alumnos) {
      System.out.println(alumno);
    }
  }
}
