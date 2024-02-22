/**
 * Ejercicio08
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * Ejercicio09
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey
 * @author José Molina Meléndez
 */
package Ejercicio08;
import java.util.ArrayList;
import java.util.Collections;

public class MainCarta {
  public static void main(String[] args) {
    
    ArrayList<Carta> baraja = new ArrayList<>();

    Carta c;

    for (int i = 0; i < 10; i++) {
      do {
        c = new Carta();
      } while (baraja.contains(c));
      baraja.add(c);
    }

    System.out.println("Cartas sin ordenar");
    for (Carta cartaDesornedada : baraja) {
      System.out.println(cartaDesornedada);
    }

    Collections.sort(baraja);

    System.out.println("Cartas ordenadas");
    for (Carta cartaOrdenada : baraja) {
      System.out.println(cartaOrdenada);
    }
  }
}
