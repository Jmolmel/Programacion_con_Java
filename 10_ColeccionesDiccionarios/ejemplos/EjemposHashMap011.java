/**
 * Uso del método get con HasMap
 * 
 * @author José Molina Meléndez
 */
import java.util.HashMap;

public class EjemposHashMap011 {
  public static void main(String[] args) {
        
    HashMap<Integer, String> m = new HashMap<>();
    int clave;

    m.put(924, "Pep Guardiola");
    m.put(219, "Ronaldinho");
    m.put(199, "Xavi");
    m.put(123, "Samuél Etó");
    m.put(632, "Eríc Abidal");


    System.out.println(m.keySet()); //Muestra las claves
    System.out.println(m.values()); //Muesta los valores
    System.out.println("Introduce la clave: ");
    clave = Integer.parseInt(System.console().readLine());
    System.out.println("Su valor es: " + m.get(clave));


  }
}
